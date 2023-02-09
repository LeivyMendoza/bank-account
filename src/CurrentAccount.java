public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    public void setOverdraftLimit(double limit) {
        overdraftLimit = limit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getAccountBalance() + overdraftLimit < amount) {
            System.out.print("Sorry insufficient funds");
        } else {
            super.withdraw(amount);
        }
    }
}
