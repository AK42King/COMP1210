/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class InventoryItem
{
   // instance variables
   protected double price;
   protected String name;
   private static double taxRate = 0;
   
   //constructor
   /**
    * formats an item that: sets the name and price.
    *
    * @param nameIn the name of the Item.
    * @param priceIn The prcie of the Item.
    */
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }
   //methods
   /**
    * returns name.
    *
    * @return the label if it is avaliable.
    */ 
   public String getName()
   {
      return name;
   }
   /**
    * returns the cost of the calculations.
    *
    * @return the cost of the calculations.
    */
   public double calculateCost()
   {
      return price * (1 + taxRate);
   }
   /**
    * sets the taxRate.
    *
    * @param taxRateIn the tax rate. 
    */
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
  /**
   * returns the name of the file and the cost of the calculations.
   *
   * @return the name of the file and the cost of the calculations. 
   */
   public String toString() 
   {
      return name + ": $" + calculateCost();
   }

}