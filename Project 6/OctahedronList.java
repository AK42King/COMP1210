import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
* sets data of customizable Octahedron and outputs it.
*
*Assignment 6-1
*@author Lee Austin King - Comp 1210
*@version October, 2020
*/
public class OctahedronList {
   //instance variables
   private String name = "";
   private ArrayList<Octahedron> octList 
      = new ArrayList<Octahedron>();
   /**
    * sets the variables provided equal to other variables in the class.
    *
    * @param nameIn the name provided.
    * @param octListIn the arrayList provided.
    */
   public OctahedronList(String nameIn, ArrayList<Octahedron> octListIn) {
      name = nameIn;
      octList = octListIn;
   }
       /**
    * adds a new Octahedron shape to the array list.
    *
    * @param labelIn the label provided.
    * @param colorIn the color provided.
    * @param edgeIn the edge value provided
    */
   public void addOctahedron(String labelIn, String colorIn, double edgeIn) {
      Octahedron oct = new Octahedron(labelIn, colorIn, edgeIn);
      octList.add(oct);
   }
    /**
    * finds an existing Octahedron shape.
    *
    * @param labelIn the label provided.
    * @return file that was needed or null when no file was found.
    */
   public Octahedron findOctahedron(String labelIn) {
      for (Octahedron oct : octList) {
         if (oct.getLabel().equalsIgnoreCase(labelIn))
         {
            return oct;
         }
      }
      return null;
   }
   /**
    * deletes a provided and exisiting Octahedron shape.
    *
    * @param labelIn the label provided.
    * @return file that was deleted or null when no file was found.
    */
   public Octahedron deleteOctahedron(String labelIn) {
      Octahedron oct = findOctahedron(labelIn);
      if (oct != null) {
         octList.remove(oct);
         return oct;
      }
      return null;
   }
    /**
    * edits a provided and exisiting Octahedron shape.
    *
    * @param labelIn the label provided.
    * @param colorIn the color provided.
    * @param edgeIn the edge value provided
    * @return the edited Object
    */
   public Octahedron editOctahedron(String labelIn, String colorIn, 
      double edgeIn) {
      
      Octahedron oct = findOctahedron(labelIn);
      if (oct != null) {
         oct.setColor(colorIn);
         oct.setEdge(edgeIn);
      }
      return oct;
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
    * return the ArrayList.
    *
    * @return the ArrayList of the file. 
    */
   public ArrayList<Octahedron> getList()
   {
      return octList;
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
    * edits a provided and exisiting Octahedron shape.
    *
    * @param fileName the name provided for the file.
    * @return a Octahedron list from the values in the file.
    * @throws FileNotFoundException when the file isn't found.
    */
   public OctahedronList readFile(String fileName) throws FileNotFoundException
   {
      ArrayList<Octahedron> octaList = new ArrayList<Octahedron>();
      Scanner scanFile = new Scanner(new File(fileName));
      
      String octaName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = scanFile.nextDouble();
         String trash = scanFile.nextLine();   
         
         octaList.add(new Octahedron(label, color, edge));
      }
      OctahedronList octahedList = new OctahedronList(octaName, octaList);
      return octahedList;
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