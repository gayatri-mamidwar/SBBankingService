package dev.gayatri.banking.service.impl;

import dev.gayatri.banking.dto.AccountDto;
import dev.gayatri.banking.entity.Account;
import dev.gayatri.banking.mapper.AccountMapper;
import dev.gayatri.banking.repository.AccountRepository;
import dev.gayatri.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository
                .findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
                return AccountMapper.mapToAccountDto(account);
    }
}
