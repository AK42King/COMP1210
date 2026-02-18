import java.text.DecimalFormat;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-2
*@author Lee Austin King - Comp 1210
*@version October 2, 2020
*/
public class Octahedron
{
   // instance variables
   private String name = "", location = "";
   private double amount = 0;
   
   //constructor
   /**
    * formats a shape that: sets the name, sets the location, and sets the amount.
    *
    * @param nameIn the name of the Octahedron.
    * @param locationIn The location of the Octahedron.
    * @param amountIn The amount of one of the sides of the Octahedron.
    */
   public Octahedron(String nameIn, String locationIn, double amountIn)
   {
    
      setLabel(nameIn);
      setColor(locationIn);
      setEdge(amountIn);
    
   }
   //methods
   /**
    * sets the name if it is avaliable.
    *
    * @return the name if it is avaliable.
    * @param nameIn the name provided of the Octahedron 
    */ 
   public boolean setLabel(String nameIn)
   {
      if (nameIn != null) {
         name = nameIn.trim();
         return true;
      } else {
         return false;
      }
   }
   /**
    * sets the location if it is avaliable.
    *
    * @return the location if it is avaliable.
    * @param locationIn the location provided of the Octahedron 
    */
   public boolean setColor(String locationIn)
   {
      if (locationIn != null) {
         location = locationIn.trim();
         return true;
      } else {
         return false;
      }
   }
   /**
    * sets the amount if above 0.
    *
    * @return true if amount is above 0 and false if amount is below.
    * @param amountIn the amount provided of the Octahedron 
    */
   public boolean setEdge(double amountIn)
   {
      boolean isSet = false;
      if (amountIn >= 0)
      {
         amount = amountIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * returns the surfaceArea by multiplying 2 by the square root of 3
    * then multiplying it by the amount then squaring it.
    *
    * @return The surfaceArea of the octahedron provided. 
    */
   public double surfaceArea()
   {
      double area = 2 * Math.sqrt(3) * Math.pow(amount, 2);
      return area;
   }
   /**
    * returns the volume by getting the square root of 2 and dividing
    * by 3 then getting the cube root of the amount.
    *
    * @return The volume of the octahedron provided. 
    */
   public double volume()
   {
      double volume = (Math.sqrt(2) / 3) * Math.pow(amount, 3);
      return volume;
   }
   /**
    * returns the surfaceToVolumeRatio by dividing the area
    * by the volume.
    *
    * @return The surface to volume ratio of the octahedron provided. 
    */
   public double surfaceToVolumeRatio()
   {
      double ratio = surfaceArea() / volume();
      return ratio;
   }
   /**
    * returns location.
    *
    * @return The location of the octahedron provided is given. 
    */
   public String getColor() {
      return location;
   }
   /**
    * returns name.
    *
    * @return The name of the octahedron provided is given. 
    */
   public String getLabel() {
      return name;
   }
   /**
    * returns amount.
    *
    * @return The amount of the octahedron provided is given. 
    */
   public double getEdge() {
      return amount;
   }
   /**
    * returns Octahedron that can hold name, location, amount, volume, 
    * surfaceToVolumeRatio and surfacearea in a set manner.
    *
    * @return an output about the Octahedron name, location, amount, volume, 
    * surfaceToVolumeRatio and surfacearea. 
    */
   public String toString() 
   {
      
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      
      String output  = "Octahedron \"" + getLabel() + "\" is \""
            + getColor() + "\" with 12 amounts of length " + getEdge()
            + " units.\n";
      output += "\tsurface area = " + df.format(surfaceArea())
            + " square units\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units\n";
      output += "\tsurface/volume ratio = "
            + df.format(surfaceToVolumeRatio());
      return output;
      
   }

}