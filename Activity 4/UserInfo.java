/**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Assignment 4-1
*@author Lee Austin King - Comp 1210
*@version September 14, 2020
*/
public class UserInfo
{
   // instance variables
   private String firstName, lastName, location;
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   //constructor
   /**
    * formats a data storage called UserInfo that can hold name, 
    *    location, age, and status.
    *
    * @param firstNameIn The first name of the person provided.
    * @param lastNameIn The last name of the person provided. 
    */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
    
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
    
   }
   //methods
   /**
    * returns UserInfo that can hold name, location, age, and status in a 
    * set manner.
    *
    * @return name first and last name, location provided location,
    * age provided age, Status displays offline or online based on status var. 
    */
   public String toString() 
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
    * sets location.
    *
    * @param locationIn The location of the person provided. 
    */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   /**
    * sets age if above 0.
    *
    * @param ageIn The Age of the person provided
    * @return a true if age is above 0 and false if age is below. 
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    * returns age.
    *
    * @return The age of the person provided is given. 
    */
   public int getAge() {
      return age;
   }
   /**
    * returns location.
    *
    * @return The location of the person provided is given. 
    */
   public String getLocation() {
      return location;
   }
   /**
    * sets status to offline when logOff is triggered. 
    */
   public void logOff() {
      status = OFFLINE;
   }
    /**
    * sets status to online when logOn is triggered. 
    */
   public void logOn() {
      status = ONLINE;
   }
}