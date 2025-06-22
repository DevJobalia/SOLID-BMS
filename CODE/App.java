package CODE;

import CODE.Domain.Enum.Genre;
import CODE.Domain.Model.Movie;
import CODE.Domain.Model.User.Admin;
import CODE.Infrastructure.Repository.MovieRepository.MovieRepository;

class App {
    public static void main(String[] args) {        
        MovieRepository movieRepository = new MovieRepository();
        
        Admin admin = new Admin.AdminBuilder(movieRepository, "dev1", "devkjobalia1@gmail.com", "admin123").setName("Dev Jobalia").build();
        
        Movie inception = new Movie.Builder()
        .setMovieID("M001")
        .setTitle("Inception")
        .setGenre(Genre.SCI_FI)
        .setDuration(148.0f)
        .setRating(8.8f)
        .build();

        admin.adminService.addMovie(inception);
    }    
}