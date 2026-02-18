/**
* sets data of customizable Octahedron and outputs it.
*
*Assignment 5-1
*@author Lee Austin King - Comp 1210
*@version September 21, 2020
*/
public class NumberOperations {
   //instance variables
   private int number;
   /**
    * sets number to provided NumberIn.
    *
    * @param numberIn the number provided. 
    */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   /**
    * return number.
    *
    * @return number provided previously. 
    */
   public int getValue() {
      return number;
   }
   /**
    * returns odd numbers under the provided value.
    *
    * @return odd numbers under the provided value. 
    */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t"; // outputs odd numbers
         }
         i++;
      }
      return output;
   }
  /**
    * returns numbers that can be raised to the power of two
    * under the provided value.
    *
    * @return numbers to the power of two under the value. 
    */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; //concatenate to ouput
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
    /**
    * returns a 1,-1, or 0 depending on if the number is greater than  or
    * less than the provided number
    *
    * @param compareNumber number being used to compare
    * @return 1,-1, or 0 depending on results of the number being greater
    * than or less than the compareNumber. 
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
    /**
    * returns the number provided with a string instance behind it.
    *
    * @return the number provided. 
    */
   public String toString()
   {
      return number + "";
   }
}