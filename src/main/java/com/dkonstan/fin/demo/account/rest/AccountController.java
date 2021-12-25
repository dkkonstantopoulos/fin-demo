package com.dkonstan.fin.demo.account.rest;

import com.dkonstan.fin.demo.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class AccountController {

    private final AccountRepository accountRepository;



}
