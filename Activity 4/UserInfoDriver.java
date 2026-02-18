/**
* sets data of two Users and outputs it.
*
*Assignment 4-2
*@author Lee Austin King - Comp 1210
*@version September 14, 2020
*/
public class UserInfoDriver {
   /**
    * sets data of user1 and user2 and outputs it.
    *
    * @param args Command-line arguments (unused). 
    */
   public static void main(String[] args)
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}