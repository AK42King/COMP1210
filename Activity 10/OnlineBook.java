   /**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class OnlineBook extends OnlineTextItem
{
   // instance variables
   protected String author;
   
   //constructor
   /**
    * formats an item that: sets the name and price.
    *
    * @param nameIn the name of the Item.
    * @param priceIn The prcie of the Item.
    */
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   //methods
   /**
    * sets the auhtor.
    *
    * @param authorIn the author provided of the SpheroCylinder. 
    */
   public void setAuthor(String authorIn)
   {
      author = authorIn;
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
      return name + " - " + author + ": $" + super.calculateCost();
   }

}