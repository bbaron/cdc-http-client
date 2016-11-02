package com.example.loan.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class FraudServiceRequest {
    private String clientId;

    private BigDecimal loanAmount;

    public FraudServiceRequest() {
    }

    public FraudServiceRequest(LoanApplication loanApplication) {
        this.clientId = loanApplication.getClient().getPesel();
        this.loanAmount = loanApplication.getAmount();
    }

}
