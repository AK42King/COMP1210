/**
* sets data of customizable BankLoan class and outputs it.
*
*Assignment 7-A1
*@author Lee Austin King - Comp 1210
*@version October 13, 2020
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
    * sets the variables provided equal to other variables in the class,
    * sets balance to 0, and adds to the loans created.
    *
    * @param customerNameIn the customer's name provided.
    * @param interestRateIn the interest rate provided.
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
    * determines if a loan can be made and returns true if it can and
    * false if not.
    *
    * @param amount the amount provided to get a loan.
    * @return true or false if the loan was made or not.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
    * gets the amount paid back and determines if it was overpaid or not
    * then pays it.
    *
    * @param amountPaid the amount provided to payback a loan.
    * @return how much of the payment is left after paying back the bank.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
    * gets the balance.
    *
    * @return the current balance.
    */
   public double getBalance() {
      return balance;
   }
   /**
    * sets the interest rate between 0 and 1.
    *
    * @param interestRateIn the interest rate provided.
    * @return true if the interest rate is set and false if it isn't.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * gets the Interest Rate.
    *
    * @return the current balance.
    */
   public double getInterestRate() {
      return interestRate;
   }
   /**
    * charges the interest and adds it to the account.
    *
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
    * determines if the Amount is valid to get.
    *
    * @param amount the amount being attempted to gather from the account.
    * @return true if the amount is available to borrow and false if not.
    */
   public static boolean isAmountValid(double amount) {  
      return amount >= 0;
   }
   /**
    * determines if the given person is in debt.
    *
    * @param loan the class of BankLoan provided
    * @return true if the the class is not in debt and false if it is.
    */
   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   /**
    * gets the total loans.
    *
    * @return the loans created.
    */
   public static int getLoansCreated() {
      return loansCreated;
   }
   /**
    * resets the Loan counter.
    *
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   /**
    * returns the summary of the BankLoan information for a class.
    *
    * @return the BankLoan summary. 
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
}
