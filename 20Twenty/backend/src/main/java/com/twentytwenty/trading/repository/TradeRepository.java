package com.twentytwenty.trading.repository;

import com.twentytwenty.trading.model.Trade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TradeRepository extends MongoRepository<Trade, String> {
    List<Trade> findByUserIdOrderByCreatedAtDesc(String userId);
    
    @Query("{'symbol': ?0, 'status': 'ACTIVE'}")
    List<Trade> findActiveTradesBySymbol(String symbol);
}