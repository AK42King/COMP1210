/**
*creates the object of Score.
*
*Assignment 8
*@author Lee Austin King - Comp 1210
*@version October 28, 2020
*/
public class Scores
{
   // instance variables
   private int[] numbers;
   
   //constructor
   /**
    * formats score that: sets numbers.
    *
    * @param numbersIn the array list of the Scores.
    */
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
   //methods
   /**
    * sets the even numbers as the output.
    *
    * @return the even numbers if it is avaliable. 
    */ 
   public int[] findEvens()
   {
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++; 
         }
      }
      return evens;
   }
   /**
    * sets the color if above 0.
    *
    * @return the odd numbers if it is avaliable.
    */
   public int[] findOdds()
   {
      int numberOdds = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++; 
         }
      }
      return odds;
   }
   /**
    * returns the average of the numbers in arraylist.
    *
    * @return an average of the Scores values. 
    */
   public double calculateAverage()
   {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      return ((double) sum / numbers.length);
   }
   /**
    * returns the values in numbers in reverse on different lines.
    *
    * @return an output about the Scores in numbers in the
    * array list on different line in reverse. 
    */
   public String toStringInReverse()
   {
      String output = "";
      for (int i = numbers.length - 1; i != -1; i--)
      {
         output += numbers[i] + "\t";
      }
      return output;
   }
   /**
    * returns the values in numbers on different lines.
    *
    * @return an output about the Scores in numbers in the
    * array list on different lines. 
    */
   public String toString()
   {
      String output = "";
      for (int i = 0; i < numbers.length; i++)
      {
         output += numbers[i] + "\t";
      }
      return output;
   }

}