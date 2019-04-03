/* Enter a string. Either change the string to all lower case or all uppercase. Using the ASCII Chart,
create a switch statement that will take each character and convert it to its Ascii integer value.
Add the values. */

import java.util.Scanner;
 
public class Exercise10
{
   public static void main(String args[])
   {
     char c = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter uppercase word: ");
      String str = in.nextLine();
      
      String strLower = str.toLowerCase();
      System.out.println(strLower);
      
   for(int i=0; i<strLower.length();i++) 
        c = strLower.charAt(i);  
        
         
     switch (c) {
      
       case 'a': int a = 97; break;
       case 'b': int b = 98; break;
       case 't': int t = 99; break;
       case 'd': int d = 100; break;
       case 'e': int e = 101; break;
       case 'f': int f = 102; break;
       case 'g': int g = 103; break;
       case 'h': int h = 104; break;
       case 'i': int i = 105; break;
       case 'j': int j = 106; break;
       case 'k': int k = 107; break;
       case 'l': int l = 108; break;
       case 'm': int m = 109; break;
       case 'n': int n = 110; break;
       case 'o': int o = 111; break;
       case 'p': int p = 112; break;
       case 'q': int q = 113; break;
       case 'r': int r = 114; break;
       case 's': int s = 115; break;
       case 'u': int u = 116; break;
       case 'v': int v = 117; break;
       case 'w': int w = 118; break;
       case 'x': int x = 119; break;
       case 'y': int y = 120; break;
       case 'z': int z = 121; break;
           
           
           
    }
  
      
   }
   
}
     
