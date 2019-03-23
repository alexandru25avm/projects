package g30124.avram.alexandru.l7.e3;

import java.util.*;

public class Bank {
    private TreeSet<BankAccount> bankAccountTreeSet = new TreeSet<>();

    public Bank()
    {
        bankAccountTreeSet=new TreeSet<BankAccount>();
    }

    public Bank(TreeSet<BankAccount> bankAccountTreeSet) {
        this.bankAccountTreeSet = bankAccountTreeSet;
    }


    public void addAccount(String owner , double balance)
    {
       // BankAccount bankAccount = new BankAccount(owner, balance);
        bankAccountTreeSet.add(new BankAccount(owner, balance));
    }

    public void printAccounts() {
        Set<BankAccount> bankAccountSet = new TreeSet<BankAccount>();
        Iterator<BankAccount> bankAccountIterator = bankAccountTreeSet.iterator();
        BankAccount bankAccount;
        while (bankAccountIterator.hasNext()) {
            bankAccount = bankAccountIterator.next();
            System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
        }
    }
    public void printAccounts(double minBalance, double maxBalance) {
        Set<BankAccount> bankAccountSet = new TreeSet<BankAccount>();
        Iterator<BankAccount> bankAccountIterator = bankAccountTreeSet.iterator();
        BankAccount bankAccount;
        while (bankAccountIterator.hasNext()) {
            bankAccount = bankAccountIterator.next();
            if (bankAccount.getBalance() <= maxBalance && bankAccount.getBalance() >= minBalance) {
                System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());

            }


        }
    }
    public TreeSet<BankAccount> getAllAccounts()
    {
        return bankAccountTreeSet;
    }

}




