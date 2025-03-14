public class PowerSavingsDriver
{
   public static void main(String [] args)
   {
      PowerSavings ps = new PowerSavings("Jackie Horton",500.00,4);
      System.out.println(ps);
      ps.withdraw(50);
      System.out.println(ps);
      ps.addAMonth();
      System.out.println(ps);
      ps.addAMonth();
      ps.addAMonth();
      ps.addAMonth();
      System.out.println(ps);
      ps.withdraw(100);
      System.out.println(ps);
      
      BankAccount[] accounts = new BankAccount[3];
      accounts[0] = new CheckingAccount("Nicholas Lovera", 1000);
      accounts[1] = new SavingsAccount("Nicholas Lovera", 1000);
      accounts[2] = new PowerSavings("Nicholas Lovera", 1000, 4);
      
      for (BankAccount account : accounts)
      {
         System.out.println(account.getBalance());
      }
      
      for (BankAccount account : accounts)
      {
         account.withdraw(100);
      }
      
      for (BankAccount account : accounts)
      {
         System.out.println(account.getBalance());
      }

   }
}

// Power Savings and Checking Account have different totals from their withdraws because they
// have override methods that have %fees that affect the total of withdraw