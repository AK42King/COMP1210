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
public class DistributedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
    * tests license.
    */
   @Test public void numberOfUsersTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(100, db1.getNumberOfUsers());
      db1.setNumberOfUsers(200);
      Assert.assertEquals(200, db1.getNumberOfUsers());
   }
   /**
    * tests license.
    */
   @Test public void costPerUserTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(12.0, db1.getCostPerUser(), 0.001);
      db1.setCostPerUser(15.0);
      Assert.assertEquals(15.0, db1.getCostPerUser(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void userCostTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(1200.0, db1.userCost(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void costFactorTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(1.1, db1.getCostFactor(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void monthlyCostTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(3320.0, db1.monthlyCost(), 0.001);
   }
   /**
   * tests license.
   */
   @Test public void toStringTest1() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertTrue(db1.toString().contains("7.500 TB") 
         && db1.toString().contains("1.1"));
   }
   // Abstract Method Tests
   /**
    * tests license.
    */
   @Test public void baseCostTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(2000.0, db1.getBaseCost(), 0.001);
      db1.setBaseCost(1000.0);
      Assert.assertEquals(1000.0, db1.getBaseCost(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void nameTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals("Database Two", db1.getName());
      db1.setName("Database One");
      Assert.assertEquals("Database One", db1.getName());
   }
   /**
    * tests license.
    */
   @Test public void dbStorageTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(7.5, db1.getDbStorage(), 0.001);
      db1.setDbStorage(6.00);
      Assert.assertEquals(6.00, db1.getDbStorage(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void countTest() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      db1.resetCount();
      DistributedDB db2 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(1, db2.getCount());
      db2.resetCount();
      Assert.assertEquals(0, db2.getCount());
   }
   /**
    * tests license.
    */
   @Test public void monthlyCostTest2() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertEquals(3320.0, db1.monthlyCost(), 0.001);
   }
   /**
    * tests license.
    */
   @Test public void toStringTest2() {
      DistributedDB db1 = new DistributedDB("Database Two", 2000.0, 
         7.5, 100, 12.0);
      Assert.assertTrue("", db1.toString().contains("7.500 TB") 
         && db1.toString().contains("$1,200.00"));
   }
}
