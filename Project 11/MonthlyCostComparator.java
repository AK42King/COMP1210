import java.util.Comparator;

/**
 * Defines comparison by name.
 *
 * Project 10
 * @author Lee Austin King - Comp 1210
 * @version November 24, 2020
 */
public class MonthlyCostComparator implements Comparator<DB> {
/**
    * Compares DB objects based on monthly cost values.
    *
    * @param d1 1st object 
    * @param d2 2nd object
    * @return int comparison
    */
   public int compare(DB d1, DB d2) {
      if (d1.monthlyCost() > d2.monthlyCost()) {
         return -1;
      } 
      else if (d1.monthlyCost() < d2.monthlyCost()) {
         return 1;
      } 
      else {
         return 0;
      }
   }
}