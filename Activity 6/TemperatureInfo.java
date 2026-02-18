import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
* sets data of customizable Temperatures and outputs it.
*
*Project 4-2
*@author Lee Austin King - Comp 1210
*@version September 18, 2020
*/
public class TemperatureInfo {
   /**
    * sets data of user1 and user2 and outputs it.
    *
    * @param args Command-line arguments (unused). 
    * @throws FileNotFoundException if file is not found, provided, or wrong.
    */
   public static void main(String[] args) throws FileNotFoundException
   {  //instantiating variables
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList 
         = new ArrayList<Integer>();
         
      /**
      *A do statement that loops until the returned output is nothing
      * during which it will add the value given to an arraylist.
      */
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals("")); 
      
      Temperatures temps = new Temperatures(tempsList);
      
      /**
      *A do statement that loops until the returned output is E
      * during which it will do commands from L, H, P, and other symbols
      * this will result in an error but will otherwise give the lowest
      * temperature, highest temperature, and the list with lowest and highest
      * temperatures or conclude on E.
      */
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         } 
      } while (choice != 'E');
   }
}