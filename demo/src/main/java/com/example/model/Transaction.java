package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String transactionHash;
    private String from;
    private String to;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    // Constructor
    public Transaction(String transactionHash, String from, String to, BigDecimal amount, LocalDateTime timestamp) {
        this.transactionHash = transactionHash;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    // ... (add getters and setters for all fields)
}
