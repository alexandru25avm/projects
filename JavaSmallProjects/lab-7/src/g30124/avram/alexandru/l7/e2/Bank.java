package g30124.avram.alexandru.l7.e2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Bank {
    private ArrayList<BankAccount> bankAccountArrayList;


    public Bank()
    {
        bankAccountArrayList=new ArrayList<BankAccount>();
    }

    public Bank(ArrayList<BankAccount> bankAccountArrayList) {
        this.bankAccountArrayList = bankAccountArrayList;
    }

    public void addAccount(String owner , double balance)
    {
        BankAccount bankAccount = new BankAccount(owner, balance);
        bankAccountArrayList.add(bankAccount);
    }

    public void printAccounts() {
        Collections.sort(bankAccountArrayList);
        Iterator<BankAccount> bankAccountIterator = bankAccountArrayList.iterator();
        BankAccount bankAccount;

        while (bankAccountIterator.hasNext()) {
            bankAccount = bankAccountIterator.next();
            System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
        }
    }
    public void printAccounts(double minBalance, double maxBalance) {
        Collections.sort(bankAccountArrayList);
        Iterator<BankAccount> bankAccountIterator = bankAccountArrayList.iterator();
        BankAccount bankAccount;
        while (bankAccountIterator.hasNext()) {
            bankAccount = bankAccountIterator.next();
            if (bankAccount.getBalance() <= maxBalance && bankAccount.getBalance() >= minBalance) {
                System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());

            }


        }
    }
        public ArrayList<BankAccount> getAllAccounts()
        {
        return bankAccountArrayList;
        }

    }




