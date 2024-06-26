package com.example.demo.dto.response;

public class TransactionResponse {
    private String transactionHash;
    private String status;

    // Constructor
    public TransactionResponse(String transactionHash, String status) {
        this.transactionHash = transactionHash;
        this.status = status;
    }

    // Getters and Setters
    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
