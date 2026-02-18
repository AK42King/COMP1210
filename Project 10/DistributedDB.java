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
public class DistributedDB extends DB
{
   // instance variables
   protected int numberOfUsers;
   protected double costPerUser;
   /**
   * constant variable for DistributedDB.
   *
   * {@value #COST_FACTOR}
   */
   public static final double COST_FACTOR = 1.1;
   
   //constructor
   /**
    * formats an item that: sets the name, base cost, database storage,
    * user numbers, and cost per user.
    *
    * @param nameIn the name of the Item.
    * @param baseCostIn The base cost of the Item.
    * @param dbStorageIn The Database Objects of the Item. 
    * @param userIn The user cost.
    * @param cpu The cost per user.
    */
   public DistributedDB(String nameIn, double baseCostIn, double dbStorageIn,
      int userIn, double cpu)
   {
      super(nameIn, baseCostIn, dbStorageIn);
      numberOfUsers = userIn;
      costPerUser = cpu;
   }
   //methods
   /**
    * sets the number of users if it is avaliable.
    *
    * @param userIn the number of users provided of the Item.
    */ 
   public void setNumberOfUsers(int userIn)
   {
      numberOfUsers = userIn;
   }
   /**
    * returns number of users.
    *
    * @return the number of users if it is avaliable.
    */ 
   public int getNumberOfUsers()
   {
      return numberOfUsers;
   }
   /**
    * returns cost per user.
    *
    * @return the cost per user if it is avaliable.
    */ 
   public double getCostPerUser()
   {
      return costPerUser;
   }
   /**
    * sets the cost per user if it is avaliable.
    *
    * @param cpu the cost per user provided of the Item.
    */ 
   public void setCostPerUser(double cpu)
   {
      costPerUser = cpu;
   }
   /**
    * sets the user cost if it is avaliable.
    *
    * @return the user cost if it is avaliable.
    */ 
   public double userCost()
   {
      return costPerUser * numberOfUsers;
   }
    /**
    * gets the cost factor.
    *
    * @return the cost factor.
    */ 
   public double getCostFactor()
   {
      return COST_FACTOR;
   }
   /**
    * gets the monthly cost.
    *
    * @return the monthly cost.
    */ 
   public double monthlyCost()
   {
      return baseCost + userCost() * DistributedDB.COST_FACTOR;
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
      
      output += "\nNumber of Users: " + numberOfUsers;
            
      output += "\nCost per User: " + fmt2.format(costPerUser);
      
      output += "\nUser Cost: " + fmt2.format(userCost());
            
      output += "\nCost Factor: " + getCostFactor();
      
      return output;
   }
}