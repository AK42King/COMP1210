/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class InvalidCategoryException extends Exception {
   /**
    *method for the invalid category exception.
    *
    * @param categoryIn takes in the invalid category
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}