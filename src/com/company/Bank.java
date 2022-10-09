package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Bank {

    private AccountHolder account;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date defaultDate = formatter.parse("14/02/2022");

    List<AccountHolder> accounts = new ArrayList<AccountHolder>();
    List<SpecialAccount> specialAccounts = new ArrayList<SpecialAccount>();


    Random r = new Random();
    List<Integer> chances = new ArrayList<Integer>();

    public Bank() throws ParseException {
    }


    public List<AccountHolder> getAccounts() {

        return account.getAccounts();
    }

    public Date getDate() {

        return new Date();
    }

    public void Deposit(int cash, int ID) {
        AccountHolder accountHolder;
        ;
        accountHolder = getAccountHolder(ID);
        int newBalance = accountHolder.deposit(ID, cash);
        accountHolder.setBalance(newBalance);
        String logString = " Yatırılan tutar :" + cash + ",";
        accountHolder.setLogs(logString);
    }

    public void Withdraw(int ID, int cash) {
        AccountHolder accountHolder;
        accountHolder = getAccountHolder(ID);
        int newBalance = accountHolder.withdraw(ID, cash);
        accountHolder.setBalance(newBalance);
        String logString = " Çekilen tutar :" + cash + ",";
        accountHolder.setLogs(logString);
    }

    public void Sortition() {
        int rnd = r.nextInt(specialAccounts.size()-1);


        for (int i = 0; i < specialAccounts.size(); i++) {
            int chance = specialAccounts.get(i).getBalance() / 2000;
            for (int j = 0; j < chance; j++) {
                chances.add(i);
            }
        }

        int winner = chances.get(rnd);
        SpecialAccount s = specialAccounts.get(winner);
        s.deposit(winner, 10000);

        System.out.println("kazanan ID: " + s.getID() + " yeni bakiye : " + s.getBalance());
    }

    public AccountHolder getAccountHolder(int ID) {
        AccountHolder accountHolder = new AccountHolder();

        for (int i = 0; i < accounts.size(); i++) {
            if (ID == accounts.get(i).getID()) {
                accountHolder = accounts.get(i);
            }
        }
        return accountHolder;
    }


    public void Create_L_ID_balance(int ID, int Balance) {

            LongTermAccount longTermAccount = new LongTermAccount();
            longTermAccount.setID(ID);
            longTermAccount.setBalance(Balance);
            accounts.add(longTermAccount);

    }



    public void Create_S_ID_balance(int ID, int Balance) {

            ShortTermAccount shortTermAccount = new ShortTermAccount();
            shortTermAccount.setID(ID);
            shortTermAccount.setBalance(Balance);
            accounts.add(shortTermAccount);




    }

    public void Create_O_ID_balance(int ID, int Balance) {
        SpecialAccount specialAccount = new SpecialAccount();
        specialAccount.setID(ID);
        specialAccount.setBalance(Balance);
        accounts.add(specialAccount);
        specialAccounts.add(specialAccount);
        specialAccount.firstBalance = Balance;
    }

    public void Create_C_ID_balance(int ID, int Balance) {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setID(ID);
        currentAccount.setBalance(Balance);
        accounts.add(currentAccount);
        for (AccountHolder holder : accounts) {
            System.out.println("ID : " + holder.getID() + "  Balance : " + holder.getBalance());
        }
    }

    public void Increase_ID_cash(int ID, int cash) {
        Deposit(cash, ID);
    }

    public void Decrease_ID_cash(int cash, int ID) {

        Withdraw(cash, ID);
    }

    public void Set_dd_mm_yy() throws ParseException {
        System.out.println("default Date : " + defaultDate);
        defaultDate = new Date();
        System.out.println("UpdatedDate  : " + defaultDate);
    }

    public void ShowIDs() {
        System.out.println();
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("ID : " + accounts.get(i).getID() + ", Hesap NO : " + accounts.get(i).getHesapNo());
        }

    }

    public void ShowAccount() {

        for (int i = 0; i < accounts.size(); i++) {
            int logSize = accounts.get(i).getLogs().size();
            System.out.println("");
            System.out.print("ID : " + accounts.get(i).getID() + ", logs : ");

            if (logSize < 5) {
                for (int j = 0; j <= logSize - 1; j++) {
                    System.out.print(accounts.get(i).getLogs().get(j));
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print(accounts.get(i).getLogs().get(logSize - 1));
                    logSize--;
                }

            }
        }


    }


}




