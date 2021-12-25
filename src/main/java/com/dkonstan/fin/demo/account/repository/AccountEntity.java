package com.dkonstan.fin.demo.account.repository;

import com.dkonstan.fin.demo.common.repository.CommonEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "ACCOUNTS")
@NoArgsConstructor
public class AccountEntity extends CommonEntity {

    @Column(name = "BALANCE_AMOUNT")
    private BigDecimal balanceAmount;

    @Column(name = "BALANCE_CURRENCY")
    private String balanceCurrency;

}

