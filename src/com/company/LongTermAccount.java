package com.company;

import java.util.Date;
import java.util.List;

public class LongTermAccount extends AccountHolder{

    @Override
    public void setInterestRate(int interestRate) {
        interestRate = 24;
        super.setInterestRate(interestRate);
    }
    public LongTermAccount() {


    }

    public LongTermAccount(int balance, int ID) {
        super(balance, ID);
    }

    public LongTermAccount(Account account){


    }


    @Override
    public void benefit() {
        if(getBalance() < 1500){
            System.out.println("Hesabınızda 1500 tl veya daha fazla tutar olmak zorunda.");

        }else System.out.println("Günlük kar:" + getInterestRate() / 100 * getBalance() / 365);

    }
}
