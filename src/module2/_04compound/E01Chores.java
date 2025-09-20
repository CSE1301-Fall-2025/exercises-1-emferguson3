package module2._04compound;

public class E01Chores {

	//Exercise 1: Try running this program in different ways.
	//What combination is necessary for it to print "You can go out"?
	public static void main(String[] args) {
		boolean cleanedRoom = true;
		boolean didHomework = true;
		if (cleanedRoom && didHomework) {
			System.out.println("You can go out");
		}
		else {
			System.out.println("No, you can't go out");
		}
	}
}
