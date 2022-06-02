package lab3;

public class Que2 {
	public static int computeDifference(int n){
	      //sum of squares of n natural numbers
//	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
//	      //sum of n natural numbers
//	      int sumN = (n * (n + 1)) / 2;
//	      //square of sum of n natural numbers
//	      int squareSumN = sumN * sumN;
//	      //difference
//	      return Math.abs(sumSquareN - squareSumN);
		int SquareSum = 0;
		int DigitSum = 0;
		
		for (int i=1; i<=n;i++) {
			SquareSum+=i*i;
		}
		for (int i=1; i<=n;i++) {
			DigitSum+=i;
		}
		DigitSum = DigitSum*DigitSum;
		return DigitSum-SquareSum;
		
	   }
	   public static void main(String args[]){
	      int n = 4;
	      System.out.println("Number: " + n);
	      System.out.println("Difference: " + computeDifference(n));
	   }


}
