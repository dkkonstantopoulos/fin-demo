package com.dkonstan.fin.demo.account.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class RestAccount {

    private String accountNumber;
    private BigDecimal balanceAmount;
    private String balanceCurrency;

}
