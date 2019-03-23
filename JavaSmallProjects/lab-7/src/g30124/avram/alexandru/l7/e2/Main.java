package g30124.avram.alexandru.l7.e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addAccount("Avram Alexandru", 200);
        bank.addAccount("FPLM", 100);
        bank.addAccount("PLM", 500);
        bank.addAccount("e3rfd", 300);

        bank.printAccounts();

        System.out.println(" ---- ");
        bank.printAccounts(100, 300);

        System.out.println(" ---- ");
        ArrayList<BankAccount> bankAccountArrayList1=bank.getAllAccounts();
        Collections.sort(bankAccountArrayList1,new OwnerComparator());

        Iterator<BankAccount> bankAccountIterator1 = bankAccountArrayList1.iterator();
        BankAccount bankAccount;
        while ( bankAccountIterator1.hasNext())
        {
            bankAccount= bankAccountIterator1.next();
            System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
        }
    }
}
