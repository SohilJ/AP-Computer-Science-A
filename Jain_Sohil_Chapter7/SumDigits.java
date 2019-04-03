public class SumDigits {
	
	public static int sumDigits(String s) { 
		
		int intSum = 0;
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int sum = Character.getNumericValue(ch[i]);
			intSum += sum;
		}
      
		return intSum;
	}
   
   public static void main(String[] args){
   
   SumDigits dig = new SumDigits();
   System.out.print(dig.sumDigits("21"));
   
   }
}