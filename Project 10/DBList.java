import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * creates the object of DBList with methods to 
 * get the objects list, invalid objects list,
 * add a DB object, read file and generate reports.
 *
 * @author Lee Austin King
 * @version 11/15/2020
 */
public class DBList {
   private DB[] objects;
   private String[] invalidRecords; 
   // will be used in project 11.
   /**
    * DB List constructor.
    */
   public DBList() {
   
      objects = new DB[0];
      invalidRecords = new String[0];
   }
   
   /**
    * Returns DBArray.
    *
    * @return gets the items in the list
    */
   public DB[] getDBArray() {
      return objects;
   }
   /**
    * returns the invalid records.
    *
    * @return returns the name of the list
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }

   /**
    * adds a value of DB to the objects array.
    *
    * @param nDB sets the DB value of the list
    */
   public void addDB(DB nDB) {
      objects = Arrays.copyOf(objects, objects.length + 1);
      objects[objects.length - 1] = nDB;
   }
   /**
    * adds a value of DB to the invalid objects array.
    *
    * @param nString sets the DB value of the list
    */
   public void addInvalidRecord(String nString) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = nString;
   }
   /**
    * reads the file and adds values of C, D, H, and E to 
    * their respective objects.
    * 
    * @param fileName input for the file name to parse.
    * @throws FileNotFoundException throws an exception if the file is not found
    */
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner scan = new Scanner(new File(fileName));
      
      while (scan.hasNext()) {
         Scanner scan2 = new Scanner(scan.nextLine());
         scan2.useDelimiter(",");
         
         String type = scan2.next();
         char chara = type.toUpperCase().charAt(0);
      
         switch (chara) {
            case 'C':
            
               addDB(new CentralizedDB(scan2.next(), Double.parseDouble(
                  scan2.next()), Double.parseDouble(scan2.next()), 
                  Double.parseDouble(scan2.next())));
                  
               break;
         
            case 'D':
            
               addDB(new DistributedDB(scan2.next(), Double.parseDouble(
                  scan2.next()), Double.parseDouble(scan2.next()),
                  Integer.parseInt(scan2.next()), Double.parseDouble(
                  scan2.next())));
                  
               break;
         
            case 'H':
               addDB(new HomogeneousDB(scan2.next(), Double.parseDouble(
                  scan2.next()), Double.parseDouble(scan2.next()),
                  Integer.parseInt(scan2.next()), Double.parseDouble(
                  scan2.next())));
                  
               break;
         
            case 'E':
               addDB(new HeterogeneousDB(scan2.next(), Double.parseDouble(
                  scan2.next()), Double.parseDouble(scan2.next()),
                  Integer.parseInt(scan2.next()), Double.parseDouble(
                  scan2.next())));
               break;
         
            default:
               
               break;
         }
      }
   }

   /**
    * generate report for default values.
    *
    * @return returns a string of the itemlist as is
    */
   public String generateReport() {
      String result = "-------------------------------"
            + "\nMonthly Database Report"
            + "\n-------------------------------\n";
      for (DB db : objects) {
         result += db.toString() + "\n\n";
      }
      return result;
   }

   /**
    * generate report for default values that are sorted.
    *
    * @return returns a string of the itemlist ordered by the class name
    */
   public String generateReportByName() {
      DB[] objectsCopy = Arrays.copyOf(objects, objects.length);
      Arrays.sort(objectsCopy);
      String result = "-----------------------------------------"
            + "\nMonthly Database Report (by Name)"
            + "\n-----------------------------------------\n";
      for (DB db : objectsCopy) {
         result += db.toString() + "\n\n";
      }
      return result;
   }

   /**
    * generate report for default values that are sorted by monthly cost.
    *
    * @return returns a string of the itemlist ordered by the price
    */
   public String generateReportByMonthlyCost() {
      DB[] objectsCopy = Arrays.copyOf(objects, objects.length);
      Arrays.sort(objectsCopy, new MonthlyCostComparator());
      String result = "-------------------------------------------------"
            + "\nMonthly Database Report (by Monthly Cost)"
            + "\n-------------------------------------------------\n";
      for (DB db : objectsCopy) {
         result += db.toString() + "\n\n";
      }
      return result;
   }
   /**
    * generate report for invalid records.
    *
    * @return returns a string of the itemlist ordered by the price
    */
   public String generateInvalidRecordsReport() {
      DB[] objectsCopy = Arrays.copyOf(objects, objects.length);
      Arrays.sort(objectsCopy, new MonthlyCostComparator());
      String result = "-------------------------------------------------"
            + "\nMonthly Database Report (by Monthly Cost)"
            + "\n-------------------------------------------------\n";
      for (DB db : objectsCopy) {
         result += db.toString() + "\n\n";
      }
      return result;
   }
}