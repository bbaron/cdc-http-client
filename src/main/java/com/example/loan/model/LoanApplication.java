package com.example.loan.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class LoanApplication {
    private Client client;

    private BigDecimal amount;

    private String loanApplicationId;

    public LoanApplication(Client client, double amount) {
        this.client = client;
        this.amount = BigDecimal.valueOf(amount);
    }
}
