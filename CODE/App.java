package CODE;

import CODE.Domain.Enum.Genre;
import CODE.Domain.Model.Movie;
import CODE.Domain.Model.User.Admin;
import CODE.Domain.Services.AdminService;
import CODE.Infrastructure.Repository.MovieRepository.MovieRepository;

class App {
    public static void main(String[] args) {        
        MovieRepository movieRepository = new MovieRepository();
        AdminService adminService = new AdminService(movieRepository);
        Admin admin = new Admin.AdminBuilder("dev1", "devkjobalia1@gmail.com", "admin123").setName("Dev Jobalia").build();
        
        Movie inception = new Movie.Builder()
        .setMovieID("M001")
        .setTitle("Inception")
        .setGenre(Genre.SCI_FI)
        .setDuration(148.0f)
        .setRating(8.8f)
        .build();

        adminService.addMovie(admin, inception);
    }    

    public static void flow1(){
        // -- ADMIN FLOW --
        // 1. ADD MOVIE
        // 2. CREATE ADMIN
        // 3. CREATE MOVIE
        // 4. GET LIST OF ALL MOVIE
        // 5. UPDATE MOVIE
        // 6. DELETE MOVIE
        // 7. SET MOVIE TO SHOW / SCREEN / THEATRE        
    }
}