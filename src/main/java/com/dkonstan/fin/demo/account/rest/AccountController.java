package com.dkonstan.fin.demo.account.rest;

import com.dkonstan.fin.demo.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping("/accounts")
    public ResponseEntity<List<RestAccount>> getAccounts() {
        return ResponseEntity.ok(accountRepository.findAll(Sort.by("id")).stream()
                .map(e -> RestAccount.builder()
                        .accountNumber(e.getAccountNumber())
                        .balanceAmount(e.getBalanceAmount())
                        .balanceCurrency(e.getBalanceCurrency())
                        .build())
                .collect(Collectors.toList()));
    }

}
