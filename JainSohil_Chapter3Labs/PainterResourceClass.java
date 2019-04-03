import java.util.Scanner;


public class PainterResourceClass
{
   //Allow keyboard input
   Scanner kb = new Scanner(System.in);
   
   //Initialize all the integers
   int areaOfFirstWall;
   int areaOfSecondWall;
   int areaOfThirdWall;
   int areaOfFourthWall;
   int areaOfWallWithoutWindows;

   //Make methods to find areas of all of the walls
   public void areaOfFirstWall()
   {
      System.out.println("Enter the length of the first wall: ");
      int length = kb.nextInt();
      System.out.println("Enter the width of the first wall: ");
      int width = kb.nextInt();
      areaOfFirstWall = length * width;
      System.out.println("The area of the wall is " + areaOfFirstWall);
   }
   public void areaOfSecondWall()
   {
      System.out.println("Enter the length of the second wall: ");
      int length = kb.nextInt();
      System.out.println("Enter the width of the second wall: ");
      int width = kb.nextInt();
      areaOfSecondWall = length * width;
      System.out.println("The area of the wall is " + areaOfSecondWall);
   }
   public void areaOfThirdWall()
   {
      System.out.println("Enter the length of the third wall: ");
      int length = kb.nextInt();
      System.out.println("Enter the width of the third wall: ");
      int width = kb.nextInt();
      areaOfThirdWall = length * width;
      System.out.println("The area of the wall is " + areaOfThirdWall);
   }
   public void areaOfFourthWall()
   {
      System.out.println("Enter the length of the fourth wall: ");
      int length = kb.nextInt();
      System.out.println("Enter the width of the fourth wall: ");
      int width = kb.nextInt();
      areaOfFourthWall = length * width;
      System.out.println("The area of the wall is " + areaOfFourthWall);
   }
   
   
   //Make method to find area of the wall without windows
   public void areaWithoutWindows()
   {
      //Only works with one window per wall upto 4
      System.out.println("Enter how many windows you have: ");
      int amountOfWindows = kb.nextInt();
      if(amountOfWindows == 1)
      {
         System.out.println("Enter the length of the window: ");
         int length2 = kb.nextInt();
         System.out.println("Enter the width of the window: ");
         int width2 = kb.nextInt();
         //System.out.println("The area of the wall is " + areaOfWallWithoutWindows);
         
         int areaOfWindow1 = length2 * width2;
         //int areaOfWindow2 = lengthTwo * widthTwo;
         //int areaOfWindow3 = lengthThree * widthThree;
         //int areaOfWindow4 = lengthFour * widthFour;
         int sumOfArea = areaOfFirstWall + areaOfSecondWall + areaOfThirdWall + areaOfFourthWall;
         int sumOfWindows = areaOfWindow1; /*areaOfWindow2; areaOfWindow3 areaOfWindow4*/
         int areaOfWallWithoutOneWindow = areaOfFirstWall - sumOfWindows;
         //int areaOfWallWithoutTwoWindows = sumOfArea - areaOfWindow2;
         //int areaOfWallWithoutThreeWindows = sumOfArea - areaOfWindow3;
         //int areaOfWallWithoutFourWindows = sumOfArea - areaOfWindow4;
         areaOfWallWithoutWindows = sumOfArea - areaOfWindow1;
         
         System.out.println("The area of the first wall without windows is " + areaOfWallWithoutOneWindow);
         //System.out.println("The area of the second wall without windows is " + areaOfWallWithoutTwoWindows);
         //System.out.println("The area of the third wall without windows is " + areaOfWallWithoutThreeWindows);
         //System.out.println("The area of the fourth wall without windows is " + areaOfWallWithoutFourWindows);
         System.out.println("The area of all of the walls without windows are " + areaOfWallWithoutWindows);
      
      }
      else if(amountOfWindows == 2)
      {
         System.out.println("Enter the length of the first window: ");
         int length2 = kb.nextInt();
         System.out.println("Enter the width of the first window: ");
         int width2 = kb.nextInt();
         System.out.println("Enter the length of the second window: ");
         int lengthTwo = kb.nextInt();
         System.out.println("Enter the width of the second window: ");
         int widthTwo = kb.nextInt();
         
         int areaOfWindow1 = length2 * width2;
         int areaOfWindow2 = lengthTwo * widthTwo;
         //int areaOfWindow3 = lengthThree * widthThree;
         //int areaOfWindow4 = lengthFour * widthFour;
         int sumOfArea = areaOfFirstWall + areaOfSecondWall + areaOfThirdWall + areaOfFourthWall;
         int sumOfWindows = areaOfWindow1 + areaOfWindow2; /*areaOfWindow3 areaOfWindow4*/
         int areaOfWallWithoutOneWindow = areaOfFirstWall - areaOfWindow1;
         int areaOfWallWithoutTwoWindows = areaOfSecondWall - areaOfWindow2;
         //int areaOfWallWithoutThreeWindows = sumOfArea - areaOfWindow3;
         //int areaOfWallWithoutFourWindows = sumOfArea - areaOfWindow4;
         areaOfWallWithoutWindows = /*areaOfWallWithoutFourWindows areaOfWallWithoutThreeWindows*/  sumOfArea - areaOfWindow1 - areaOfWindow2;
         System.out.println("The area of the first wall without windows is " + areaOfWallWithoutOneWindow);
         System.out.println("The area of the second wall without windows is " + areaOfWallWithoutTwoWindows);
         //System.out.println("The area of the third wall without windows is " + areaOfWallWithoutThreeWindows);
         //System.out.println("The area of the fourth wall without windows is " + areaOfWallWithoutFourWindows);
         System.out.println("The area of all of the walls without windows are " + areaOfWallWithoutWindows);
      }
      else if(amountOfWindows == 3)
      {
         System.out.println("Enter the length of the first window: ");
         int length2 = kb.nextInt();
         System.out.println("Enter the width of the first window: ");
         int width2 = kb.nextInt();
         System.out.println("Enter the length of the second window: ");
         int lengthTwo = kb.nextInt();
         System.out.println("Enter the width of the second window: ");
         int widthTwo = kb.nextInt();
         System.out.println("Enter the length of the third window: ");
         int lengthThree = kb.nextInt();
         System.out.println("Enter the width of the third window: ");
         int widthThree = kb.nextInt();
         
         int areaOfWindow1 = length2 * width2;
         int areaOfWindow2 = lengthTwo * widthTwo;
         int areaOfWindow3 = lengthThree * widthThree;
         //int areaOfWindow4 = lengthFour * widthFour;
         int sumOfArea = areaOfFirstWall + areaOfSecondWall + areaOfThirdWall + areaOfFourthWall;
         int sumOfWindows = areaOfWindow1 + areaOfWindow2 + areaOfWindow3; /*areaOfWindow4*/
         int areaOfWallWithoutOneWindow = areaOfFirstWall - areaOfWindow1;
         int areaOfWallWithoutTwoWindows = areaOfSecondWall - areaOfWindow2;
         int areaOfWallWithoutThreeWindows = areaOfThirdWall - areaOfWindow3;
         //int areaOfWallWithoutFourWindows = sumOfArea - areaOfWindow4;
         areaOfWallWithoutWindows = /*areaOfWallWithoutFourWindows*/ sumOfArea - areaOfWindow1 - areaOfWindow2 - areaOfWindow3;
         
         System.out.println("The area of the first wall without windows is " + areaOfWallWithoutOneWindow);
         System.out.println("The area of the second wall without windows is " + areaOfWallWithoutTwoWindows);
         System.out.println("The area of the third wall without windows is " + areaOfWallWithoutThreeWindows);
         //System.out.println("The area of the fourth wall without windows is " + areaOfWallWithoutFourWindows);
         System.out.println("The area of all of the walls without windows are " + areaOfWallWithoutWindows);
      }
      else if(amountOfWindows == 4)
      {
         System.out.println("Enter the length of the first window: ");
         int length2 = kb.nextInt();
         System.out.println("Enter the width of the first window: ");
         int width2 = kb.nextInt();
         System.out.println("Enter the length of the second window: ");
         int lengthTwo = kb.nextInt();
         System.out.println("Enter the width of the second window: ");
         int widthTwo = kb.nextInt();
         System.out.println("Enter the length of the third window: ");
         int lengthThree = kb.nextInt();
         System.out.println("Enter the width of the third window: ");
         int widthThree = kb.nextInt();
         System.out.println("Enter the length of the fourth window: ");
         int lengthFour = kb.nextInt();
         System.out.println("Enter the width of the fourth window: ");
         int widthFour = kb.nextInt();
         
         int areaOfWindow1 = length2 * width2;
         int areaOfWindow2 = lengthTwo * widthTwo;
         int areaOfWindow3 = lengthThree * widthThree;
         int areaOfWindow4 = lengthFour * widthFour;
         int sumOfArea = areaOfFirstWall + areaOfSecondWall + areaOfThirdWall + areaOfFourthWall;
         int sumOfWindows = areaOfWindow1 + areaOfWindow2 + areaOfWindow3 + areaOfWindow4;
         int areaOfWallWithoutOneWindow = sumOfArea - areaOfWindow1;
         int areaOfWallWithoutTwoWindows = sumOfArea - areaOfWindow2;
         int areaOfWallWithoutThreeWindows = sumOfArea - areaOfWindow3;
         int areaOfWallWithoutFourWindows = sumOfArea - areaOfWindow4;
         areaOfWallWithoutWindows = sumOfArea - areaOfWindow1 - areaOfWindow2 - areaOfWindow3 + areaOfWindow4;
         
         System.out.println("The area of the first wall without windows is " + areaOfWallWithoutOneWindow);
         System.out.println("The area of the second wall without windows is " + areaOfWallWithoutTwoWindows);
         System.out.println("The area of the third wall without windows is " + areaOfWallWithoutThreeWindows);
         System.out.println("The area of the fourth wall without windows is " + areaOfWallWithoutFourWindows);
         System.out.println("The area of all of the walls without windows are " + areaOfWallWithoutWindows);
         
      }
   }
   
   
}