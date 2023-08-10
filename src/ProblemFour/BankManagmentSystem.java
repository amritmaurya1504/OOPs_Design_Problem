package ProblemFour;

/*
//** I have added some more classes and features in this problem. ***
* BANK MANAGEMENT SYSTEM:
Design a simple bank account system. Create classes for BankAccount and BankCustomer.
* The BankAccount class should have methods for depositing, withdrawing, and checking the balance.
* The BankCustomer class should have basic customer information and the ability to link to one or more bank accounts.
* */

import java.util.Scanner;

public class BankManagmentSystem {
    public static void main(String[] args) throws Exception {
        BankCustomer c1 = new BankCustomer("Amrit Raj", "amritmaurya@gmail.com", 23, 9122040963L);
        BankCustomer c2 = new BankCustomer("Chotu Kumar", "chotura@gmail.com", 3, 1234567895L);
        BankCustomer c3 = new BankCustomer("Ankit Raj", "ankit@gmail.com", 12, 9162693874L);

        BankAccount b1 = new BankAccount(c1, "Kolkata", "SBI121212A", "Savings");
        BankAccount b2 = new BankAccount(c2, "Patna", "SBI0123121", "Current");
        BankAccount b3 = new BankAccount(c3, "Jehanabad", "SBI1245DFS2", "Savings");
        BankAccount b4 = new BankAccount(c1, "Jehanabad", "SBI1005DFS2", "Fixed Deposit");
        c1.addBankAccount(b1);
        c1.addBankAccount(b4);
        c2.addBankAccount(b2);
        c3.addBankAccount(b3);
        c1.displayBankAccountDetails();
        c2.displayBankAccountDetails();
    }
}
