package CODE.Infrastructure.Repository.MovieRepository;

import java.util.*;

import CODE.Domain.Exceptions.MovieAlreadyExistsException;
import CODE.Domain.Exceptions.MovieNotFoundException;
import CODE.Domain.Model.Movie;

public class MovieRepository implements IMovieRepository  {


    private final Map<String, Movie> movieStore = new HashMap<>();

    @Override
    public void save(Movie movie) {
        String movieID = movie.getId();
        if(movieStore.containsKey(movieID)){
            throw new MovieAlreadyExistsException(movieID);
        }
        movieStore.put(movie.getId(), movie);
    }

    @Override
    public Optional<Movie> findById(String movieId) {
        if(movieStore.containsKey(movieId)){
            throw new MovieNotFoundException(movieId);
        }
        return Optional.ofNullable(movieStore.get(movieId));
    }

    @Override
    public List<Movie> findAll() {
        return new ArrayList<>(movieStore.values());
    }

    @Override
    public void deleteById(String movieId) {        
        if(movieStore.containsKey(movieId)){
            throw new MovieNotFoundException(movieId);
        }
        movieStore.remove(movieId);
    }

    @Override
    public void update(Movie updatedMovie) {
        String id = updatedMovie.getId();
        
        if(movieStore.containsKey(id)){
            throw new MovieNotFoundException(id);
        }
        if (movieStore.containsKey(id)) {
            movieStore.put(id, updatedMovie);
        } else {
            throw new NoSuchElementException("Movie not found: " + id);
        }
    }
    
}
