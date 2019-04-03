import java.util.Scanner;

public class StarTriangle
{
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      int n;
   
      System.out.println("Enter a number");
      n = kb.nextInt();
   
      for (int row = 1; row <= n; row++)
      {
         for (int count=1; count <= row; count++)
         {
            System.out.print("*");
         }
         System.out.println();
      
         while ((row>=n) && row<(2*n))
         {
            for(int ct = n; ct>=(row-n);ct--)
               System.out.print("*");
            System.out.println();
            row++;
         }
      }
      System.out.print("*");
   }
}