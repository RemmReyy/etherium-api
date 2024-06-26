package com.example.dto.request;

public class WalletRequest {
    private String privateKey;

    // Constructor
    public WalletRequest(String privateKey) {
        this.privateKey = privateKey;
    }

    // Getter and Setter
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}