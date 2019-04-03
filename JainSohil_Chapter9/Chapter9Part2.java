import java.util.*;

public class Chapter9Part2 {

   public static void main(String[] args) {
   
   int sum = 0;
   int message = 0;
   
   //Recreate matrix in an array
   
      int[][] array = new int[][]
      {{36,37,51,46,59},{95,14,81,33,1},{2,88,96,50,80},{395,14,81,33,1},{78,5,50,80,98},{82,22,45,47,128},{70,16,40,48,39},{85,54,75,81,26},{9,80,7,49,89},{2,88,296,50,480},{82,22,45,47,228}};
         
      int totalsum[] = new int[11];
        
      for (int column = 0; column<11; column++) { //11 columns
         for (int row = 0; row<5; row++) { //5 rows
            
            sum = array[column][row] + sum; //Row*Column 
            
         } 
        
         totalsum[column] = sum;
         sum = 0;
             
      }
        
        System.out.println("Matrix (Rows summed): " + Arrays.toString(totalsum));
      
      //-------------------2d-------------------// 
           
     int index=0;
      
     char[] ch = {'.','?','!',',',' ',' ',' ',' ',' ',' '};
     
     char[] indexTen = new char[100];
     char[] alphabet = new char[91];
   
      for(char i= 'a'; i<= 'z'; i++) {
         
         if(index == 91)
            break;
        
         alphabet[index] = i;
         
         if(i== 'z') { //If statement that starts at 'a' and puts in alphabet starting at index 10
            
            i= 'a';
            alphabet[index+ 1] = 'a';
            index++;
            
         }    
         
         index++;
      }
   
      
      for(int i=9;i <100; i++){ //Goes through letters in array starting from 9
         indexTen[i]= alphabet[i-9];        
      }
                        
   
      char sumArray[] = new char[array.length];
      
      
      for(int l=0; l<array.length;l++){
      
      message = totalsum[l]%100;
      
      sumArray[l]=indexTen[message-1];
      }
      
      String sumArray1 = new String(sumArray);
      
      String str1 = sumArray1.substring(0,9); 
      
      String str2 = sumArray1.substring(9,10);
      
      String str3 = sumArray1.substring(10);
      
      System.out.print(str1+ " " +str2 + " "+str3 + "\n" );
      System.out.println("TO BOLDLY GO");
   
   

   
            
   }
         
}