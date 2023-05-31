package org.sid.ebankbackend.repositories;

import org.sid.ebankbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankAccount,String> {
}
