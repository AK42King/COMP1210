   /**
*creates the object of UserInfo with methods to 
*set age, location, and log in or out, name has to be 
*set when declaring UserInfo.
*
*Project 7-B1
*@author Lee Austin King - Comp 1210
*@version October 24, 2020
*/
public class OnlineArticle extends OnlineTextItem
{
   // instance variables
   private int wordCount;
   
   //constructor
   /**
    * formats an item that: sets the name and price.
    *
    * @param nameIn the name of the Item.
    * @param priceIn The prcie of the Item.
    */
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   //methods
   /**
    * sets the label if it is avaliable.
    *
    * @param wordCountIn the word Count. 
    */ 
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
   
}