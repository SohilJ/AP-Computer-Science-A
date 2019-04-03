import java.util.*;

public class SoundPressureSwitch {

   public static void main(String[] args) {
   
      double pascals, decibels,x;
      int sound=0;
      Scanner SoundPressure = new Scanner(System.in);
   
   
      System.out.println("Enter the Sound Pressure: ");
      pascals = SoundPressure.nextDouble();
   
      decibels = 20*Math.log10(pascals/20e-6);
     
      x=decibels;
   
   
   
   if (x<15)
      sound = 0;
   else if (x<30 && x>=15)
      sound = 30;
   else if (31<x && x<=45)
      sound = 30;
   else if (46<x && x<=60)
      sound = 60;
   else if (61<x && x<=75)
      sound = 60;
   else if (76<x && x<=90)
      sound = 90;
   else if (91<x && x<=95)
      sound = 90;
   else if (96<x && x<=100)
      sound = 100;
   else if (x<100 && x<=110)
      sound = 100;
   else if (x<111 && x<=125)
      sound = 120;
   else if (126<x && x<=130)
      sound = 130;
      
      
      
      
       
      switch(sound) {
      
         case 130:
            System.out.println("Threshold of Pain");
            break;
      
         case 120:
            System.out.println("Possible hearing damage");
            break;
      
         case 100:
            System.out.println("Jack hammer at 1 m");
            break;
      
         case 90:
            System.out.println("Traffic on a busy roadway at 10 m");
            break;
      
         case 60:
            System.out.println("Normal Conversation");
            break;
      
         case 30:
            System.out.println("Calm Library");
            break;
      
         case 0:
            System.out.println("Light leaf rustling");
            break;
      
         default:
            System.out.println("failed to calculate");
            break;
      
      }
   
   }


}