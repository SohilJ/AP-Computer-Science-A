// Returns GCF of a and b
// Precondition: a > 0, b > 0
public class GCF{


   public static int gcf(int a, int b)
   {
      while (a!=0)
      {
      
         int temp = a;
      
      
         a = b % a;
         b = temp;     
      
         System.out.println(" a = " + a);
         System.out.println(" b = " + b);
         System.out.println(" temp = " + temp);
      }
      return b;
   }
   public static void main(String[] args){
   
      GCF fac = new GCF();
   
      fac.gcf(30,42);
   
   
   }
}