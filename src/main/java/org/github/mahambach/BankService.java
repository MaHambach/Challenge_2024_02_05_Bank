package org.github.mahambach;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class BankService {
    //Properties
    private Set<Account> bankAccounts;
    //Constructors

    public BankService(Set<Account> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    //Methods


    public Set<Account> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Set<Account> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void addAccount(Account account){
        this.bankAccounts.add(account);
    }

    public String createNewAccount(Client client){
        this.bankAccounts.add(
                new Account(String.valueOf(this.bankAccounts.size()),
                new BigDecimal(0),
                client )
        );
        return String.valueOf(this.bankAccounts.size());
    }

    public String createNewAccount(Set<Client> client){
        this.bankAccounts.add(
                new Account(String.valueOf(this.bankAccounts.size()),
                new BigDecimal(0),
                client )
        );
        return String.valueOf(this.bankAccounts.size());
    }

    public void transfer(String fromAccount, String toAccount, BigDecimal amount){
        for(Account account : bankAccounts){
            if(account.getAccountNumber().equals(fromAccount)){
                account.withdraw(amount);
            }
            if(account.getAccountNumber().equals(toAccount)){
                account.deposit(amount);
            }
        }
    }

    public List<String> split(Account account){
        /*
            Write a method public List<String> split(String accountNumber) in the service
            that splits an account equally. From a joint account, individual accounts should
            be created for each account holder. It should return the newly created account
            numbers. Each account should receive the same amount of money after the split
            (+- 1 cent). Make sure that the bank does not incur any cent gains or losses
            during the process.
         */
    }
}
