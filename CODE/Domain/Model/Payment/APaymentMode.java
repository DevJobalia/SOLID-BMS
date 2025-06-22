package CODE.Domain.Model.Payment;

import CODE.Domain.Enum.PaymentType;

public abstract class APaymentMode {
    private int modeID;
    private PaymentType paymentType;

    public abstract PaymentResult process(double amount);
}
