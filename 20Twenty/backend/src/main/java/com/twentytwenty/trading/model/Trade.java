package com.twentytwenty.trading.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Document(collection = "trades")
public class Trade {
    @Id
    private String id;
    
    @Indexed
    private String symbol;
    
    private String type; // BUY, SELL
    private BigDecimal quantity;
    private BigDecimal price;
    private String status;
    
    @Indexed
    private String userId;
    
    @CreatedDate
    private Instant createdAt;
    
    @LastModifiedDate
    private Instant updatedAt;
}