public class Multiplication {
	
   public int product(int a, int b) { 
   	
      int product = 0;
   
      if (a >= 0 && b >= 0)// makes sure a and b are greather than 0
      {
         for (int i = 0; i < b; i++)// makes a add onto itself the amount b
            product += a;
      
         System.out.println("The product of " + a + " times " + b + " = " + product);// prints out the product
      } else
         System.out.println("Enter two numbers that are greater than 0");// if a or b are less than 0
   
      return product;
      
   
   }

   public static void main(String[] args) {
   
      Multiplication times = new Multiplication();
      System.out.println(times.product(9,8));
   
   }
}
