package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecialAccount extends AccountHolder{



    int firstBalance;
    @Override
    public void setInterestRate(int interestRate) {
        interestRate = 12;
        super.setInterestRate(interestRate);
    }

    private List<SpecialAccount> specialAccounts;

    public SpecialAccount() {

    }

    public SpecialAccount(int balance, int ID, Date accountCreationDate, int interestRate, int firstBalance) {

    }

    public List<SpecialAccount> getSpecialAccounts(){
        getAccounts().stream()
                .filter(special -> {
                    boolean b = special instanceof SpecialAccount;
                    specialAccounts.add((SpecialAccount) special);
                    return b;
                })
                .forEach(System.out::println);

        return specialAccounts;
    }

    @Override
    public void benefit() {
        if(firstBalance >= getBalance()){
            System.out.println("Hesabınızdaki para miktarının hesabınız açıldığındaki miktarla eşit yada daha fazla olması gerekmektedir.");
        }else System.out.println("Günlük kar:"+ getInterestRate()/ 100 * getBalance()  / 365  );

    }
}
