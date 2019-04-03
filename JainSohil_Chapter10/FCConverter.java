public class FCConverter
{
   private double celsius, fahrenheit;
   
   public void setFahrenheit(double degrees)
   {
      fahrenheit = degrees;     //sets fahrenheit
   }
   public void setCelsius(double degrees)
   { 
      celsius = degrees;    //sets celsius
   }
   public double getFahrenheit()
   {
      fahrenheit = celsius * (9/5) + 32;    //converts celsius to fahrenheit
      return fahrenheit;
   }
   public double getCelsius()
   {
      celsius = (fahrenheit - 32) * 5/9;     //converts fahrenheit to celsius
      return celsius;
   }
}
