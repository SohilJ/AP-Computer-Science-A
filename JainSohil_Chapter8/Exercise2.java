import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise2 {

   public static void main(String[] args) {
   
   
      Scanner in = new Scanner(System.in);
      
     double newInterest;
     
      System.out.println("What is your initial balance: ");
      double initialBalance = in.nextDouble();
      System.out.println("What is your annual interest rate: ");
      double interestRate = in.nextDouble();
      System.out.println("What is your current age: ");
      int currentAge = in.nextInt();
      
      
      DecimalFormat formatter = new DecimalFormat("#0.00");
      System.out.println("The initial balance entered is: " + formatter.format(initialBalance) + " and the annual interest rate: " + formatter.format(interestRate));
      
      newInterest = (initialBalance*(interestRate/100));
     
     while (currentAge < 66) {
     
     System.out.println("For year " + (currentAge) + " Interest Made is: " + newInterest + " and new balance is: " + (newInterest+initialBalance));
     currentAge++;
     
     }
      
      
      
      
      
      
      }
      
      
   }



/* An online investment firm wants you to create a program that shows young people how their
money will grow over time. Your program will read the initial balance, annual interest rate, and
current age. Your program will then do the following:
a. Print out the interest rate and balance in a 2 decimal formatted line.
b. Calculate the interest made and new balance for each year.
c. End the print out when the person turns 65. */