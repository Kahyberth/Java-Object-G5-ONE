package bank;

public class BankAccount {
    double value;
    public User user;
    
    public void submit(double value) {
        this.value += value;
    }

    public void withdraw(double value) {
        this.value -= value;
    }

    public void transfer(double value, BankAccount account) {
        this.value -= value;
        account.value += value;
    }

    public String showInfo() {
        return "Value: " + this.value + "\n" +
               "User: " + this.user.showInfo();
    }
}
