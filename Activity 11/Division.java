/**
*Divides by int in a regular manner where it excludes decimals
* and disallows for dividing by 0 and divides including decimals.
*
*Activity 11
*@author Lee Austin King - Comp 1210
*@version November 17, 2020
*/
public class Division {
   /**
    * Divides by int in a regular manner where it excludes decimals
    * and disallows for dividing by 0.
    *
    * @param num number to be divided
    * @param denom number to be divided
    * @return returns the int value of the divide numbers
    */
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
    * Divides by int in a regular manner and disallows for dividing by 0.
    *
    * @param num number to be divided
    * @param denom number to be divided
    * @return returns the float value of the divided numbers
    * @throws IllegalArgumentException an illegal arguement 
    *    if the denominator is 0
    */
   public static float decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The demoninator "
            + "cannot be zero");
      }
      return (float) num / denom;
   }
}