import java.text.DecimalFormat;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 4-1
*@author Lee Austin King - Comp 1210
*@version September 18, 2020
*/
public class Octahedron
{
   // instance variables
   private String label = "", color = "";
   private double edge = 0;
   
   //constructor
   /**
    * formats a shape that: sets the label, sets the color, and sets the edge.
    *
    * @param labelIn the label of the Octahedron.
    * @param colorIn The color of the Octahedron.
    * @param edgeIn The edge of one of the sides of the Octahedron.
    */
   public Octahedron(String labelIn, String colorIn, double edgeIn)
   {
    
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
    
   }
   //methods
   /**
    * sets the label if it is avaliable.
    *
    * @return the label if it is avaliable.
    * @param labelIn the label provided of the Octahedron 
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
    * sets the color if it is avaliable.
    *
    * @return the color if it is avaliable.
    * @param colorIn the color provided of the Octahedron 
    */
   public boolean setColor(String colorIn)
   {
      if (colorIn != null) {
         color = colorIn.trim();
         return true;
      } else {
         return false;
      }
   }
   /**
    * sets the edge if above 0.
    *
    * @return true if edge is above 0 and false if edge is below.
    * @param edgeIn the edge provided of the Octahedron 
    */
   public boolean setEdge(double edgeIn)
   {
      boolean isSet = false;
      if (edgeIn >= 0)
      {
         edge = edgeIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * returns the surfaceArea by multiplying 2 by the square root of 3
    * then multiplying it by the edge then squaring it.
    *
    * @return The surfaceArea of the octahedron provided. 
    */
   public double surfaceArea()
   {
      double area = 2 * Math.sqrt(3) * Math.pow(edge, 2);
      return area;
   }
   /**
    * returns the volume by getting the square root of 2 and dividing
    * by 3 then getting the cube root of the edge.
    *
    * @return The volume of the octahedron provided. 
    */
   public double volume()
   {
      double volume = (Math.sqrt(2) / 3) * Math.pow(edge, 3);
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
    * returns color.
    *
    * @return The color of the octahedron provided is given. 
    */
   public String getColor() {
      return color;
   }
   /**
    * returns label.
    *
    * @return The label of the octahedron provided is given. 
    */
   public String getLabel() {
      return label;
   }
   /**
    * returns edge.
    *
    * @return The edge of the octahedron provided is given. 
    */
   public Double getEdge() {
      return edge;
   }
   /**
    * returns Octahedron that can hold label, color, edge, volume, 
    * surfaceToVolumeRatio and surfacearea in a set manner.
    *
    * @return an output about the Octahedron label, color, edge, volume, 
    * surfaceToVolumeRatio and surfacearea. 
    */
   public String toString() 
   {
      
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      
      String output  = "Octahedron \"" + getLabel() + "\" is \""
            + getColor() + "\" with 12 edges of length " + getEdge()
            + " units.\n";
      output += "\tsurface area = " + df.format(surfaceArea())
            + " square units\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units\n";
      output += "\tsurface/volume ratio = "
            + df.format(surfaceToVolumeRatio());
      return output;
      
   }

}