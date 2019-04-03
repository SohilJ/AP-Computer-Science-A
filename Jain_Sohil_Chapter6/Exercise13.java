public class Exercise13
{
   public boolean isLeapYear(int year)
   {
      if(year%4==0 && year%100 != 0)
         return true;
      else if(year%4==0 && year%400==0)
         return true;
      else
         return false;
   }
   public static void main(String[] args)
   {
      Exercise13 ex = new Exercise13();
      System.out.println(ex.isLeapYear(2012));
   }
   
}