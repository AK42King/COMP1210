import java.util.Scanner;

/**
*
*Reads xyz values provided by user and displays the result of the equation.
*
*Project 2
*@author Lee Austin King - Comp 1210
*@version August 31, 2020
*/

public class ExpressionResult
{
/**
*Prints a result of an expression using user inputs.
*@param args Command line arguements - not used.
*/
   public static void main(String [] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x, y, z, result;
   
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
      
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      
      result = ((x - 1.1) * ((2 * y) + 2.2) * ((4 * z) + 4.4)) / (x * y * z);
      if (x * y * z == 0)
      {
         System.out.println("result is \"undefined\"");
      }
      else
      {
         System.out.println("result = " + result);
      }
   }
}