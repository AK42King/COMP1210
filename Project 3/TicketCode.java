import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
*Uses the formula (6x^3 -4)sqrt(|7x^3 + 5x^2 + 3x +1|) and solves for x 
*and solves for characters left and right of decimal and format the result
*at the end.
*
*Project 3-2
*@author Lee Austin King - Comp 1210
*@version September 10, 2020
*/

public class TicketCode
{
/**
*Prints the result of the formula and displays left and right decimal characters
*and formats them.
*@param args Command line arguements - not used.
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String ticket, section, row, seat, date, time, description;
      int min = 1;
      int max = 999;
      double price, cost, discount;
      NumberFormat percent = NumberFormat.getPercentInstance();
      NumberFormat dollar = NumberFormat.getCurrencyInstance();
      DecimalFormat df = new DecimalFormat("000"); //calling of all variables
      
      System.out.print("Enter ticket code: ");
      ticket = userInput.nextLine();
      ticket = ticket.trim();
      if (ticket.length() < 26)
      {
         System.out.println("\nInvalid ticket code.");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else
      {
         //calculates total price
         price = Double.parseDouble(ticket.substring(0, 5)) / 100;
         //calculates section
         section = ticket.substring(19, 21);
         //calculates row
         row = ticket.substring(21, 23);
         //calculates seat
         seat = ticket.substring(23, 25);
         //calculates date
         date = ticket.substring(11, 13) + "/" + ticket.substring(13, 15) + "/" 
            + ticket.substring(15, 19);
         //calculates time
         time = ticket.substring(7, 9) + ":" + ticket.substring(9, 11);
         //calculates discount
         discount = Double.parseDouble(ticket.substring(5, 7)) / 100;
         //calculates cost
         cost = price - (price * discount);
         //calculates description
         description = ticket.substring(25, ticket.length());
         
         // Prints ticket information
         System.out.print("\nDescription: " + description);
         System.out.print("   Date: " + date);
         System.out.println("   Time: " + time);
         System.out.print("Section: " + section);
         System.out.print("   Row: " + row);
         System.out.println("   Seat: " + seat);
         System.out.print("Price: " + dollar.format(price));
         System.out.print("   Discount: " + percent.format(discount));
         System.out.println("   Cost: " + dollar.format(cost));
         // Prints prize number
         System.out.print("Prize Number: " 
            + df.format(Math.random() * (max - min + 1) + min));
      }
   }
}