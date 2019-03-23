package g30124.avram.alexandru.l7.e2;

import java.util.ArrayList;
import java.util.Objects;

public class BankAccount implements Comparable<BankAccount>
{
    private String owner;
    private double balance;

    public BankAccount(String owner,double balance)
    {
        this.owner=owner;
        this.balance=balance;
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(owner, that.owner);
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
    public int compareTo(BankAccount o)
    {
        if(balance<o.getBalance())
            return -1;
        else
        {
            if(balance==o.getBalance())
                return 0;
            else
                return 1;
        }
    }



    @Override
    public int hashCode() {

        return Objects.hash(owner, balance);
    }
}
