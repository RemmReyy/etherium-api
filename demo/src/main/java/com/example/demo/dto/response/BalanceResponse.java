package com.example.demo.dto.response;

import java.math.BigDecimal;

public class BalanceResponse {
    private BigDecimal balance;
    private String status;

    // Constructor
    public BalanceResponse(BigDecimal balance, String status) {
        this.balance = balance;
        this.status = status;
    }

    // Getters and Setters
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
