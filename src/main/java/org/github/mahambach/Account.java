package org.github.mahambach;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account {
    //Properties
    private String accountNumber;
    private BigDecimal accountBalance;
    Set<Client> client;

    //Constructor

    public Account(String accountNumber, BigDecimal acountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = acountBalance;
        this.client = new HashSet<>();
        this.client.add(client);
    }

    public Account(String accountNumber, BigDecimal accountBalance, Set<Client> client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    //Methods
    public void deposit(BigDecimal deposit){
        this.accountBalance = this.accountBalance.add(deposit);
    }

    public void withdraw(BigDecimal withdrawn){
        this.accountBalance = this.accountBalance.subtract(withdrawn);
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Set<Client> getClient() {
        return client;
    }

    public void setClient(Set<Client> client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", acountBalance=" + accountBalance +
                ", client=" + client +
                '}';
    }
}
