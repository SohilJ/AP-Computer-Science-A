import java.util.Scanner;
 
public class Exercise9
{
   public static void main(String args[])
   {
     char c=0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter word: ");
      String str = in.nextLine();
      
       for(int i=0; i<str.length();i++) 
         c = str.charAt(i);
        
        
        int a=Character.getNumericValue(c);
        System.out.println(a);
      
      }
      
   }
