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
public class OctahedronListMenuApp {
   /**
    * sets data of user1 and user2 and outputs it.
    *
    * @param args Command-line arguments (unused). 
    * @throws FileNotFoundException if file is not found, provided, or wrong.
    */
   public static void main(String[] args) throws FileNotFoundException
   {  //instantiating variables
      String label = "*** no list name assigned ***";
      String fileName = "no file Name";
      Scanner userInput = new Scanner(System.in);
      ArrayList<Octahedron> octList 
         = new ArrayList<Octahedron>();
      OctahedronList temps = new OctahedronList(label, octList);
      
      System.out.println("Octahedron List System Menu\n"
                       + "R - Read File and Create Octahedron List\n"
                       + "P - Print Octahedron List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Octahedron\n"   
                       + "D - Delete Octahedron\n"   
                       + "F - Find Octahedron\n"
                       + "E - Edit Octahedron\n"
                       + "Q - Quit");
      /**
      *A do statement that loops until the returned output is E
      * during which it will do commands from L, H, P, and other symbols
      * this will result in an error but will otherwise give the lowest
      * temperature, highest temperature, and the list with lowest and highest
      * temperatures or conclude on E.
      */
      
      char choice = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         
         switch (choice) {
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = userInput.nextLine();
               
               temps = temps.readFile(fileName);
               System.out.println("\tFile read in and Octahedron "
                  + "List created\n");
               break;
               
            case 'P':
               System.out.print(temps.toString());
               break;
               
            case 'S':
               System.out.println("\n" + temps.summaryInfo());
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tColor: ");
               String color = userInput.nextLine();
               System.out.print("\tEdge: ");
               double edge = Double.parseDouble(userInput.nextLine());
               temps.addOctahedron(label, color, edge);
               System.out.println("\n*** Octahedron added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (temps.findOctahedron(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               } else {
                  Octahedron deleteOct = temps.deleteOctahedron(label);
                  label = deleteOct.getLabel();
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (temps.findOctahedron(label) != null) {
                  Octahedron findOcta = temps.findOctahedron(label);
                  System.out.println(findOcta.toString() + "\n");
               } else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tColor: ");
               String colors = userInput.nextLine();
               System.out.print("\tEdge: ");
               double edges = Double.parseDouble(userInput.nextLine());
               
               if (temps.findOctahedron(label) != null) {
                  temps.editOctahedron(label, colors, edges);
                     
                  System.out.println("\t\"" 
                     + temps.findOctahedron(label).getLabel()
                     + "\" successfully edited\n");
               } else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               
               break;
               
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
         } 
      } while (choice != 'Q');
   }
}