/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version November 10, 2020
*/
public class ItemsList
{
   // instance variables
   private InventoryItem[] inventory;
   private int count;
   
   //constructor
   /**
    * formats an item that: sets the name and price.
    *
    */
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   //methods
   /**
    * adds an Item to the list and increases the count.
    *
    * @param itemIn takes in an object to add to the list.
    */ 
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++;
   }
   /**
    * returns the total calculations in Inventory Items.
    *
    * @return returns the cost after it has been calculated
    * @param electronicsSurcharge takes ina double to multiple
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
  /**
   * returns the name of the file and the cost of the calculations.
   *
   * @return the name of the file and the cost of the calculations. 
   */
   public String toString() {
      String result = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         result += inventory[i] + "\n";
      }
      
      return result;
   }

}