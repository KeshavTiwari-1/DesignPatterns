package org.example.designparkinglot.payment;

import org.example.designparkinglot.ticket.Ticket;

public class PaymentCalculationServiceImpl implements PaymentCalculationService {
    @Override
    public Integer calculatePayment(Ticket ticket) {
        return 10;
    }
}
