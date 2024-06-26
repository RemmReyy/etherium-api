package com.example.demo.dto.request;

import java.math.BigDecimal;

public class TransactionRequest {
    private String toWallet;
    private BigDecimal amount;

    // Constructor
    public TransactionRequest(String toWallet, BigDecimal amount) {
        this.toWallet = toWallet;
        this.amount = amount;
    }

    // Getters and Setters
    public String getToWallet() {
        return toWallet;
    }

    public void setToWallet(String toWallet) {
        this.toWallet = toWallet;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}