package com.example.payments_apigee_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.example.payments_apigee_service.model.PaymentRequest;
import com.example.payments_apigee_service.model.PaymentResponse;
import com.example.payments_apigee_service.model.ValidationResponse;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${validation.service.url}")
    private String validationServiceUrl;

    @Value("${backend.service.url}")
    private String backendServiceUrl;

    @PostMapping
    public ResponseEntity<?> handlePayment(@RequestBody PaymentRequest request) {
        // Call validation service
        ResponseEntity<ValidationResponse> validationResponse = restTemplate.postForEntity(validationServiceUrl, request, ValidationResponse.class);

        // Check validation status
        if (!"VALID".equals(validationResponse.getBody().getStatus())) {
            return ResponseEntity.ok(validationResponse.getBody());
        }

        // Call backend service
        ResponseEntity<PaymentResponse> paymentResponse = restTemplate.postForEntity(backendServiceUrl, request, PaymentResponse.class);

        return ResponseEntity.ok(paymentResponse.getBody());
    }
}
