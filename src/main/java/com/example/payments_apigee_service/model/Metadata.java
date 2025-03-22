package com.example.payments_apigee_service.model;

public class Metadata {
    private String timestamp;
    private String payer_account_location;
    private String receiver_account_location;

    // Getters and setters
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPayer_account_location() {
        return payer_account_location;
    }

    public void setPayer_account_location(String payer_account_location) {
        this.payer_account_location = payer_account_location;
    }

    public String getReceiver_account_location() {
        return receiver_account_location;
    }

    public void setReceiver_account_location(String receiver_account_location) {
        this.receiver_account_location = receiver_account_location;
    }
}
