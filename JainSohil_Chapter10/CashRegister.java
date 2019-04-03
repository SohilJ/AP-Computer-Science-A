import java.util.Scanner;
public class CashRegister {

//Variables

int[] nums = new int[10];
Scanner in = new Scanner(System.in);
String name;
double value;
double newTotal;3

double taxRate = 0.05;

public CashRegister() { //Default Constructor


System.out.println("Enter Item Name:");
name = in.next();
System.out.println("Enter Cash Value:");
value = in.nextInt();

newTotal = (value*taxRate);
double newTotalCalculated = (value+newTotal);

System.out.println("With 5% tax rate, total is: " + newTotalCalculated);

}


public static void main(String[] args) { //Initializer

CashRegister register;

register = new CashRegister();

}

}