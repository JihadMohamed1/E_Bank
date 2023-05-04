package com.example.e_bank_backend.services;

import com.example.e_bank_backend.entities.BankAccount;
import com.example.e_bank_backend.entities.CurrentAccount;
import com.example.e_bank_backend.entities.SavingAccount;
import com.example.e_bank_backend.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankServices {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount=bankAccountRepository.findById("027d1fea-1dc9-435b-8837-e6451202dd02").orElse(null);
        if(bankAccount!= null){
            System.out.println("********************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreateDat());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if(bankAccount instanceof CurrentAccount)
            {

                System.out.println( "overDraft=>"+ ((CurrentAccount) bankAccount).getOverDraft());
            }
            else if (bankAccount instanceof SavingAccount) {

                System.out.println( "Rate=>"+((SavingAccount) bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperationList().forEach(op->{
                System.out.println("*****************");
                System.out.println(op.getType()+"/t"+op.getOperationDate()+"/t"+op.getAmount());
            });}
    }
}
