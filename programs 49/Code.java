//Develope The Program Of MinimumBalanceException

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

   
    public BankAccount(double balance) {
        this.balance = balance;
    }

  
    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 1000) {
            throw new MinimumBalanceException("Withdrawal denied! Balance cannot be less than 1000.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining Balance: " + balance);
    }

  
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


public class Code {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.displayBalance();
        
        try {
            account.withdraw(4500); 
        } catch (MinimumBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        account.displayBalance();
    }
}
