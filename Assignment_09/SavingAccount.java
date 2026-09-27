// Assignment9_Q2

class BankAccount {

    double balance = 500;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
    }
}

class SavingAccount extends BankAccount {

    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdraw not possible");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }
    }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();

        s.deposit(200);
        s.withdraw(400);

        System.out.println("Balance: " + s.balance);
    }
}
