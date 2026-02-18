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
public class SpherocylinderListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**  test getName.
   **/
   @Test public void getNameTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals("Example List", exampleList.getName()); 
   
   }
   
   /**  test numberOfSpherocylinders. 
   **/
   @Test public void numberOfSpherocylindersTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals(3, exampleList.numberOfSpherocylinders());
   }

   
   /**  test SurfaceArea.
   **/
   @Test public void surfaceAreaTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals(184790.426, exampleList.totalSurfaceArea(), 0.001);
      Assert.assertEquals(61596.809, exampleList.averageSurfaceArea(), 0.001);
   }
   
   /**  test Volume. **/
   @Test public void totalVolumeTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals(6996733.041, exampleList.totalVolume(), 0.001);
      Assert.assertEquals(2332244.347, exampleList.averageVolume(), 0.001);
   
   }
      
   /**  test addSpherocylinder. 
   * redundancy since every test has it.
   **/
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals(61596.809, exampleList.averageSurfaceArea(), 0.001);
   
   }
   
   /**  test findSpherocylinder true and false.**/
   @Test public void findSpherocylinderTrueFalseTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals("Medium Example",
         (exampleList.findSpherocylinder("Medium Example").getLabel()));
      Assert.assertNotSame("Large Example",
         (exampleList.findSpherocylinder("Medium Example").getLabel()));
   }
   
   /**  test deleteSpherocylinder true and false. 
   **/
   @Test public void deleteSpherocylinderTrueFalseTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      exampleList.deleteSpherocylinder("Medium Example");
      
      Assert.assertNull(exampleList.findSpherocylinder("Medium Example"));
      Assert.assertEquals(2, exampleList.numberOfSpherocylinders());
   }

   /**  test editSpherocylinder true and false. **/
   @Test public void editSpherocylinderTrueFalseTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      exampleList.editSpherocylinder("Small Example", 0.5, 0.6);
      
      Assert.assertEquals(0.6,
         (exampleList.findSpherocylinder("Small Example").getCylinderHeight()),
          0.001);
      Assert.assertNotSame(0.25,
         (exampleList.findSpherocylinder("Medium Example").getCylinderHeight())
         );
   } 
        
   /**  test findSpherocylinderWithLargestVolume true and False. **/
   @Test public void findSpherocylinderWithLargestVolumeTrueFalseTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals("Large Example",
         exampleList.findSpherocylinderWithLargestVolume().getLabel());
      Assert.assertNotSame(0, 
         exampleList.findSpherocylinderWithLargestVolume());
   } 
   
   /**  test findSpherocylinderWithLargestVolume null. 
   **/
   @Test public void findSpherocylinderWithLargestVolumeNullTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList 
         = new SpherocylinderList("Example List", example, 0);
         
      Assert.assertNull(exampleList.findSpherocylinderWithLargestVolume());
   }

         
   /**  test toString. 
   **/
   @Test public void toStringTest() {
      Spherocylinder[] example = new Spherocylinder[5];
      SpherocylinderList exampleList = new SpherocylinderList("exampleList",
          example, 0);
          
      exampleList.addSpherocylinder("Small Example", 0.5, 0.25);
      exampleList.addSpherocylinder("Medium Example", 10.8, 10.1);
      exampleList.addSpherocylinder("Large Example", 98.32, 99);
      
      Assert.assertEquals(exampleList.toString(),
         "----- Summary for Spherocylinder Test List -----\n" 
         + "Number of Spherocylinders: 3\n" 
         + "Total Surface Area: 184,790.426\n"
         + "Total Volume: 6,996,733.041\n"
         + "Average Surface Area: 61,596.809\n"
         + "Average Volume: 2,332,244.347");
   
   }
}

