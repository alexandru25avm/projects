package g30124.avram.alexandru.l7.e3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<BankAccount> bankAccountTreeSet = new TreeSet<>();
        Bank bank = new Bank();
        bank.addAccount("Avram Alexandru", 200);
        bank.addAccount("fwefewc", 100);
        bank.addAccount("PdfsddLM", 500);
        bank.addAccount("e3vdsvsdzrfd", 300);


        bank.printAccounts();

        System.out.println(" ---- ");
        bank.printAccounts(100, 300);

        System.out.println(" ---- ");

        Iterator<BankAccount> bankAccountIterator1 = bankAccountTreeSet.iterator();
        BankAccount bankAccount;
        while ( bankAccountIterator1.hasNext())
        {
            bankAccount= bankAccountIterator1.next();
            System.out.println(bankAccount.getOwner() + " " + bankAccount.getBalance());
        }
    }
}
