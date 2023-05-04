package com.example.e_bank_backend.repositories;

import com.example.e_bank_backend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
