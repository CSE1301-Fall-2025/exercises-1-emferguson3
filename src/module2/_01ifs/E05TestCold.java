package module2._01ifs;

import java.util.Scanner;
public class E05TestCold {
	
	//Exercise 5: This program has errors due to the lack
	//of brackets. Find and fix the problem.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Is it cold?");
		boolean isCold = scan.nextBoolean();

		if (isCold){
		System.out.println("Wear a coat");
		System.out.println("Wear gloves");
	}
	}
}
