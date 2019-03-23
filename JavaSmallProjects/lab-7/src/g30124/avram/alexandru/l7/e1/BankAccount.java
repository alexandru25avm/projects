package g30124.avram.alexandru.l7.e1;

import java.util.Objects;

public class BankAccount {

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {

        return Objects.hash(owner, balance);
    }

    public void withdraw(double amount){

        if ( balance > balance - amount)
        {
            balance = balance-amount;
            System.out.println("Suma"+amount+"a fost retrasa din cont");
        }
        else
            System.out.println("Suma retrasa depaseste soldul");


    }

    public void deposit (double amount){
        balance = balance + amount;
        System.out.println("Suma"+amount+"a fost introdusa");
    }


    public static void main(String[] args) {
        BankAccount b = new BankAccount("Avram Alexandru",100);
        BankAccount b1 = new BankAccount("Avram Alexandru",500);

        if (b.equals(b1))
        {

            System.out.println(b1.owner+" and "+b.owner+" are equals.");
            System.out.println(b1.balance+" and "+b.balance+" are equals.");

        }
        else {
            System.out.println(b1.owner + " and " + b.owner + " are NOT equals.");
            System.out.println(b1.balance + " and " + b.balance + " are NOT equals.");
        }


    }
}
