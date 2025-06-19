package org.example.designparkinglot.payment;

public interface PaymentCollectService {
    PaymentReceipt collectPayment(Integer amount);
}
