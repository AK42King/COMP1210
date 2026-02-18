   /**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class ElectronicsItem extends InventoryItem
{
   // instance variables
   protected double weight;
   /**
   * constant variable for Electronics Item.
   *
   * {@value #SHIPPING_COST}
   */
   public static final double SHIPPING_COST = 1.5;
   
   //constructor
   /**
    * formats an item that: sets the name and price.
    *
    * @param nameIn the name of the Item.
    * @param priceIn The price of the Item.
    * @param weightIn the weight of the Item.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   //methods
   /**
    * returns the cost of the calculations.
    *
    * @return the cost of the calculations.
    */
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}