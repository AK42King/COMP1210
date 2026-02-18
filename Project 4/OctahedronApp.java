import java.util.Scanner;
/**
* sets data of customizable Octahedron and outputs it.
*
*Project 4-2
*@author Lee Austin King - Comp 1210
*@version September 18, 2020
*/
public class OctahedronApp {
   /**
    * sets data of user1 and user2 and outputs it.
    *
    * @param args Command-line arguments (unused). 
    */
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, color, and edge length"
         + " for an octahedron.");
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
      System.out.print("\tcolor: ");
      String color = scan.nextLine();
      System.out.print("\tedge: ");
      double edge = Double.parseDouble(scan.nextLine());
      Octahedron octa = new Octahedron(label, color, edge);
      
      if (!octa.setEdge(edge))
      {
      
         System.out.print("Error: edge must be non-negative.");
      }
      else
      {
         System.out.println("\n" + octa);
      }
   }
}