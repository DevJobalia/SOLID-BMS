package CODE;

import java.util.ArrayList;
import java.util.Optional;

import CODE.Domain.Enum.Genre;
import CODE.Domain.Model.Movie;
import CODE.Domain.Model.Theatre;
import CODE.Domain.Model.User.Admin;
import CODE.Domain.Services.AdminService;
import CODE.Infrastructure.Repository.MovieRepository.MovieRepository;
import CODE.Infrastructure.Repository.TheatreRepository.*;

class App {
    public static void main(String[] args) {        
        System.out.println("START");
        MovieRepository movieRepository = new MovieRepository();
        ITheatreRepository theatreRepo = new TheatreRepository();

        AdminService adminService = new AdminService(movieRepository);
        Admin admin = new Admin.AdminBuilder("dev1", "devkjobalia1@gmail.com", "admin123").setName("Dev Jobalia").build();
        
        flow1(movieRepository, admin, adminService);

        

    }    

    public static void flow1(MovieRepository movieRepo, Admin admin, AdminService adminService){
        // -- ADMIN FLOW --
        // 1. ADD MOVIE
        // 2. CREATE ADMIN
        // 3. CREATE MOVIE, ADD MOVIE
        Movie inception = new Movie.Builder()
        .setMovieID("M001")
        .setTitle("Inception")
        .setGenre(Genre.SCI_FI)
        .setDuration(148.0f)
        .setRating(8.8f)
        .build();

        adminService.addMovie(admin, inception);

        // 4. GET LIST OF ALL MOVIE
        System.out.println("getting all movies");
        for(Movie movie : adminService.getAllMovie(admin)){
            System.out.println("* " + movie.getTitle());

        }
        // 5. UPDATE MOVIE
        // 6. DELETE MOVIE        
    }

    public static void flow2(TheatreRepository theatreRepo){
        // -- THEATRE FLOW
        // 1. create theatre repo
        // 2. create theatre
        Theatre t1 = new Theatre("T001", "PVR Inox", "Mumbai", new ArrayList<>());
        theatreRepo.save(t1);
        // 3. FIND ONE THEATRE
        Optional<Theatre> found = theatreRepo.findById("T001");
        found.ifPresent(theatre -> System.out.println("Found: " + theatre.getTheatreID()));
        // 4. add screens
        // 5. set movies for a show
        // 6. set show on a screen
    }
}