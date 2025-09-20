package module2._02ifelse;

import java.util.Scanner;
public class E02TestMidterm {

	//Exercise 2: Rewrite this code to use an if/else statement instead
	//of two if statements.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Did you pass the midterm exam?");

		boolean passedExam = scan.nextBoolean();
		if (passedExam) {
			System.out.println("Good job studying!");
		}
		else {
			System.out.println("Study harder next time.");
		}
	}
}
