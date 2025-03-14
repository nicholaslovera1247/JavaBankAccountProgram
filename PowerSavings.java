public class PowerSavings extends SavingsAccount
{
   public static double PENALTY = 0.025;
   private double rate = 0.05;
   private int monthsNeeded;
   private int monthsPassed;
   
   public PowerSavings(String n, double a, int m)
   {
      super(n,a);
      monthsNeeded = m;
      monthsPassed = 0;
   }
   
   public void addAMonth()
   {
      monthsPassed++;
      double monthlyRate = rate / 12;
      double monthlyInterest = super.getBalance() * monthlyRate;
      double addedInterest = super.getBalance() + monthlyInterest;
      super.setBalance(addedInterest);
   }
   
   public int getPassedMonths()
   {
      return monthsPassed;
   }
   
   public int getMonthsPassed()
   {
      return monthsNeeded;
   }
   
   public boolean withdraw(double amount)
   {
      boolean completed = true;
      if (monthsPassed < monthsNeeded)
      {
         double penaltyAmount = amount * PENALTY;
         double finalPBalance = super.getBalance() - penaltyAmount;
         super.setBalance(finalPBalance);
         completed = super.withdraw(amount);
      }
      else
      {
         completed = super.withdraw(amount);
      }
      return completed;
   }
   
   @Override
   public String toString()
   {
      return String.format("%s, %s, $%.2f: %d months elasped : %d months required", super.getOwner(), super.getAccountNumber(), super.getBalance(), monthsPassed, monthsNeeded);
   }
   
}