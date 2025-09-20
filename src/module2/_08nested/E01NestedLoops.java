package module2._08nested;

public class E01NestedLoops {

	//Exercise 1: What does this program print out? Step through
	//it in the debugger.
	public static void main(String[] args) {
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 10; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

