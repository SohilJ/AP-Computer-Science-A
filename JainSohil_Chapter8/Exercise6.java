import java.util.Scanner;

public class Exercise6 {

   public static void main(String[] args) {
      
      
      Scanner in = new Scanner(System.in);
      
      
      System.out.println("Enter your string: ");
      String line = in.next();
      
      int value = Integer.parseInt(line);
      
      if (line.length() < 10) 
      System.out.println("String length not 'valid'");
      
      else if (value > 0 && value < 5) 
      System.out.println("Check index valid 1");
      
      else if (value > 6 && value < 9)
      System.out.println("check index warning");
      
      else
      System.out.println("check index not a number, aborting intake.");      
      
      
      
      }
      
   }