package CODE.Domain.Services;

import CODE.Domain.Model.Movie;
import CODE.Infrastructure.Repository.MovieRepository.MovieRepository;

public class AdminService {
    private final MovieRepository movieRepository;

    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    // More functions like deleteMovie, updateShow etc.
}