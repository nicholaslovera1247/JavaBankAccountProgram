public class CheckingAccount extends BankAccount
{
   private static double FEE = 0.15;
   
   public CheckingAccount(String n, double a)
   {
      super(n,a);
      super.setAccountNumber(super.getAccountNumber() + "-10"); 
   }
   
   public boolean withdraw(double amount)
   {
      double feeAmount = amount + FEE;
      boolean completed = super.withdraw(feeAmount);
      return completed;
      
   }
   
   
}