import java.text.DecimalFormat;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 6-2
*@author Lee Austin King - Comp 1210
*@version October 2, 2020
*/
public class Spherocylinder
{
   // instance variables
   private String label = "";
   private double radius = 0, cylinderHeight = 0;
   private static int count = 0;
   
   //constructor
   /**
    * formats a shape that: sets the label, sets the color, and sets the edge.
    *
    * @param labelIn the label of the SpheroCylinder.
    * @param radiusIn The radius of the SpheroCylinder.
    * @param cylinderHeightIn The cylinderHeight of the cylinder section
    * of the SpheroCylinder.
    */
   public Spherocylinder(String labelIn, double radiusIn,
       double cylinderHeightIn)
   {
    
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;
   }
   //methods
   /**
    * sets the label if it is avaliable.
    *
    * @return the label if it is avaliable.
    * @param labelIn the label provided of the SpheroCylinder. 
    */ 
   public boolean setLabel(String labelIn)
   {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      } else {
         return false;
      }
   }
   /**
    * sets the color if above 0.
    *
    * @return true if radius is above 0 and false if radius is below.
    * @param radiusIn the edge provided of the SpheroCylinder. 
    */
   public boolean setRadius(double radiusIn)
   {
      boolean isSet = false;
      if (radiusIn >= 0)
      {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * sets the edge if above 0.
    *
    * @return true if cylinderHeight is above 0 and false 
    * if cylinderHeight is below.
    * @param cylinderHeightIn the edge provided of the SpheroCylinder.
    */
   public boolean setCylinderHeight(double cylinderHeightIn)
   {
      boolean set = false;
      if (cylinderHeightIn >= 0)
      {
         cylinderHeight = cylinderHeightIn;
         set = true;
      }
      return set;
   }
   /**
    * returns the circumference by multiplying 2 by pi
    * then multiplying it by the radius.
    *
    * @return The circumference of the spherocylinder provided. 
    */
   public double circumference()
   {
      double circumf = 2 * Math.PI * radius;
      return circumf;
   }
   /**
    * returns the surfaceArea by multiplying 2 and pi and the radius then
    * the radius by 2 and add cylinderHeight to that multiplication.
    *
    * @return The surface Area of the spherocylinder provided. 
    */
   public double surfaceArea()
   {
      double surfaceA = (2 * Math.PI * radius * ((2 * radius)
         + cylinderHeight));
      return surfaceA;
   }
   /**
    * returns the volume by getting the square root of 2 and multiplying
    * by pi then multiplying ratio and radius then adding the
    * cylinderHeight to it.
    *
    * @return The volume of the spherocylinder provided. 
    */
   public double volume()
   {
      double ratio = 4;
      ratio /= 3;
      double vol = ((Math.PI * Math.pow(radius, 2))
         * (((ratio) * radius) + cylinderHeight));
      return vol;
   }
   /**
    * returns count.
    *
    * @return The count of the spherocylinder provided is given. 
    */
   public static int getCount() {
      return count;
   }
   /**
    * sets Count to 0.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    * returns radius.
    *
    * @return The radius of the spherocylinder provided is given. 
    */
   public double getRadius() {
      return radius;
   }
   /**
    * returns label.
    *
    * @return The label of the spherocylinder provided is given. 
    */
   public String getLabel() {
      return label;
   }
   /**
    * returns cylinderHeight.
    *
    * @return The cylinderHeight of the spherocylinder provided is given. 
    */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   /**
    * returns 0, needed according to instructions.
    *
    * @return 0. 
    */
   public int hashCode() {
      return 0;
   }
   /**
    * returns SpheroCylinder that can hold label, color, edge, volume, 
    * surfaceToVolumeRatio and surfacearea in a set manner.
    *
    * @param obj the object being provided to compare
    * @return equal if the shapes are the same shape parameters and  
    * if the object is a spherocylinder. 
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else { 
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < .000001
            && Math.abs(cylinderHeight - d.getCylinderHeight())
            < .000001);
      }
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
      
      String output  = "Spherocylinder \"" + getLabel() + "\" with radius "
            + getRadius() + " and cylinder height "
            + getCylinderHeight() + " has: \n";
      output += "\tcircumference = " + df.format(circumference())
            + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea())
            + " square units\n";
      output += "\tvolume = "
            + df.format(volume()) + " cubic units";
      return output;
      
   }

}