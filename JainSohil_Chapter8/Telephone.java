import java.util.Scanner;
public class Telephone {
   public static void main(String[] args) {
   
      String number;
      Scanner in = new Scanner(System.in);
     
      number = in.next();
      System.out.println("The Phone Number is: " + "(" + number.substring(0,3) + ")" + "-" + number.substring(3,6) + "-" + number.substring(6,10));
   
   
   }
}
