import bank.BankAccount;
import bank.User;
public class App {
    public static void main(String[] args) {
        User user = new User("John", "Doe", "john@gmail.com", "30", "123 Main St.");
        BankAccount account = new BankAccount();
        account.user = user;
        account.submit(1000);
        System.out.println(account.showInfo());
    }
}
