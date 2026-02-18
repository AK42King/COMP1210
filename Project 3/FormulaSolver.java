import java.util.Scanner;
import java.text.DecimalFormat;

/**
*Uses the formula (6x^3 -4)sqrt(|7x^3 + 5x^2 + 3x +1|) and solves for x 
*and solves for characters left and right of decimal and format the result
*at the end.
*
*Project 3
*@author Lee Austin King - Comp 1210
*@version September 9, 2020
*/

public class FormulaSolver
{
/**
*Prints the result of the formula and displays left and right decimal characters
*and formats them.
*@param args Command line arguements - not used.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double out, in, xvalue, finale;
      int left, right;
      String result = "";
      System.out.print("Enter a value for x: ");
      xvalue = userInput.nextDouble(); //setting the x-value
      
      out = ((6 * (Math.pow(xvalue, 3))) - 4); 
      //solving the outside ofthe formula
      
      in = Math.abs((7 * (Math.pow(xvalue, 3)) + (5 * (Math.pow(xvalue, 2)))
         + (3 * xvalue) + (1))); //solving the inside of the formula
         
      finale = out * (Math.sqrt(in)); 
      //combines the previous results toget the answer
      
      System.out.println("Result: " + finale);
      
      result = Double.toString(finale);
      left = result.indexOf(".");
      System.out.println("# of characters to left of decimal point: "
         + left);
      
      right = result.length();
      System.out.println("# of characters to right of decimal point: "
         + (right - (left + 1)));
      
      DecimalFormat truefinal = new DecimalFormat("#,##0.0#####");
      System.out.println("Formatted Result: " + truefinal.format(finale));
   }
   
}