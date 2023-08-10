package ProblemFour;

public class Bank {
    final static String bankName = "State Bank of India";
    private String IFSC;
    String branch;
    private static int numOfAccount = 0;

    public Bank(String branch, String IFSC){
        this.branch = branch;
        this.IFSC = IFSC;
    }

    protected static int getNumOfAccount() {
        return numOfAccount;
    }

    protected static void setNumOfAccount() {
        numOfAccount++;
    }

    public String getIFSC() {
        return IFSC;
    }

    public static String getBankName() {
        return bankName;
    }

    public String getBranch() {
        return branch;
    }
}
