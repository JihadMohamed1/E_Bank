package com.example.e_bank_backend;

import com.example.e_bank_backend.entities.*;
import com.example.e_bank_backend.enums.AccountStatus;
import com.example.e_bank_backend.enums.OperationType;
import com.example.e_bank_backend.repositories.AccountOperationRepository;
import com.example.e_bank_backend.repositories.BankAccountRepository;
import com.example.e_bank_backend.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EBankBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBankBackendApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository)
    {
        return  args -> {

        };
    }
    //@Bean
    CommandLineRunner start(CustomerRepository customerRepository, BankAccountRepository bankAccountRepository, AccountOperationRepository accountOperationRepository)
    {
return args -> {
    Stream.of("hassan","yassine","aicha").forEach(name->{
        Customer customer=new Customer();
        customer.setName(name);
        customer.setEmail(name+"@gmail.com");
        customerRepository.save(customer);

    });
    customerRepository.findAll().forEach(customer -> {
        CurrentAccount currentAccount=new CurrentAccount();
        currentAccount.setId(UUID.randomUUID().toString());
        currentAccount.setBalance(Math.random()*9000);
        currentAccount.setCreateDat(new Date());
        currentAccount.setStatus(AccountStatus.CREATED);
        currentAccount.setCustomer(customer);
        currentAccount.setOverDraft(9000);
        bankAccountRepository.save(currentAccount);
        SavingAccount savingAccount=new SavingAccount();
        savingAccount.setId(UUID.randomUUID().toString());
        savingAccount.setBalance(Math.random()*9000);
        savingAccount.setCreateDat(new Date());
        savingAccount.setStatus(AccountStatus.CREATED);
        savingAccount.setCustomer(customer);
        savingAccount.setInterestRate(5.5);
        bankAccountRepository.save(savingAccount);
    });
    bankAccountRepository.findAll().forEach(bankAccount -> {
        for (int i = 0; i < 5; i++) {
            AccountOperation accountOperation=new AccountOperation();
            accountOperation.setOperationDate(new Date());
            accountOperation.setAmount(Math.random()*9000);
            accountOperation.setType(Math.random()>0.5? OperationType.DEBIT:OperationType.CREDIT);
            accountOperation.setBankAccount(bankAccount);
            accountOperationRepository.save(accountOperation);
        }
    });

};
    }


}
