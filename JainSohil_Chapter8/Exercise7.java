import java.util.Scanner;
 
public class Exercise7
{
   public static void main(String args[])
   {
      String str1, str2, str3;
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter the first string");
      str1 = in.nextLine();
     
      System.out.println("Enter the second string");
      str2 = in.nextLine();
      
      System.out.println("Enter the third string");
      str3 = in.nextLine();
     
     int first = str1.length();
     int second = str2.length();
     int third = str3.length();
     
     
    // The == operator checks if the two strings are exactly the same object. The .equals() method check if the two strings have the same value.   
    
    
    if (first == second) {
    
    System.out.println(str1);
    System.out.println(str2);
    
    }
    
    else if (second == third) {
    
    System.out.println(str2);
    System.out.println(str3);
    
    }
    
    else if (first == third) {
    
    System.out.println(str1);
    System.out.println(str3);
    
    }
    
    else if (first == second && second == third) {
    
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    
    }
     
     
   }
}

