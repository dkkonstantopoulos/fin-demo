package com.dkonstan.fin.demo.account.repository;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Profile("test")
@AllArgsConstructor
@Component
public class AccountPopulator {

    private final AccountRepository accountRepository;

    @PostConstruct
    public void init() {
        accountRepository.save(AccountEntity.builder().accountNumber("5129874367").balanceAmount(new BigDecimal("100.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("3134874367").balanceAmount(new BigDecimal("100.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("3129873467").balanceAmount(new BigDecimal("120.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("5229874367").balanceAmount(new BigDecimal("100.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("7529874367").balanceAmount(new BigDecimal("140.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("9874367312").balanceAmount(new BigDecimal("300.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("3129874367").balanceAmount(new BigDecimal("1250.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("3673129874").balanceAmount(new BigDecimal("0.00")).balanceCurrency("EUR").build());
        accountRepository.save(AccountEntity.builder().accountNumber("2987314367").balanceAmount(new BigDecimal("120.00")).balanceCurrency("EUR").build());
    }

}
