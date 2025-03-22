package com.example.payments_apigee_service.model;

public class PaymentDetails {
    private String account_holder_payer;
    private String account_holder_receiver;
    private int amount;
    private String currency;

    // Getters and setters
    public String getAccount_holder_payer() {
        return account_holder_payer;
    }

    public void setAccount_holder_payer(String account_holder_payer) {
        this.account_holder_payer = account_holder_payer;
    }

    public String getAccount_holder_receiver() {
        return account_holder_receiver;
    }

    public void setAccount_holder_receiver(String account_holder_receiver) {
        this.account_holder_receiver = account_holder_receiver;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
