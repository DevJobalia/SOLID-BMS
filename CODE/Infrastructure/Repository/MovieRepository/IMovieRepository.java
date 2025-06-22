package CODE.Infrastructure.Repository.MovieRepository;


import java.util.List;
import java.util.Optional;

import CODE.Domain.Model.Movie;

public interface IMovieRepository {
    void save(Movie movie);
    Optional<Movie> findById(String movieId);
    List<Movie> findAll();
    void deleteById(String movieId);
    void update(Movie updatedMovie);
}
