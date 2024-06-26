package com.example.dto.response;

public class WalletResponse {
    private String walletAddress;
    private String status;

    // Constructor
    public WalletResponse(String walletAddress, String status) {
        this.walletAddress = walletAddress;
        this.status = status;
    }

    // Getters and Setters
    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
