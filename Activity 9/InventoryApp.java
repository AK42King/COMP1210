/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class InventoryApp {
 /**
 *Prints information from the Inventory app.
 *@param args Command line arguments - not used.
 */
   public static void main(String[] args)
   {
      InventoryItem it = new InventoryItem("Oil change kit", 39.00);
      it.setTaxRate(0.05);
      ElectronicsItem e = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle oa = new OnlineArticle("Java News", 8.50);
      oa.setWordCount(700);
      OnlineBook ob = new OnlineBook("Java for Noobs", 13.37);
      ob.setAuthor("L. G. Jones");
      System.out.println(it);
      System.out.println(e);
      System.out.println(oa);
      System.out.println(ob);
   
   }
}