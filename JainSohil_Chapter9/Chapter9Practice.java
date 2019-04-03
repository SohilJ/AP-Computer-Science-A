import java.util.Arrays;
public class Chapter9Practice {

public static void main(String[] args) {

int[] nums = {1,3,5,7,9,11,13,15,17,19,2,4,6,8,10,12,14,16,18,20};

//Print w/ EFL

for(int totalNum : nums) 
System.out.println(totalNum);

//Sort

Arrays.sort(nums);

//Print Sorted

System.out.println(Arrays.toString(nums));

//Change and Print Odd

int[] numsOdd = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39};
for(int totalOdd : numsOdd) 
System.out.println(totalOdd);

//Swaps positions and prints swapped

int[] numsOddSwapped = {3,1,7,5,11,9,15,13,19,17,23,21,27,25,31,29,35,33,39,37};

System.out.println(Arrays.toString(numsOddSwapped));



   }
   
}
