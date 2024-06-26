package com.example.demo.model;

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
    public String getTransactionHash(){
        return transactionHash;
    }
    public void setTransactionHash(String transactionHash){
        this.transactionHash = transactionHash;
    }
    public String getFrom(){
        return from;
    }
    public void setFrom(String from){
        this.from = from;
    }
    public String getTo(){
        return to;
    }
    public void setTo(String to){
        this.to = to;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }
}
