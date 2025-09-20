package module3._2traversing;

public class E03OffByone {
	
	//Exercise 3: There are two off by one errors in this code,
	//find them and fix them!
	public static void main(String[] args) {
		int[] scores = { 10, 9, 8, 7};
		// Make this loop print out all the scores!
		for (int i = 0; i < scores.length; i++) {
			System.out.println(  scores[i] );
		}
	}
}

