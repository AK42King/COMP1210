import java.text.DecimalFormat;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 8
*@author Lee Austin King - Comp 1210
*@version October 30, 2020
*/
public class SpherocylinderList
{
   // instance variables
   private String listName = "";
   private Spherocylinder[] objects;
   private int numSphero = 0;
   
   //constructor
   /**
    * formats a shape that: sets the name and sets the arraylist.
    *
    * @param nameIn the name of the SpheroCylinderList.
    * @param objIn The objects in the SpheroCylinderList.
    * @param numSpheroIn the number of objects in SpherocylinderList
    * of the SpheroCylinder.
    */
   public SpherocylinderList(String nameIn,
      Spherocylinder[] objIn, int numSpheroIn)
   {
      listName = nameIn;
      objects = objIn;
      numSphero = numSpheroIn;
   }
   //methods
   /**
    * returns amount of Spherocylinders.
    *
    * @return number of Spherocylinders. 
    */ 
   public int numberOfSpherocylinders()
   {
      return numSphero;
   }
   /**
    * get name of SpherocylinderList.
    *
    * @return name of Spherocylinder List. 
    */ 
   public String getName()
   {
      return listName;
   }
   /**
    * calculates the total Surface Area of all objects.
    *
    * @return the total Surface Area of all the objects.
    */
   public double totalSurfaceArea()
   {
      double surfaceAreaTotal = 0;
      for (int i = 0; i < numberOfSpherocylinders(); i++) {
         surfaceAreaTotal += objects[i].surfaceArea();
      }
      return surfaceAreaTotal;
   }
   /**
    * calculates the total Volume.
    *
    * @return the total volume of all the objects.
    */
   public double totalVolume()
   {
      double volumeTotal = 0;
      for (int i = 0; i < numberOfSpherocylinders(); i++) {
         volumeTotal += objects[i].volume();
      }
      return volumeTotal;
   }
   /**
    * calculates the average Surface Area of all objects.
    *
    * @return the average Surface Area of all the objects.
    */
   public double averageSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < numberOfSpherocylinders()) {
         surfaceArea += objects[i].surfaceArea();
         i++;
      }
      if (numberOfSpherocylinders() > 0) {
         surfaceArea /= numberOfSpherocylinders();
      }
      return surfaceArea;
   }
   /**
    * calculates the average Volume of all objects.
    *
    * @return the average Volume of all the objects.
    */
   public double averageVolume() {
      double volume = 0;
      int i = 0;
      while (i < numberOfSpherocylinders()) {
         volume += objects[i].volume();
         i++;
      }
      if (numberOfSpherocylinders() > 0) {
         volume /= numberOfSpherocylinders();
      }
      return volume;
   }
   /**
    * returns the list of .
    *
    * @return The count of the spherocylinder provided is given. 
    */
   public Spherocylinder[] getList() {
      return objects;
   }
   /**
    * edits the specified Spherocylinder.
    *
    * @param labelIn the provided label for searching.
    * @param radiusIn the provided label for searching.
    * @param heightIn the provided label for searching.
    * @return true if the spherocylinder was changed. 
    */
   public boolean editSpherocylinder(String labelIn, 
         double radiusIn, double heightIn) {
         
      for (int i = 0; i < numberOfSpherocylinders(); i++) {
      
         if (objects[i] == (null)) {
            continue;
         }
         if (objects[i].getLabel().toUpperCase().equals(
            labelIn.toUpperCase())) {
            objects[i].setRadius(radiusIn);
            objects[i].setCylinderHeight(heightIn);
            return true;
         }
      
      }
      return false;
   }
   /**
    * returns radius.
    *
    * @param labelIn the provided label for searching.
    * @return The radius of the spherocylinder provided is given. 
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder example = new Spherocylinder("", 0, 0);
      for (int i = 0; i < numberOfSpherocylinders(); i++) {
         if (objects[i].getLabel().toUpperCase().equals(labelIn.toUpperCase()))
         {
            example = objects[i];
            return example;
         }
      }
      return null; 
   }  
   /**
    * returns label.
    *
    * @param labelIn the provided label for searching.
    * @return The label of the spherocylinder provided is given. 
    */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder s = null;
      
      for (int i = 0; i < numberOfSpherocylinders(); i++) {
      
         if (objects[i].getLabel().equalsIgnoreCase(labelIn)) {
            s  = objects[i];
            for (int j = i; j < (numberOfSpherocylinders() - 1); j++) {
               objects[j] = objects[j + 1];
            }
            objects[numberOfSpherocylinders() - 1] = null;
            numSphero--;
            break;
         }
      }
      return s;
   }
   /**
    * adds a Spherocylinder to the list.
    *
    * @param labelIn the provided label for searching.
    * @param radiusIn the provided label for searching.
    * @param heightIn the provided label for searching.
    * @return true if the spherocylinder was changed. 
    */
   public boolean addSpherocylinder(String labelIn, 
      double radiusIn, double heightIn) {
         
      for (int i = 0; i < numberOfSpherocylinders() + 1; i++) {
      
         if (objects[i] == (null)) {
            numSphero++;
            Spherocylinder s = new Spherocylinder(labelIn,
               radiusIn, heightIn);
            objects[i] = s;
            return true;
         }
      }
      return false;
   }
   /**
    * calculates the largest Volume of all objects.
    *
    * @return the Largest Volume of all the objects.
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (numberOfSpherocylinders() > 0) {
         Spherocylinder s = objects[0];
      
         for (int i = 0; i < numberOfSpherocylinders(); i++) {
         
            if (objects[i].volume() > s.volume()) {
               s  = objects[i];
            }
         }
         return s;
      }
      return null;
   }
   /**
    * returns SpheroCylinder that can hold label, radius, cylinderHeight, 
    * circumference, volume and surfacearea in a set manner.
    *
    * @return an output about the SpheroCylinder label, color, edge, volume, 
    * surfaceToVolumeRatio and surfacearea. 
    */
   public String toString() 
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = "----- Summary for Spherocylinder Test List -----\n";
      output += "Number of Spherocylinders: " + numberOfSpherocylinders()
         + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea())
         + "\n";
      output += "Total Volume: " + df.format(totalVolume()) + "\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea())
         + "\n";
      output += "Average Volume: " + df.format(averageVolume());
      return output;
      
   }
}