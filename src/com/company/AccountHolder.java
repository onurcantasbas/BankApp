package com.company;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AccountHolder extends Account {


    private UUID hesapNo = UUID.randomUUID();
    private int balance;
    private int ID;
    private Date accountCreationDate = new Date();
    private int interestRate;
    private List<String> logs = new ArrayList<String>();
    private List<AccountHolder> accounts;

    public List<String> getLogs() {
        return logs;
    }

    public UUID getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(UUID uuid) {
        this.hesapNo = uuid;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public AccountHolder() {

    }

    public AccountHolder(int balance, int ID) {
        this.balance = balance;
        this.ID = ID;
    }

    public void setLogs(String logss) {
        this.logs.add(logss);
    }

    public List<AccountHolder> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountHolder> accounts) {
        this.accounts = accounts;
    }


    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void benefit() {


    }


    @Override
    public int deposit(int ID, int amount) {
        balance = balance + amount;
        return balance;
    }

    @Override
    public int withdraw(int ID, int amount) {
        if (balance < amount) {
            System.out.println("Hesabınızdaki miktar çekmek istediğiniz miktardan az olduğundan para çekme işleminiz gerçekleştirilememektedir.");
        }else balance = balance - amount;


        return balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int getID() {
        return ID;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
}
