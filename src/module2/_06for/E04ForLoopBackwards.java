package module2._06for;

public class E04ForLoopBackwards {

	//Exercise 4: Edit the loop to count down from 5 to 1 by 2s. The result should be:

	//5
	//3
	//1
	public static void main(String[] args) {
		for(int count = 5; count >= 0; count-=2) {
			System.out.println(count);
		}
	}
}
