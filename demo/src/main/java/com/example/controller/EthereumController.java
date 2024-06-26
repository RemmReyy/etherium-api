package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
import com.example.dto.request.WalletRequest;
import com.example.dto.response.WalletResponse;
import com.example.model.Transaction;
import com.example.service.EthereumService;
import com.example.dto.response.BalanceResponse;
import com.example.dto.response.TransactionResponse;
import com.example.dto.request.TransactionRequest;

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