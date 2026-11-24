package reports;

import transaction.account;

public class transactionreport{ 
    public static void generateReport(account acc)
    {
        System.out.println("account:"+ acc.accno +" | Balance: "+ acc.balance);
    }
}