package oops.encapsulation;

/*public class BankAccount {
    // 1. Private variables (Hidden from outside the class)
    private String accountNumber;
    private double balance;

    // Constructor to initialize variables
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Default to 0 if negative initial balance is provided
        }
    }

    // 2. Public Getter for Account Number (Read-only access)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public Getter for Balance
    public double getBalance() {
        return balance;
    }

    // Public Setter for Balance with Validation (Controlled write access)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
class Main{
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 500.0);

        // System.out.println(account.balance); // ERROR: balance has private access in BankAccount

        // Accessing data through public getter methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying data safely through public methods
        account.deposit(150.0);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Attempting an invalid operation
        account.withdraw(1000.0); // Will trigger the validation logic inside the class
    }
}*/
// Superclass (Parent Class)
public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: $" + balance);
    }
}

// Subclass (Child Class) inheriting from BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor must call the superclass constructor using 'super'
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // New method specific only to SavingsAccount
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: $" + interest + ". New Balance: $" + balance);
    }
}

// Main class to execute the code
class Runner {
    public static void main(String[] args) {
        // Creating an object of the subclass
        SavingsAccount mySavings = new SavingsAccount("SAV123", 1000.0, 4.5);

        // Using methods inherited from BankAccount
        mySavings.displayBalance();
        mySavings.deposit(500.0);

        // Using a method exclusive to SavingsAccount
        mySavings.applyInterest();
    }
}


