public class SimpleBank {
    private double balance;

    public static int totalTransactions = 0;

    public SimpleBank(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            totalTransactions++;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }

    
    public double getBalance() {
        return this.balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        SimpleBank account = new SimpleBank(1000); 

        account.withdraw(400); 
        account.withdraw(-50);  
        account.withdraw(2000); 

        System.out.println("Remaining Balance: " + account.getBalance());
        System.out.println("Total Successful System Transactions: " + SimpleBank.totalTransactions);
    }
}
