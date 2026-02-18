/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class HeterogeneousDB extends DistributedDB
{
   /**
   * constant variable for HeterogeneousDB.
   *
   * {@value #COST_FACTOR}
   */
   public static final double COST_FACTOR = 1.3;
   
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
   public HeterogeneousDB(String nameIn, double baseCostIn, double dbStorageIn,
      int userIn, double cpu)
   {
      super(nameIn, baseCostIn, dbStorageIn, userIn, cpu);
   }
   //methods
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
      return baseCost + userCost() * HeterogeneousDB.COST_FACTOR;
   }
}