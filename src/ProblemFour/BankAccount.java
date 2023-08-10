package ProblemFour;

import java.util.Random;

public class BankAccount extends Bank {
    private int accountNumber;
    private double balance;
    private String accountType;
    BankCustomer accountHolder;

    public BankAccount(BankCustomer accountHolder, String branch, String IFSC, String accountType){
        super(branch, IFSC);
        this.accountType = accountType;
        this.accountHolder = accountHolder;
        this.balance = 0;
        generateAccount();
        setNumOfAccount();
    }

    public void generateAccount(){
        Random random = new Random();
        int randomNumber = 1000000 + random.nextInt(9000000);
        this.accountNumber = randomNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public BankCustomer getAccountHolder() {
        return accountHolder;
    }
}
