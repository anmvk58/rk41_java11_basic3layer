package database;

public class Account {
    private int accountId;
    private String username;
    private String fullname;
    private String customerClass;

    public Account(int accountId, String username, String fullname) {
        this.accountId = accountId;
        this.username = username;
        this.fullname = fullname;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", customerClass='" + customerClass + '\'' +
                '}';
    }
}
