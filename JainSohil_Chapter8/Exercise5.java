import java.util.Scanner;

public class Exercise5 {

   public static void main(String[] args) {
   
   
   
      String feed = "GeorgeBusk145424t1Hallowburgedrivef1FrownsturgAllieSammtl77458214t1fromtrueghytf1t100f100";
   
      String newFeed = feed.replace("f1","test");
      String newFeed1 = newFeed.replace("t1","f1");
      String newFeed2 = newFeed1.replace("test","t1");
      System.out.println(newFeed2);
   
   
   }

}