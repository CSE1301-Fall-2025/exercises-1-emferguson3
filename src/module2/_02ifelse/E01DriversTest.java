package module2._02ifelse;

import java.util.Scanner;
public class E01DriversTest {
	
	//Exercise 1: Run this program a few times with different values to see how it works.
	//Can you change the code to allow you to acquire a license at age 16?
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if (age >= 16) {
			System.out.println("You can get a driver's license in most states!");
		}
		else {
			System.out.println("Sorry, you need to be older to get a driver's license.");
		}
	}
}
