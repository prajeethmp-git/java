package transaction;
public class account
{
   public int accno;
   public int balance;
   public account(int n,int m)
   {
      accno=n;
      balance=m;
   }
   public void deposit(int a)
   {
      balance=balance+a;
      System.out.println(balance);
   }
   public void withdrawal(int b)
   {
      balance=balance-b;
      System.out.println(balance);
   }
}