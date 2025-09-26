package module_3;

public class BankingApplication {
    // open account
    // deposit money
    // get balance
    // withdraw funds
    // borrow money
    // pay money back to bank
    // get borrowed money balance

    String accountNumber;
    double balance;
    double moneyBorrowed;
    double maxBorrowingLimit;

    public BankingApplication(String acctNo) {
        accountNumber = acctNo;
        balance = 0;
        moneyBorrowed = 0;
        maxBorrowingLimit = 1000;
    }

    public void depositMoney(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        balance += amount;
    }

    // functions:
    // void - we do not return anything
    // when we return something from a function, 
    // we use the returning value's data type instead of void

    public double getBalance() {
        return balance;
    }

    public void withdrawFunds(double amount) { 
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Amount cannot be greater than remaining balance");
        }

        balance -= amount;
    }

    public void borrowMoney(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (amount > maxBorrowingLimit) {
            throw new IllegalArgumentException("Amount cannot be greater than max borrowing limit");
        }

        moneyBorrowed += amount;
        balance += amount;
    }

    public void payMoneyBack(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (amount > moneyBorrowed) {
            throw new IllegalArgumentException("Amount cannot be greater than the money you borrowed");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Amount cannot be greater than remaining balance");
        }

        balance -= amount;
        moneyBorrowed -= amount;
    }

    public double getBorrowedMoneyBalance() {
        return moneyBorrowed;
    }
}
