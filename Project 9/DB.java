import java.text.DecimalFormat;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public abstract class DB
{
   // instance variables
   protected double baseCost, dbStorage;
   protected String name;
   protected static int count = 0;
   
   //constructor
   /**
    * formats an item that: sets the name, base cost and database storage.
    *
    * @param nameIn the name of the Item.
    * @param baseCostIn The base cost of the Item.
    * @param dbObjIn The database storage of the Item.
    */
   public DB(String nameIn, double baseCostIn, double dbObjIn)
   {
      name = nameIn;
      baseCost = baseCostIn;
      dbStorage = dbObjIn;
      count++;
   }
   //methods
   /**
    * sets the name if it is avaliable.
    *
    * @return the name if it is avaliable.
    * @param nameIn the name provided of the Customer.
    */ 
   public boolean setName(String nameIn)
   {
      if (nameIn != null) {
         name = nameIn.trim();
         return true;
      } else {
         return false;
      }
   }
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
    * returns base cost.
    *
    * @return the base cost if it is avaliable.
    */ 
   public double getBaseCost()
   {
      return baseCost;
   }
   /**
    * sets the base cost.
    *
    * @param baseCostIn the base cost provided of the Customer.
    */ 
   public void setBaseCost(double baseCostIn)
   {
      baseCost = baseCostIn;
   }
   /**
    * returns database storage.
    *
    * @return the database storage if it is avaliable.
    */ 
   public double getDbStorage()
   {
      return dbStorage;
   }
   /**
    * sets the database storage.
    *
    * @param dbObjIn the database storage provided of the Customer.
    */ 
   public void setDbStorage(double dbObjIn)
   {
      dbStorage = dbObjIn;
   }
   /**
    * returns count.
    *
    * @return the count if it is avaliable.
    */ 
   public static int getCount()
   {
      return count;
   }
   /**
    * sets the count to 0.
    */ 
   public static void resetCount()
   {
      count = 0;
   }
  /**
   * returns the name of the file and the cost of the calculations.
   *
   * @return the name of the file and the cost of the calculations. 
   */
   public String toString() 
   {
       
      DecimalFormat fmt1 = new DecimalFormat("0.000");
      DecimalFormat fmt2 = new DecimalFormat("$#,##0.00");
      
      String output  =  name + " (class " + this.getClass().getName()
         + ") Monthly Cost: " + fmt2.format(monthlyCost());
         
      output += "\nStorage: " + fmt1.format(dbStorage) + " TB";
            
      output += "\nBase Cost: " + fmt2.format(baseCost);
      
      return output;
   }
  /**
   * returns the monthly cost of the object.
   * @return returns the monthly cost of the object.
   */
   public abstract double monthlyCost();
}