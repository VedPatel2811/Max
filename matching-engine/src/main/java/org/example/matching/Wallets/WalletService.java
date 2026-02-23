package org.example.matching.Wallets;

import org.example.matching.model.Order;
import org.example.matching.model.Trade;

public interface WalletService {
    boolean resreveforOrder(Order order);
    void  releaserReservation(String Ooderid);
    void SettleTrade(Trade trade);


    }
