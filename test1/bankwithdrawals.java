package test1;

public class bankwithdrawals {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(200.0);
        System.out.println("Current balance: " + account.getBalance());
        try {
            account.withdraw(1500.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class BankAccount{
    private double balance = 1000.0;
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }


}
