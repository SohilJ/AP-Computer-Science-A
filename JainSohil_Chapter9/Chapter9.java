import java.util.Arrays;
public class Chapter9 {

public static void main(String[] args) {

int[] nums = {2,4,6,8,10,12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

//Addition

int sum = 0;

for (int i : nums)
    sum += i;


//Subtraction

int difference = 0;

for (int i : nums)
    difference -= i;


//Division

int product = 1;

for (int i : nums)
    product *= i;


int[] data = {sum,difference,-product};
System.out.println("Order: Addition, Subtraction, Division: ");
System.out.print(Arrays.toString(data));

}

}