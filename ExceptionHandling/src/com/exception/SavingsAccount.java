package com.exception;

public class SavingsAccount {

    long id;
    double balance;
    SavingsAccount(long id,double b)
    {
        this.id=id;
        this.balance=b;
    }
    double deposit(double m){
        this.balance=balance+m;
        return balance;
    }
    double withdraw(double m)
    {
        balance=balance-m;
        return balance;
    }
}
