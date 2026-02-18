import java.util.ArrayList;
import java.text.DecimalFormat;
/**
* sets data of customizable Octahedron and outputs it.
*
*Assignment 5-1
*@author Lee Austin King - Comp 1210
*@version September 21, 2020
*/
public class OctahedronList {
   //instance variables
   private String name = "";
   private ArrayList<Octahedron> octList 
      = new ArrayList<Octahedron>();
   /**
    * sets number to provided NumberIn.
    *
    * @param nameIn the name provided.
    * @param octListIn the arrayList provided.
    */
   public OctahedronList(String nameIn, ArrayList<Octahedron> octListIn) {
      name = nameIn;
      octList = octListIn;
   }
   /**
    * return name.
    *
    * @return name of the file. 
    */
   public String getName()
   {
      return name;
   }
   /**
    * return number of Octahedrons.
    *
    * @return number of octahedrons in the list provided previously. 
    */
   public int numberOfOctahedrons() {
      if (octList.size() != 0) {
         return octList.size();
      }
      return 0;
   }
   /**
    * returns odd numbers under the provided value.
    *
    * @return odd numbers under the provided value. 
    */
   public double totalSurfaceArea()
   {
      double total = 0.0;
      int i = 0;
      while (i < octList.size()) {
         total += octList.get(i).surfaceArea();
         i++;
      }
      return total;
   }
  /**
    * returns numbers that can be raised to the power of two
    * under the provided value.
    *
    * @return numbers to the power of two under the value. 
    */
   public double totalVolume()
   {
      double total = 0.0;
      int i = 0;
      while (i < octList.size()) {
         total += octList.get(i).volume();
         i++;
      }
      return total;
   }
    /**
    * returns the average surface area of provided arraylist values.
    *
    * @return the average surface area by dividing the output by list size
    * by the total or if there is only one object in the array then returns the
    * Surface area. 
    */
   public double averageSurfaceArea()
   {
      double output = 0.0;
      int i = 0;
      while (i < octList.size()) {
         output += octList.get(i).surfaceArea();
         i++;
      }
      if (octList.size() > 0) {
         return (output / octList.size());
      } else
      {
         return output;
      }
   }
    /**
    * returns the average volume of provided arraylist values.
    *
    * @return the average volume by dividing the output by list size
    * by the total or if there is only one object in the array then returns the
    * Volume. 
    */
   public double averageVolume()
   {
      double output = 0.0;
      int i = 0;
      while (i < octList.size()) {
         output += octList.get(i).volume();
         i++;
      }
      if (octList.size() > 0) {
         return (output / octList.size());
      } else
      {
         return output;
      }
   }
    /**
    * returns the surface area and volume ratio of provided arraylist values.
    *
    * @return the average surface area to volume ratio by dividing the output 
    * by list size by the total or if there is only one object
    * in the array then returns the Surface area to volume ratio.
    */
   public double averageSurfaceToVolumeRatio()
   {
      double output = 0.0;
      int i = 0;
      while (i < octList.size()) {
         output += octList.get(i).surfaceToVolumeRatio();
         i++;
      }
      if (octList.size() > 0) {
         return (output / octList.size());
      } else
      {
         return output;
      }
   }
    /**
    * intializes the string then i and will run for as long as i is less
    * than the Arraylist which if 0 then will output nothing.
    *
    * @return the Octahedrons. 
    */
   public String toString()
   {
      String output = name + "\n\n";
      int i = 0;
      while (i < octList.size()) {
         output += octList.get(i).toString() + "\n\n";
         i++;
      }
      return output;
   }
    /**
    * returns the summary of the Octahedrons.
    *
    * @return the Octahedron summary. 
    */
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + name + " -----\n";
      result += "Number of Octahedrons: " + numberOfOctahedrons() + "\n";
      result += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      result += "Total Volume: " + df.format(totalVolume()) + "\n";
      result += "Average Surface Area: " + df.format(averageSurfaceArea())
         + "\n";
      result += "Average Volume: " + df.format(averageVolume()) + "\n";
      result += "Average Surface/Volume Ratio: "
         + df.format(averageSurfaceToVolumeRatio()) + "\n";
      return result;
   }
}