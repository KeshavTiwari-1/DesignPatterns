package org.example.designparkinglot.payment;

import java.util.UUID;

public class PaymentReceipt {
    private String id;
    private Integer amount;
    private String transactionId;
    private String mode;

    public PaymentReceipt(Integer amount, String mode) {
        id = UUID.randomUUID().toString();
        this.amount = amount;
        transactionId = UUID.randomUUID().toString();
        this.mode = mode;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        id = java.util.UUID.randomUUID().toString();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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
