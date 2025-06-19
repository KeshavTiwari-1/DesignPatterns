package org.example.designparkinglot.payment;

public class PaymentReceipt {
    private String id;
    private String amount;
    private String transactionId;
    private String mode;

    public String getId() {
        return id;
    }

    public void setId() {
        id = java.util.UUID.randomUUID().toString();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
