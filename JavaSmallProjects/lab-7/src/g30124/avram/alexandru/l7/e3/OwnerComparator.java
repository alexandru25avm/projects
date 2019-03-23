package g30124.avram.alexandru.l7.e3;


import java.util.Comparator;


public class OwnerComparator implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount bankAccount1 , BankAccount bankAccount2)
    {
        return bankAccount1.getOwner().compareTo(bankAccount2.getOwner());

    }



}
