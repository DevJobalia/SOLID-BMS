package CODE.Domain.Exceptions;

    public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String movieId) {
        super("Movie with ID " + movieId + " already exists.");
    }
}
