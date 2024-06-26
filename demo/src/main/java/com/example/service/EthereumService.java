package com.example.service;

import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import com.example.dto.response.BalanceResponse;
import com.example.dto.response.TransactionResponse;
import com.example.dto.response.WalletResponse;
import com.example.model.Transaction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class EthereumService {

    private Web3j web3j;
    private Credentials credentials;

    public EthereumService() {
        this.web3j = Web3j.build(new HttpService("https://mainnet.infura.io/v3/YOUR-PROJECT-ID"));
    }

    public WalletResponse connectWallet(String privateKey) {
        try {
            credentials = Credentials.create(privateKey);
            String address = credentials.getAddress();
            return new WalletResponse(address, "успішно");
        } catch (Exception e) {
            return new WalletResponse(null, "невдало");
        }
    }

    public TransactionResponse sendToken(String toWallet, BigDecimal amount) {
        try {
            TransactionReceipt transactionReceipt = Transfer.sendFunds(
                    web3j, credentials, toWallet,
                    amount, Convert.Unit.ETHER).send();
            return new TransactionResponse(transactionReceipt.getTransactionHash(), "успішно");
        } catch (Exception e) {
            return new TransactionResponse(null, "невдало");
        }
    }

    public List<Transaction> getTransactions(String walletAddress) {
        // Тут потрібно реалізувати логіку отримання транзакцій.
        // Це може вимагати використання додаткових API або сервісів, оскільки Ethereum не зберігає повну історію транзакцій.
        return new ArrayList<>();
    }

    public BalanceResponse getBalance(String walletAddress) {
        try {
            EthGetBalance ethGetBalance = web3j.ethGetBalance(walletAddress, DefaultBlockParameterName.LATEST).send();
            BigInteger wei = ethGetBalance.getBalance();
            BigDecimal ethBalance = Convert.fromWei(new BigDecimal(wei), Convert.Unit.ETHER);
            return new BalanceResponse(ethBalance, "успішно");
        } catch (Exception e) {
            return new BalanceResponse(BigDecimal.ZERO, "невдало");
        }
    }
}