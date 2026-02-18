import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
/**
* sets data of customizable Octahedron and outputs it.
*
*Project 4-2
*@author Lee Austin King - Comp 1210
*@version September 18, 2020
*/
public class OctahedronListApp {
   /**
    * sets data of user1 and user2 and outputs it.
    *
    * @param args Command-line arguments (unused). 
    * @throws FileNotFoundException if file is not found, provided, or wrong.
    */
   public static void main(String[] args) throws FileNotFoundException
   {      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      ArrayList<Octahedron> octaList = new ArrayList<Octahedron>();
      Scanner scanFile = new Scanner(new File(fileName));

      
      String name = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         double edge = scanFile.nextDouble();
         String trash = scanFile.nextLine();
         
         octaList.add(new Octahedron(label, color, edge));
      }
      OctahedronList octahedronList = new OctahedronList(name, octaList);
      System.out.print("\n" + octahedronList.toString());
      System.out.print("\n" + octahedronList.summaryInfo());
   }
}