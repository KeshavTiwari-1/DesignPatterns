package org.example.designparkinglot.payment;

public class PaymentCollectServiceImpl implements PaymentCollectService {

    private static final String MODE = "DEFAULT_MODE";

    @Override
    public PaymentReceipt collectPayment(Integer amount) {
        return new PaymentReceipt(amount, MODE);

    }
}
