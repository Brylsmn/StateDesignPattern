public class Account{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;
    public Account (String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public AccountState getState(){
        return accountState;
    }
    public void setState(AccountState state){
        this.accountState = state;
    }
    public void deposit(Double depositAmount){
        accountState.deposit(this, depositAmount);
    }
    public void withdraw(Double withdrawAmount){
        accountState.withdraw(this, withdrawAmount);
    }
    public void suspend(){
        accountState.suspend(this);
    }
    public void activate(){
        accountState.activate(this);
    }
    public void close(){
        accountState.close(this);
    }
    public String toString(){
        return "Account Number: " + accountNumber + "\n" + "Account Balance: " + balance;
    }
}