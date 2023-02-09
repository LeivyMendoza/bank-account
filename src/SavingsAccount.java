public class SavingsAccount extends BankAccount {

    private double monthlyInterest;

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public void addInterest() {
        monthlyInterest += (getAccountBalance() * getMonthlyInterestRate());
        setAccountBalance(getAccountBalance() + monthlyInterest);
    }

    @Override
    public void withdraw(double amount) {
        if (getAccountBalance() < amount) {
            System.out.println("Sorry insufficient funds");
        } else {
            super.withdraw(amount);
        }
    }
}
