import javax.swing.JOptionPane;
/**
*A method that divides by int in a regular manner where it excludes decimals
* and disallows for dividing by 0 and divides including decimals.
*
*Activity 11
*@author Lee Austin King - Comp 1210
*@version November 17, 2020
*/
public class DivisionDriver {
   /**
    * The main method thatdivides by int in a regular manner where it 
    * excludes decimals and disallows for dividing by 0 and divides 
    * including decimals.
    * @param args command line arguments
    */
   public static void main(String[] args) {
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Interger division: \n"
               + Division.intDivide(num, denom)
               + "\n\nFloating point division: \n"
               + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result", 
            JOptionPane.PLAIN_MESSAGE);
      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Invalid input: enter numerical "
            + "integer value only.", "Error", JOptionPane.ERROR_MESSAGE);
      } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error", 
            JOptionPane.PLAIN_MESSAGE);
      }
   }
}