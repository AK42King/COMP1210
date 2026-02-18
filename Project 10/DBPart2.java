import java.io.FileNotFoundException;

/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class DBPart2 {
   /**
    *generates the reports of default, by name, and by monthly cost.
    *
    * @param args command line argument for the file name
    * @throws FileNotFoundException exception if the file is not found
    */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      } else {
         String fileName = args[0];
         DBList a = new DBList();
         a.readFile(fileName);
         System.out.print(a.generateReport());
         System.out.print(a.generateReportByName());
         System.out.print(a.generateReportByMonthlyCost());
      }
   }
}