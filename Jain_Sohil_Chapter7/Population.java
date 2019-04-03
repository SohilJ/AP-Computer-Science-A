import java.util.Scanner;

public class Population {
	
	public double mPopulation() {
		
		Scanner aaa = new Scanner(System.in);
		int y = 2014;
		double p2014 = 123.8;
		double r = .05;
		double numRate = p2014 * r;// gets the amount of people that the population increases each y

		System.out.println("Insert a population for Mexico(in millions) above 123.8 million: ");
		double newPop = aaa.nextDouble();

		if (newPop < p2014) {
			System.out.println("Enter an number that is greater than 123.8 million");
			System.exit(0);
		}
		// while the new popluation is greater than the pop of 2014, add the numRate and
		// add 1 to the y
		while (newPop > p2014) {
			p2014 += numRate;
			y += 1;
		}

		System.out.println("Mexico will reach a population of " + p2014 + " in the y " + y);

		return p2014;
	}
   public static void main(String[] args)
   {
      Population pop = new Population();
      System.out.println(pop.mPopulation());
   }
}