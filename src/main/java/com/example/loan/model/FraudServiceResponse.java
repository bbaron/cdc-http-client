package com.example.loan.model;

import lombok.Value;

@Value
public class FraudServiceResponse {
    private FraudCheckStatus fraudCheckStatus;
    private String rejectionReason;

}
