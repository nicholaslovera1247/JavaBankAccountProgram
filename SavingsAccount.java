public class SavingsAccount extends BankAccount
{
   private double rate = 0.025;
   private int savingsNumber = 0;
   private String accountNumber;
   
   
   public SavingsAccount(String n, double a)
   {
      super(n,a);
      accountNumber = super.getAccountNumber() + "-" + savingsNumber;
   }
   
   public void postInterest()
   {
      double monthlyRate = rate / 12;
      double monthlyInterest = super.getBalance() * monthlyRate;
      super.deposit(monthlyInterest);
   }
   
   public String getAccountNumber()
   {
      return accountNumber;
   }
   
   public SavingsAccount(SavingsAccount oldSavingsAccount, double a)
   {
      super(oldSavingsAccount,a);
      accountNumber = super.getAccountNumber() + "-" + (savingsNumber + 1);
   }
}