package com.example.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
    private Long id;
    private String to;
    private String from;
    private BigDecimal conversionMiltiple;
    private BigDecimal quantity;
    private BigDecimal totalClculatedAmount;
    private int port;

    public CurrencyConversionBean(Long id, String to, String from, BigDecimal conversionMiltiple, BigDecimal quantity, BigDecimal totalClculatedAmount, int port) {
        this.id = id;
        this.to = to;
        this.from = from;
        this.conversionMiltiple = conversionMiltiple;
        this.quantity = quantity;
        this.totalClculatedAmount = totalClculatedAmount;
        this.port = port;
    }

}
