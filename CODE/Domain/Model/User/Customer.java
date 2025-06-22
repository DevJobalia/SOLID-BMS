package CODE.Domain.Model.User;

import java.util.List;

import CODE.Domain.Model.Booking;
import CODE.Domain.Model.Payment.APaymentMode;
import CODE.Domain.Model.Payment.PaymentResult;

public class Customer extends AUser{
    private List<APaymentMode> savedPaymentModes;
    private List<Booking> bookings; // all bookings - saved, cancelled, refunded
    private List<PaymentResult>  successfullBookings;

    public Customer(String userID, String name, String email) {
        super(userID, name, email);
    }

    // TODO: FUNCTIONS
}
