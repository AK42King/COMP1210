import java.util.Scanner;

/**
*Reads seconds value provided by user and displays the days, 
*hours, minutes, and seconds in the time.
*
*Project 2
*@author Lee Austin King - Comp 1210
*@version August 31, 2020
*/

public class TimeConverter
{
/**
*Prints the converted seconds using user value.
*@param args Command line arguements - not used.
*/
   public static void main(String [] args)
   {
      Scanner userInput = new Scanner(System.in);
      int pSeconds, days, hours, minutes, seconds;
      System.out.print("Enter the raw time measurement in seconds: ");
      pSeconds = userInput.nextInt();
      if (0 <= pSeconds)
      {
         System.out.println();
         System.out.println("Measurement by combined days, hours, "
            + "minutes, seconds:");
      //Divides the total seconds by total seconds in a day
         days = pSeconds / 86400;
         System.out.println("\tdays: " + days);
      //Divides the remaing seconds by the amount of seconds in an hour 
         hours = (pSeconds - (days * 86400)) / (3600);
         System.out.println("\thours: " + hours);
      //Divides the remaing seconds by the amount of seconds in an minute
         minutes = (pSeconds - ((days * 86400) + (hours * 3600))) / (60);
         System.out.println("\tminutes: " + minutes);
      //subracts the remaing seconds by the amount of seconds leftover
         seconds = (pSeconds - ((days * 86400) + (hours * 3600)
            + (minutes * 60)));
         System.out.println("\tseconds: " + seconds);
      
         System.out.println();
         System.out.println(pSeconds + " seconds = " + days + " days, " + hours
            + " hours, " + minutes + " minutes, " + seconds + " seconds");
      }
      else
      {
         System.out.print("Measurement must be non-negative!");
      }
   }
}