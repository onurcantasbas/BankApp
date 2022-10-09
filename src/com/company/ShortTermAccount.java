package com.company;

import java.util.Date;

public class ShortTermAccount extends AccountHolder{

    @Override
    public void setInterestRate(int interestRate) {
        interestRate = 17;
        super.setInterestRate(interestRate);
    }

    public ShortTermAccount() {

    }

    public ShortTermAccount(int balance, int ID) {
        super(balance, ID);
    }




    @Override
    public void benefit() {
        if(getBalance() < 1000){
            System.out.println("Hesabınızda 1000 tl veya daha fazla tutar olmak zorunda.");

        }else System.out.println("Günlük kar:" + getInterestRate() / 100 * getBalance() / 365);

    }
}
