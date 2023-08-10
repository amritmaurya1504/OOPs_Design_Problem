package ProblemFour;
import java.util.*;
public class BankCustomer {
    private String customerName;
    private ArrayList<BankAccount> bankAccounts;
    private String email;
    private int age;
    private long mobileNumber;

    public BankCustomer(String customerName, String email, int age, long mobileNumber){
        this.customerName = customerName;
        this.email = email;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.bankAccounts = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void displayBankAccountDetails() throws Exception {
        int len = bankAccounts.size();
        if(len == 0){
            System.out.println("You don't have any bank account!");
            return;
        }
        for (BankAccount b: bankAccounts) {
            String details = "{" +
                    "Account Number : " + b.getAccountNumber() + " ," +
                    "Account Type : " + b.getAccountType() + " ," +
                    "Account Holder : " + b.getAccountHolder().getCustomerName() + " ," +
                    "Branch : " + b.getBranch() + " ," +
                    "IFSC Code : " + b.getIFSC() +
                    "}";
            System.out.println(details);
        }
    }
    public void addBankAccount(BankAccount b){
        bankAccounts.add(b);
    }
}
