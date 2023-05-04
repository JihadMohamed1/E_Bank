package com.example.e_bank_backend.repositories;

import com.example.e_bank_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}
