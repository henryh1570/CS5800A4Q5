public class Account {
    private AccountHolder holder;
    private double balance;

    public Account(double amt, AccountHolder holder) {
        this.balance = amt;
        this.holder = holder;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }

    public AccountHolder getHolder() {
        return holder;
    }

    public void setBalance(double amt) {
        balance = amt;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }
}
