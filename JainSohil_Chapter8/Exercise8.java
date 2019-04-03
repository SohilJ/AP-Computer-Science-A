import java.util.Scanner;

public class Exercise8 {
   public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   
   
   System.out.println("Enter a string of 20 characters.");
   String str = in.nextLine();
   
   String stringCompare = str.substring(7,11);
   
   String good = "good";
   
   System.out.println("Comparing string 'good' from position 7 to 11...");
   
   if (stringCompare.equals(good))
   System.out.println("[string acceptable]");
   else
   System.out.println("[string rejected]");
   
   
   
   
   
   }
}