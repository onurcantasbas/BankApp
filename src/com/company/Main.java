package com.company;

import java.text.ParseException;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws ParseException {
        Bank bank = new Bank();
        bank.Create_S_ID_balance(2, 1200);
        bank.Create_L_ID_balance(5, 1500);
        bank.Create_O_ID_balance(25, 6000);
        bank.Create_O_ID_balance(15, 100);
        bank.Create_O_ID_balance(7, 2200);
        bank.Create_O_ID_balance(6, 2300);
        bank.Create_O_ID_balance(4, 2400);
        bank.Create_O_ID_balance(3, 2500);
        bank.Create_C_ID_balance(47, 1400);
        bank.Increase_ID_cash(2, 20000);
        bank.Increase_ID_cash(2, 200);
        bank.Increase_ID_cash(2, 300);
        bank.Increase_ID_cash(2, 100);
        bank.Increase_ID_cash(2, 200);
        bank.Increase_ID_cash(2, 300);
        bank.Decrease_ID_cash(2, 500);
        bank.Decrease_ID_cash(2, 1500);
        bank.Decrease_ID_cash(5, 500);
        bank.Set_dd_mm_yy();
        bank.ShowAccount();
        bank.ShowIDs();
        bank.Sortition();


    }
}
