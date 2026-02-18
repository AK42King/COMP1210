import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* tests the BankLoan class.
*
*Assignment 7-A2
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
    /** test for getLabel. **/
   @Test public void chargeInterestTest() {
      Spherocylinder example = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(" ", 3.14159, example.circumference(), .00001);  
      Spherocylinder example2 =
         new Spherocylinder("Medium Example ", 10.8, 10.1);
      Assert.assertEquals(" ", 2151.11132, example2.surfaceArea(), .00001);  
      Spherocylinder example3 =
         new Spherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals(" ", 6987754.65451, example3.volume(), .00001);
      Assert.assertTrue(example3.toString().contains("\"Large Example\""));
      Assert.assertEquals(" ", 3, example3.getCount(), 0);
      example3.resetCount();
      Assert.assertEquals(" ", 0, example3.getCount(), 0);
      example2.setLabel("Large Example");
      example2.setRadius(98.32);
      example2.setCylinderHeight(99.0);
      Assert.assertFalse(example2.setRadius(-1));
      Assert.assertFalse(example2.setCylinderHeight(-1));
      Assert.assertFalse(example2.setLabel(null));
      Assert.assertTrue(example3.equals(example2));
      Assert.assertEquals(" ", 0, example3.hashCode(), 0);
      Assert.assertFalse(example3.equals(example));
      example2.setRadius(90);
      Assert.assertFalse(example3.equals(example2));
   }
}
