import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* tests the Spherocylinder class.
*
*Assignment 7-B1-2
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** the Interest Test for testing the Spherocylinder code. **/
   @Test public void setLabelTest1() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      sphr.setLabel("Medium Example");
      Assert.assertEquals("Medium Example", sphr.getLabel());
   }
   /** test for setLabel again. **/
   @Test public void setLabelTest2() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertFalse(sphr.setLabel(null));
   }
   /** test for setRadius. **/
   @Test public void setRadiusTest1() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      sphr.setRadius(0.4);
      Assert.assertEquals(0.4, sphr.getRadius(), 0.000001);
   }
   /** test for setRadius again. **/
   @Test public void setRadiusTest2() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertFalse(sphr.setRadius(-1));
   }
   /** test for setCylinderHeight. **/
   @Test public void setCylinderHeightTest() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      sphr.setCylinderHeight(0.3);
      Assert.assertEquals(0.3, sphr.getCylinderHeight(), 0.000001);
   }
   /** test for setCylinderHeight again. **/
   @Test public void setCylinderHeightTest2() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertFalse(sphr.setCylinderHeight(-1));
      sphr.resetCount();
   }
   /** test for setCylinderHeight again. **/
   @Test public void hashCodeTest() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0, sphr.hashCode());
   }
   /** test for getCount. **/
   @Test public void getCountTest() {
      Spherocylinder sphr1 = new Spherocylinder("Large", 10.8, 10.1);
      sphr1.resetCount();
      Spherocylinder sphr = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder sphr2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(2, sphr.getCount());
      sphr.resetCount();
      Assert.assertEquals(0, sphr.getCount());
   }
   /** test for getCount again. **/
   @Test public void setCylinderHeightTest3() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertFalse(sphr.setCylinderHeight(-1));
   }
   /** test for equals. **/
   @Test public void equalsTest() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder sphr2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Assert.assertFalse(sphr.equals(sphr2));
   }
   /** test for toString. **/
   @Test public void circumferenceTest() {
      Spherocylinder sphr = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Spherocylinder \"Small Example\" with radius 0.5"
         + " and cylinder height 0.25 has:\n\tcircumference = 3.142 units"
         + "\n\tsurface area = 3.927 square units\n\tvolume = 0.72 cubic "
         + "units", 
         sphr.toString());
   }
   /** test for compareTo. **/
   @Test public void compareToTest1() {
      Spherocylinder sphr1 = new Spherocylinder("Medium Example", 10.8, 10.1);
     
      Spherocylinder sphr2 = new Spherocylinder("Medium Example", 10.8, 10.1);
     
      Assert.assertTrue(sphr1.compareTo(sphr2) == 0);
   }
   /** test for compareTo again. **/
   @Test public void compareToTest2() {
      Spherocylinder sphr1 = new Spherocylinder("Medium Example", 10.8, 10.1);
     
      Spherocylinder sphr2 = new Spherocylinder("Large Example", 98.32, 99.0);
     
      Assert.assertTrue(sphr1.compareTo(sphr2) < 0);
   }
   /** test for toString a third time. **/
   @Test public void compareToTest3() {
      Spherocylinder sphr1 = new Spherocylinder("Medium Example", 10.8, 10.1);
     
      Spherocylinder sphr2 = new Spherocylinder("Small Example", 0.5, 0.25);
     
      Assert.assertTrue(sphr1.compareTo(sphr2) > 0);
   }
}

