package com.example.loan.model;

import lombok.Value;

@Value
public class LoanApplicationResult {
    private LoanApplicationStatus loanApplicationStatus;

    private String rejectionReason;
}
