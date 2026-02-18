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
public class CentralizedDB extends DB
{
   // instance variables
   private double license;
   
   //constructor
   /**
    * formats an item that: sets the name, base cost, database storage,
    * and license cost.
    *
    * @param nameIn the name of the Item.
    * @param baseCostIn the base cost of the Item.
    * @param dbStorageIn the database storage.
    * @param licenseIn the license cost.
    */
   public CentralizedDB(String nameIn, double baseCostIn, double dbStorageIn,
       double licenseIn)
   {
      super(nameIn, baseCostIn, dbStorageIn);
      license = licenseIn;
   }
   //methods
   /**
    * returns license.
    *
    * @return the license if it is avaliable.
    */ 
   public double getLicense()
   {
      return license;
   }
   /**
    * sets the license if it is avaliable.
    *
    * @param licenseIn the license provided of the Customer.
    */ 
   public void setLicense(double licenseIn)
   {
      license = licenseIn;
   }
   /**
    * returns the monthly cost.
    *
    * @return the monthly cost.
    */ 
   public double monthlyCost()
   {
      return baseCost + license;
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
      
      output += "\nLicense: " + fmt2.format(license);
      
      return output;
   }
}