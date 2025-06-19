package org.example.designparkinglot.exit;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.parkingspotmanager.ParkingSpotManager;
import org.example.designparkinglot.payment.PaymentCalculationService;
import org.example.designparkinglot.payment.PaymentCollectService;
import org.example.designparkinglot.payment.PaymentReceipt;
import org.example.designparkinglot.ticket.Ticket;

public class ExitGateImpl implements ExitGate{

    private ParkingSpotManager parkingSpotManager;
    private PaymentCalculationService paymentCalculationService;
    private PaymentCollectService paymentCollectService;

    public ExitGateImpl(ParkingSpotManager parkingSpotManager, PaymentCalculationService paymentCalculationService, PaymentCollectService paymentCollectService) {
        this.parkingSpotManager = parkingSpotManager;
        this.paymentCalculationService = paymentCalculationService;
        this.paymentCollectService = paymentCollectService;
    }

    @Override
    public Integer calculatePayment(Ticket ticket) {
        return paymentCalculationService.calculatePayment(ticket);
    }

    @Override
    public PaymentReceipt collectPayment(Integer amount) {
        return paymentCollectService.collectPayment(amount);
    }

    @Override
    public void vacateParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotManager.vacate(parkingSpot);
    }
}
