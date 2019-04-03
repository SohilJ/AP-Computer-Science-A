import java.util.Scanner;

public class ConvertCents {

   public static void main (String[] args) {
      Scanner kb = new Scanner(System.in);
      int cents,dollars,quarters,dimes,nickels,centsLeftinDollars,centsLeftinQuarters,centsLeftinDimes,centsLeftinNickels;
      int dollarsAmount=100;
      int quartersAmount=25;
      int dimesAmount=10;
      int nickelsAmount=5;
      
      // prompt the user to enter a total number of cents
      System.out.println("Enter the total number of cents you have: ");
      cents = kb.nextInt();
   
      //Prints out the amount of cents in coins
      dollars = cents/dollarsAmount;
      centsLeftinDollars = cents % dollarsAmount;
      
      quarters = centsLeftinDollars/quartersAmount;
      centsLeftinQuarters = centsLeftinDollars % quartersAmount;
      
      dimes = centsLeftinQuarters/dimesAmount;
      centsLeftinDimes = centsLeftinQuarters % dimesAmount;
      
      nickels = centsLeftinDimes/nickelsAmount;
      centsLeftinNickels = centsLeftinDimes % nickelsAmount;
   
      String newLine = System.getProperty("line.separator");
      
      //Prints out the number of cents
      System.out.print("For " + cents + " cents, you can get:" + newLine + dollars + " dollar(s)" + newLine + quarters + " quarter(s)" + newLine + dimes + " dime(s)" + newLine + nickels + " nickel(s)" + newLine + centsLeftinNickels + " pennies");
   }
}