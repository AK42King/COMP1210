import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* tests the BankLoan class.
*
*Assignment 7-A2
*@author Lee Austin King - Comp 1210
*@version October 13, 2020
*/
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** the Interest Test for testing the BankLoan code. **/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
      loan1.setInterestRate(0.5);
      loan1.payBank(1);
      loan1.isAmountValid(2);
      BankLoan.isInDebt(loan1);
      loan1.getLoansCreated();
      loan1.resetLoansCreated();
      loan1.toString();   
   }
}
