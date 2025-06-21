package CODE.Domain.Model;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    private String showID;
    private Movie movie;
    private LocalDateTime startTime;
    private List<Seat> avaiableSeats;
    
public Booking bookSeats() {
    return new Booking();
}
}
