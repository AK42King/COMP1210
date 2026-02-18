import java.util.ArrayList;
/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Assignment 4-1
*@author Lee Austin King - Comp 1210
*@version September 14, 2020
*/
public class Temperatures
{
   // instance variables
   private int temp = 0;
   private ArrayList<Integer> temperatures
      = new ArrayList<Integer>();
   //constructor
   /**
    * sets the temperatures arraylist to the provided one.
    *
    * @param temperaturesIn The arraylist provided.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   //methods
   /**
    * returns Temperatures, lowTemp, and highTemp with labels in front of them.
    *
    * @return Temperatures, lowTemp, and highTemp with text in front of them. 
    */
   public String toString() 
   {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }
   /**
    *returns the lowest temperature after comparing the value to the others
    * in the arraylist.
    *
    * @return the lowest temperature value from the arraylist. 
    */
   public int getLowTemp()
   {
      if (temperatures.isEmpty()) {
         return 0;
      } else {
         int low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
               low = temperatures.get(i);
            }
         }
         return low;
      }
   }
   /**
    *returns the highest temperature after comparing the value to the others
    * in the arraylist.
    *
    * @return the highest temperature value from the arraylist. 
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      } else {
         int high = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > high) {
               high = temperatures.get(i);
            }
         }
         return high;
      }
   }
   /**
    *returns the lower value between the provided value and lowest value in the 
    * arraylist.
    *
    * @return the lowest value between the provided and lowest arraylist value.
    * @param lowIn the provided value to be compared 
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
    /**
    *returns the higher value between the provided value and highest value
    * in the arraylist.
    *
    * @return the higher value between the provided and largest arraylist value.
    * @param highIn the provided value to be compared 
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
}