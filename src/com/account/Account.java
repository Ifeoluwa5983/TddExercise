package com.account;

import java.util.Scanner;

public class Account {

    private int accountBalance;
    private int pinNumber = 1234;
    private int pinEntered;

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinEntered() {
        return pinEntered;
    }

    public void setPinEntered(int pinEntered) {
        this.pinEntered = pinEntered;
    }



    public void depositMoney(int amount){
        if(0 < amount){
            accountBalance += amount;
        }
    }



    public int getAccountBalance() {
        return accountBalance;
    }

    public void withdrawCash(int amountToWithdraw, int inputPin) {
         pinEntered = inputPin;
        if(pinEntered == pinNumber){
            if(amountToWithdraw <= (accountBalance - 1000)){
                accountBalance = accountBalance - amountToWithdraw;
                System.out.println("Withdrawal successful");

            }
            else
                System.out.println("Insufficient account balance");
        }
        else
            System.out.println("Incorrect pin");

    }

    public int checkBalance(){
        return accountBalance;
    }
}
