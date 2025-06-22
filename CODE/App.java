package CODE;

import CODE.Domain.Model.User.Admin;
import CODE.Infrastructure.Repository.MovieRepository.MovieRepository;

class App {
    public static void main(String[] args) {        
        MovieRepository movieRepository = new MovieRepository();
        Admin admin = new Admin.AdminBuilder(movieRepository, "dev1", "devkjobalia1@gmail.com", "admin123").setName("Dev Jobalia").build();
        admin.adminService.addMovie(null);
    }    
}