package co.wedevx.digitalbank.automation.api.models.api_response;

public class Account {

    private int id;
    private String name;
    private long accountNumber;
    private double currentBalance;
    private double openingBalance;
    private double interestRate;
    private double paymentAmount;
    private int paymentTerm;
    private String dateOpened;
    private String dateClosed;
    private String paymentDue;
    private AccountType accountType;
    private OwnershipType ownershipType;
    private AccountStanding accountStanding;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getOpeningBalance() {
        return String.format("%.2f",openingBalance);
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(int paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    public String getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(String paymentDue) {
        this.paymentDue = paymentDue;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public OwnershipType getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(OwnershipType ownershipType) {
        this.ownershipType = ownershipType;
    }

    public AccountStanding getAccountStanding() {
        return accountStanding;
    }

    public void setAccountStanding(AccountStanding accountStanding) {
        this.accountStanding = accountStanding;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", currentBalance=" + currentBalance +
                ", openingBalance=" + openingBalance +
                ", interestRate=" + interestRate +
                ", paymentAmount=" + paymentAmount +
                ", paymentTerm=" + paymentTerm +
                ", dateOpened='" + dateOpened + '\'' +
                ", dateClosed='" + dateClosed + '\'' +
                ", paymentDue='" + paymentDue + '\'' +
                ", accountType=" + accountType +
                ", ownershipType=" + ownershipType +
                ", accountStanding=" + accountStanding +
                '}';
    }
}
