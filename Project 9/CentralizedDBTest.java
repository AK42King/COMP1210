import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* tests the  CentralizedDB class.
*
*Project 9-B-2
*@author Lee Austin King - Comp 1210
*@version November 8, 2020
*/
public class CentralizedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
    * tests license.
    */
   @Test public void licenseTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
         5.00, 1500.0);
      Assert.assertEquals(1500.0, db1.getLicense(), 0.001);
      db1.setLicense(1200.0);
      Assert.assertEquals(1200.0, db1.getLicense(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void monthlyCostTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
         5.00, 1500.0);
      Assert.assertEquals(2700.0, db1.monthlyCost(), 0.001);
   }
   /**
   * tests license.
   */
   @Test public void toStringTest1() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
         5.00, 1500.0);
      Assert.assertTrue(db1.toString().contains("5.000 TB")
         && db1.toString().contains("$1,500.00"));
   }
   // Abstract Method Tests
   /**
    * tests license.
    */
   @Test public void baseCostTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0,
         5.00, 1500.0);
      Assert.assertEquals(1200.0, db1.getBaseCost(), 0.001);
      db1.setBaseCost(1000.0);
      Assert.assertEquals(1000.0, db1.getBaseCost(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void nameTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 
         5.00, 1500.0);
      Assert.assertEquals("Database One", db1.getName());
      db1.setName("Database Two");
      Assert.assertEquals("Database Two", db1.getName());
   }
   /**
    * tests license.
    */
   @Test public void dbStorageTest() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 
         5.00, 1500.0);
      Assert.assertEquals(5.00, db1.getDbStorage(), 0.001);
      db1.setDbStorage(6.00);
      Assert.assertEquals(6.00, db1.getDbStorage(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void countTest() {
      CentralizedDB db2 = new CentralizedDB("Database Two", 1200.0, 
         5.00, 1500.0);
      db2.resetCount();
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 
         5.00, 1500.0);
      Assert.assertEquals(1, db1.getCount());
      db1.resetCount();
      Assert.assertEquals(0, db1.getCount());
   }
   /**
    * tests license.
    */
   @Test public void monthlyCostTest2() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 
         5.00, 1500.0);
      Assert.assertEquals(2700.0, db1.monthlyCost(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void toStringTest2() {
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 
         5.00, 1500.0);
      Assert.assertTrue("", db1.toString().contains("5.000 TB") 
         && db1.toString().contains("$1,500.00"));
   }

}
