package org.example.designparkinglot.exit;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.parkingspotmanager.ParkingSpotManager;
import org.example.designparkinglot.payment.PaymentReceipt;
import org.example.designparkinglot.ticket.Ticket;

public class ExitGateImpl implements ExitGate{

    private ParkingSpotManager parkingSpotManager;
    private

    @Override
    public Integer calculatePayment(Ticket ticket) {
        return 0;
    }

    @Override
    public PaymentReceipt collectPayment(Integer amount) {
        return null;
    }

    @Override
    public void vacateParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotManager.vacate(parkingSpot);
    }
}
