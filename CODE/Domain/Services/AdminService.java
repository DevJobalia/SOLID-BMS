package CODE.Domain.Services;

import CODE.Domain.Exceptions.UserHasNoAdminRightsException;
import CODE.Domain.Model.Movie;
import CODE.Domain.Model.User.AUser;
import CODE.Domain.Model.User.Admin;
import CODE.Infrastructure.Repository.MovieRepository.MovieRepository;

public class AdminService {
    private final MovieRepository movieRepository;

    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    private void validateAdmin(AUser user) {
        if (!(user instanceof Admin)) {
            throw new UserHasNoAdminRightsException("Access denied: User is not an admin.");
        }
    }

    public void addMovie(AUser user, Movie movie) {
        validateAdmin(user);
        movieRepository.save(movie);
    }

    // Future: add deleteMovie, updateShow, etc. with similar validation
}
