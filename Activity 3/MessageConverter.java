import java.util.Scanner;

/**
*Reads the message the user provides and encodes it.
*
*Activity 3
*@author Lee Austin King - Comp 1210
*@version September 8, 2020
*/

public class MessageConverter
{
/**
*Prints the encoded message using user value from 0-5.
*@param args Command line arguements - not used.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      String result = "";
      int outputType;
      System.out.print("Type in a message and press enter: \n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
         + "\n\t0: As is"
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      //converts user input from string to primitive int
      
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) //as is
      {
         result = message;
      }
      else if (outputType == 1) //trimmed
      {
         result = message.trim();
      }
      else if (outputType == 2) // lower case
      {
         result = message.toLowerCase();
      }
      else if (outputType == 3) // upper case
      {
         result = message.toUpperCase();
      }
      else if (outputType == 4) // vowels replaced
      {
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) //without first and last characters
      {
         result = message.substring(1, message.length() - 1);
      }
      else // reports an error for values not covered
      {
         result = "Error: Invalid choice input";
      }
      
      System.out.println("\n" + result); //prints the result on new line
   }
   
}
