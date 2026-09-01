package inheritance;

// Superclass (Parent Class)
/*public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: $" + amount + ". New Balance: $" + balance);
    }

    protected void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw success of amount: $" + amount);
        }else {
            System.out.println("Insufficient Balance");
        }
    }

    public double displayBalance() {
        //System.out.println("Account " + accountNumber + " Balance: $" + balance);
        return this.balance;
    }
}

// Subclass (Child Class) inheriting from BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor must call the superclass constructor using 'super'
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); //Constructor chaining
    }

    // New method specific only to SavingsAccount
    public void applyInterest() {
        double interest = (this.displayBalance() * (interestRate / 100)*3/12)/100;
        this.deposit(interest);
    }
}

class CurrentAccount extends BankAccount {
    public double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        overdraftLimit += amount;
        System.out.println("Amount paid to Overdraft::" + amount);
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = super.displayBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            this.overdraftLimit -= amount;
            System.out.println(("Withdraw success on current account of amount " + amount));
            System.out.println("Current Account balance::" + (this.overdraftLimit + super.displayBalance()));
        } else {
            System.out.println("Exceeds Overdraft Limit");
        }
    }
}
    public double displayBalance() {
        return super.displayBalance() + overdraftLimit;
    }


    // Main class to execute the code
   class BankRunner {
        public static void main(String[] args) {
            // Creating an object of the subclass
            BankAccount savingsAccount = new SavingsAccount("SA001",  7000,  3.5);
            BankAccount currentAccount = new CurrentAccount( "CA001", 3000,  500000);
            savingsAccount.deposit( 8000);
            savingsAccount.withdraw( 5000);
            System.out.println(savingsAccount.displayBalance());
            savingsAccount.withdraw( 100000);


            // Using methods inherited from BankAccount


            // Using a method exclusive to SavingsAccount

        }
    }*/
// 1. Superclass (Parent Class)
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountNumber + " deposited $" + amount + ". New Balance: $" + balance);
    }

    // This method will be overridden by subclasses (Polymorphism)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountNumber + " withdrew $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println(accountNumber + " has insufficient funds.");
        }
    }
}

// 2. Subclass demonstrating INHERITANCE
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        // 'super' calls the parent class constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + interest + " applied. New Balance: $" + balance);
    }
}

// 3. Subclass demonstrating POLYMORPHISM (Overriding standard withdrawal rules)
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding the withdraw method to allow overdrafts
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(accountNumber + " (Checking) withdrew $" + amount + " (Overdraft used if negative). Current Balance: $" + balance);
        } else {
            System.out.println(accountNumber + " exceeded overdraft limit.");
        }
    }
}

// 4. Main Class to execute the code
class BankRunner {
    public static void main(String[] args) {
        // --- Demonstration of Inheritance ---
        SavingsAccount savings = new SavingsAccount("SAV123", 1000.0, 2.5);
        savings.deposit(200); // Inherited from BankAccount
        savings.applyInterest(); // Unique to SavingsAccount

        System.out.println("---------------------------------------");

        // --- Demonstration of Polymorphism ---
        // Creating a list of BankAccounts holding different sub-types
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new BankAccount("GEN999", 500.0);
        accounts[1] = new CheckingAccount("CHK456", 500.0, 200.0);

        // Both objects are treated as 'BankAccount', but execute their specific behaviors
        for (BankAccount account : accounts) {
            account.withdraw(600.0);
            // GEN999 will fail (insufficient funds)
            // CHK456 will succeed because it uses CheckingAccount's overridden method!
        }
    }
}




