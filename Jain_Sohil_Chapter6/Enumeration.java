import java.util.Scanner;
public class Enumeration{

   
   private enum DayOfWeek {sunday, monday, tuesday, wednesday, thursday, friday, saturday};
   private enum MonthofTheYear {january, february, march, april, may, june, july, august, september, october, november, december};


   public static void main(String[] args){
   
   
      Scanner keyboard = new Scanner(System.in);
      int x;
      int y;
      
      System.out.println("input day");
      x = keyboard.nextInt();
   
      System.out.println("input month");
      y = keyboard.nextInt();
   
      String z = Integer.toString(x);
      String v = Integer.toString(y);
   
      String conString = z + v;
      System.out.println(conString);
   
   
   
      switch (x)
      {
         case 1:
            DayOfWeek currentDay = DayOfWeek.sunday;
            System.out.println(currentDay);
            break;
      
         case 2:
            currentDay = DayOfWeek.monday;
            System.out.println(currentDay);
            break;
      
         case 3:
            currentDay = DayOfWeek.tuesday;
            System.out.println(currentDay);
            break;
      
         case 4:
            currentDay = DayOfWeek.wednesday;
            System.out.println(currentDay);
            break;
      
         case 5:
            currentDay = DayOfWeek.thursday;
            System.out.println(currentDay);
            break;
      
         case 6:
            currentDay = DayOfWeek.friday;
            System.out.println(currentDay);
            break;
      
         case 7:
            currentDay = DayOfWeek.saturday;
            System.out.println(currentDay);
            break;  
      }
         
         
      switch (y)
      {
         case 1:
            MonthofTheYear currentMonth = MonthofTheYear.january;
            System.out.println(currentMonth);
            break;
      
         case 2:
            currentMonth = MonthofTheYear.february;
            System.out.println(currentMonth);
            break;
      
         case 3:
            currentMonth = MonthofTheYear.march;
            System.out.println(currentMonth);
            break;
      
         case 4:
            currentMonth = MonthofTheYear.april;
            System.out.println(currentMonth);
            break;
      
         case 5:
            currentMonth = MonthofTheYear.may;
            System.out.println(currentMonth);
            break;
      
         case 6:
            currentMonth = MonthofTheYear.june;
            System.out.println(currentMonth);
            break;
      
         case 7:
            currentMonth = MonthofTheYear.july;
            System.out.println(currentMonth);
            break;  
            
         case 8:
            currentMonth = MonthofTheYear.august;
            System.out.println(currentMonth);
            break;
      
         case 9:
            currentMonth = MonthofTheYear.september;
            System.out.println(currentMonth);
            break;
         
         case 10:
            currentMonth = MonthofTheYear.october;
            System.out.println(currentMonth);
            break;
      
         case 11:
            currentMonth = MonthofTheYear.november;
            System.out.println(currentMonth);
            break;
      
         case 12:
            currentMonth = MonthofTheYear.december;
            System.out.println(currentMonth);
            break;
      
      
      
      }
   }
}