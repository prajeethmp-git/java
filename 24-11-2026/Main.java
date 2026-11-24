import transaction.account;
import reports.transactionreport;

public class Main{
    public static void main(String[]args)
    {
        account myAcc = new account(123456,3000);
        myAcc.deposit(1000);
        myAcc.withdrawal(200);

        transactionreport.generateReport(myAcc);
    }
}