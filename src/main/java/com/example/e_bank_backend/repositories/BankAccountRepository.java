package com.example.e_bank_backend.repositories;

import com.example.e_bank_backend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
