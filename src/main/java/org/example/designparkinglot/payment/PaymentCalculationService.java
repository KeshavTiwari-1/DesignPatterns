package org.example.designparkinglot.payment;

import org.example.designparkinglot.ticket.Ticket;

public interface PaymentCalculationService {
    Integer calculatePayment(Ticket ticket);
}
