import java.util.Scanner;

public class Exercise4 {

   public static void main(String[] args) {
   
   
      Scanner in = new Scanner(System.in);
      String str;
      System.out.println("Enter String: ");
      str = in.next();
   
      char c = str.charAt(0);
   
      String stringStart = str.substring(1);
   
      System.out.println("Moving character [" + str.substring(0,1) + "] to the end");
   
      String stringTotal = (str.substring(1) + str.substring(0,1));
   
      System.out.println("New String is: " + stringTotal);
   
      
   
   
   }

}