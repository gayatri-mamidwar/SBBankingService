package dev.gayatri.banking.service;

import dev.gayatri.banking.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);
}
