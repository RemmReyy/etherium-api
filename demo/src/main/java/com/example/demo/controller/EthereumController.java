package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

import com.example.demo.dto.request.TransactionRequest;
import com.example.demo.dto.request.WalletRequest;
import com.example.demo.dto.response.BalanceResponse;
import com.example.demo.dto.response.TransactionResponse;
import com.example.demo.dto.response.WalletResponse;
import com.example.demo.model.Transaction;
import com.example.demo.service.EthereumService;

@RestController
@RequestMapping("/api")
public class EthereumController {

    @Autowired
    private EthereumService ethereumService;

    @PostMapping("/connectWallet")
    public WalletResponse connectWallet(@RequestBody WalletRequest request) {
        return ethereumService.connectWallet(request.getPrivateKey());
    }

    @PostMapping("/sendToken")
    public TransactionResponse sendToken(@RequestBody TransactionRequest request) {
        return ethereumService.sendToken(request.getToWallet(), request.getAmount());
    }

    @GetMapping("/getTransactions")
    public List<Transaction> getTransactions(@RequestParam String walletAddress) {
        return ethereumService.getTransactions(walletAddress);
    }

    @GetMapping("/getBalance")
    public BalanceResponse getBalance(@RequestParam String walletAddress) {
        return ethereumService.getBalance(walletAddress);
    }
}