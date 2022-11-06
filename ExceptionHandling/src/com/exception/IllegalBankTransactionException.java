package com.exception;

class IllegalBankTransactionException extends Exception {
    private double balance;
    public IllegalBankTransactionException(double amount) {
        this.balance = amount;
    }
    public double getBalance() {
        return balance;
    }
}
class Account {
    private int accNum;
    private double amount=0;
    public Account(int accNum) {
        this.accNum = accNum;
    }
    public void deposit(double deposit) {
        amount = amount + deposit;
    }
    public void withdraw(double withdraw) throws IllegalBankTransactionException {
        if(withdraw<0) {
            throw new IllegalBankTransactionException(amount);
        }else {
            amount = amount - withdraw;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Account account = new Account(100);
        System.out.println("Depositing rs.10000");
        account.deposit(10000);
        try{
            // System.out.println("Withdrawing rs.2000");
            // account.withdraw(2000);
            System.out.println("Withdrawing rs.-9000");
            account.withdraw(-9000);
        } catch(IllegalBankTransactionException e) {
            System.out.println("Can't withdraw money.Illegal value");
        }
    }
}