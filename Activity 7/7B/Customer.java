import java.text.DecimalFormat;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 21, 2020
*/   
public class Customer implements Comparable<Customer>
{
   // instance variables
   private String name = "", location = "";
   private double balance = 0;
   
   //constructor
   /**
    * formats a shape that: sets the name, sets the location, and
    * sets the balance.
    *
    * @param nameIn the name of the Customer.
    */
   public Customer(String nameIn)
   {
    
      name = nameIn;
      location = "";
      balance = 0;
    
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
    * sets the location if it is avaliable.
    *
    * @return the location if it is avaliable.
    * @param locationIn the location provided of the Customer.
    */
   public boolean setLocation(String locationIn)
   {
      if (locationIn != null) {
         location = locationIn.trim();
         return true;
      } else {
         return false;
      }
   }
   /**
    * sets the location if it is avaliable.
    *
    * @param city the city provided of the Customer.
    * @param state the state provided of the Customer.
    */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }
   /**
    * adds to the balance if above 0.
    *
    * @return true if balance is above 0 and false if balance is below.
    * @param balanceIn the balance provided of the Customer.
    */
   public boolean changeBalance(double balanceIn)
   {
      boolean isSet = false;
      if (balanceIn >= 0)
      {
         balance += balanceIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * compares the obj and returns 1 if the given obj is greater than
    * the compared object -1 if the given obj is smaller than the
    * compared object and 0 if the objects are the same.
    *
    * @return 1 if the given obj is greater than the compared object
    * -1 if the given obj is smaller than the compared object and 0
    * if the objects are the same.
    * @param obj the object being compared.
    */ 
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; // consider them equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; // should return a negative
      }
      else {
         return 1; // should return a positive
      }
   }
   /**
    * returns location.
    *
    * @return The location of the Customer provided is given. 
    */
   public String getLocation() {
      return location;
   }
   /**
    * returns balance.
    *
    * @return The balance of the Customer provided is given. 
    */
   public Double getBalance() {
      return balance;
   }
   /**
    * returns Customer that can hold name, location, and balance
    * in a set manner.
    *
    * @return an output about the Customer name, location, and balance. 
    */
   public String toString() 
   {
      
      DecimalFormat df = new DecimalFormat("$#,##0.0#");
      
      String output  = name + "\n" + getLocation() + "\n"
         + df.format(getBalance());
      return output;
      
   }

}