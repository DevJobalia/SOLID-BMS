package CODE.Domain.Model;

import java.util.*;

import CODE.Domain.Enum.SeatType;

public class Screen {
    private String screenID;
    private String screenNumber;
    private List<Seat> seats;
    private Theatre theatre;

    public Map<SeatType, List<Seat>> getSeatMap(){
        return new HashMap<>();
    }
}
