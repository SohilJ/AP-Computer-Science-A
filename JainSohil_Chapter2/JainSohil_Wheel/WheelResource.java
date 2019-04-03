import java.util.*;

public class WheelResource {

   public void work() {
   
   
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter Diameter: ");
      int diameter = keyboard.nextInt();
      double revolution = 3.14*diameter;
      System.out.println("One Revolution is: " + revolution);
      double revMile = 63360/revolution;
      System.out.println("The number of revolutions per mile is: " + revMile);
      System.out.println("--------------------------------------------------");
      System.out.println("Enter the number of miles in a trip: ");
      int miles = keyboard.nextInt();
      double inchesInTrip = miles * 63360;
      double revolutionsInTrip = inchesInTrip/revolution;
      System.out.println("The number of inches in a trip: " + inchesInTrip);
      System.out.println("The number of revolutions in a trip: " + revolutionsInTrip);
   }

}