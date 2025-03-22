package com.example.payments_apigee_service.model;

import java.util.Map;

public class PaymentRequest {
    private String id;
    private PaymentDetails payment_details;
    private Metadata metadata;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PaymentDetails getPayment_details() {
        return payment_details;
    }

    public void setPayment_details(PaymentDetails payment_details) {
        this.payment_details = payment_details;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
