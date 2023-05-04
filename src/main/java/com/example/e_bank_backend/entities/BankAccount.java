package com.example.e_bank_backend.entities;

import com.example.e_bank_backend.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)
public  class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createDat;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private  Customer customer;
    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.EAGER)
    private List<AccountOperation> accountOperationList;

}
