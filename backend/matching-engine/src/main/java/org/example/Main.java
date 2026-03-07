package org.example;

import org.example.matching.Replay;
import org.example.matching.journal.EventJournal;
import org.example.matching.matching.MatchingEngine;
import org.example.matching.model.Order;
import org.example.matching.model.OrderBook;
import org.example.matching.model.OrderSide;
import org.example.matching.model.Trade;
import org.example.matching.util.IdGenerator;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        EventJournal j = new EventJournal();
//        j.append("Order 1 user1 buy x");
//        System.out.println("Hello world!");
//        OrderBook book = new OrderBook();
//        Order s1 = new Order(UUID.randomUUID().toString(), "seller1", 100, 10, System.currentTimeMillis(),OrderSide.SELL);
//        List<Trade> trades1 = book.placeOrder(s1);
//        System.out.println(book.dumpBook());
//
//
//    Order b1 = new Order(UUID.randomUUID().toString(), "buyer1", 105, 4, System.currentTimeMillis() ,OrderSide.BUY);
//    List<Trade> trades2 = book.placeOrder(b1);
//        System.out.println("trades2 = " + trades2);
//        System.out.println(book.dumpBook());
//        Order b2 = new Order(UUID.randomUUID().toString(), "buyer2",101, 10, System.currentTimeMillis(), OrderSide.BUY);
//        List<Trade> trades3 = book.placeOrder(b2);
//        System.out.println("trades3 = " + trades3);
//        System.out.println(book.dneumpBook());
//
//    MatchingEngine engine = new MatchingEngine();
//        OrderBook a = new OrderBook();
//        Replay r = new Replay();
//        r.replayJournal("engine.log",a);
        //replayJournal(String filePath, OrderBook order)
//
//
//        // 1️⃣ SELL 10 @100
//        Order sell = new Order(
//                IdGenerator.newId(),
//                "seller1",
//                100,
//                10,
//                System.currentTimeMillis(),
//                OrderSide.SELL
//        );
//
//        engine.placeOrder(sell);
//        System.out.println("After SELL:");
//        System.out.println(engine.dumpBook());
//
//        // 2️⃣ BUY 4 @105
//        Order buy1 = new Order(
//                IdGenerator.newId(),
//                "buyer1",
//                105,
//                4,
//                System.currentTimeMillis(),
//                OrderSide.BUY
//        );
//
//        List<Trade> trades1 = engine.placeOrder(buy1);
//        System.out.println("Trades1: " + trades1);
//        System.out.println(engine.dumpBook());
//
//        // 3️⃣ BUY 6 @100
//        Order buy2 = new Order(
//                IdGenerator.newId(),
//                "buyer2",
//                100,
//                6,
//                System.currentTimeMillis(),
//                OrderSide.BUY
//        );
//
//        List<Trade> trades2 = engine.placeOrder(buy2);
//        System.out.println("Trades2: " + trades2);
   // System.out.println(engine.dumpBook());
        //System.out.println(a.dumpBook());
////
//        MatchingEngine engine = new MatchingEngine();
//
//        Order s1 = new Order(IdGenerator.newId(), "seller1", 100, 10, System.currentTimeMillis(), OrderSide.SELL);
//        engine.placeOrder(s1);
//        System.out.println("After SELL:");
//        System.out.println(engine.dumpBook());
//
//        Order b1 = new Order(IdGenerator.newId(), "buyer1", 105, 4, System.currentTimeMillis(), OrderSide.BUY);
//        List<?> t1 = engine.placeOrder(b1);
//        System.out.println("Trades: " + t1);
//        System.out.println(engine.dumpBook());
//
//        Order b2 = new Order(IdGenerator.newId(), "buyer2", 100, 6, System.currentTimeMillis(), OrderSide.BUY);
//        List<?> t2 = engine.placeOrder(b2);
//        System.out.println("Trades: " + t2);
//        System.out.println(engine.dumpBook());
        MatchingEngine engine2 = new MatchingEngine();
         Replay r = new Replay(engine2);
         r.replayJournal();
         System.out.println("After replay:");
         System.out.println(engine2.dumpBook());

    }}