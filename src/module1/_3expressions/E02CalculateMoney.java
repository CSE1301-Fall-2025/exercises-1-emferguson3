package module1._3expressions;

public class E02CalculateMoney {
	//Exercise 2: There is an error in the way that the total
	//is calculated. Find it and fix it!
	public static void main(String[] args) {
		int numDimes = 7;
		int numQuarters = 3;
		int numNickels = 8;

		int total = numDimes * 10 + numQuarters + 25 + numNickels*5;

		System.out.println("Total = " + total);
	}
}
