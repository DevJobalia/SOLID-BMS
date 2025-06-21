package CODE.Domain.Model;

import java.util.List;

import CODE.Domain.Enum.PaymentStatus;

public class Booking {
    private String bookingID;
    private Show show;
    private List<Seat> seats;
    private PaymentStatus paymentStatus;

    public boolean cancel(){
        return false;
    }

    public double getTotalPrice() {
        return 0.0;
    }
}
