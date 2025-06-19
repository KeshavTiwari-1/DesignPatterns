package org.example.designparkinglot.exit;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.payment.PaymentReceipt;
import org.example.designparkinglot.ticket.Ticket;

public interface ExitGate {
    Integer calculatePayment(Ticket ticket);
    PaymentReceipt collectPayment(Integer amount);
    void vacateParkingSpot(ParkingSpot parkingSpot);
}
