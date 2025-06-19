package org.example.designparkinglot.exit;

import org.example.designparkinglot.entry.EntryPass;
import org.example.designparkinglot.payment.PaymentReceipt;
import org.example.designparkinglot.util.PrintUtils;

public class ExitGateManager {
    private ExitGate exitGate;

    public ExitGateManager(ExitGate exitGate) {
        this.exitGate = exitGate;
    }

    public void handleExit(EntryPass entryPass){
        Integer amount = exitGate.calculatePayment(entryPass.getTicket());
        PaymentReceipt paymentReceipt = exitGate.collectPayment(amount);
        exitGate.vacateParkingSpot(entryPass.getParkingSpot());
        PrintUtils.printMessage("Exit Successful" , this.getClass().getName());
    }
}
