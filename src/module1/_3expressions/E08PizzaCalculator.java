package module1._3expressions;

public class E08PizzaCalculator {
	//Exercise 8: Write code to match the flow chart given here:

	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#flowcharting
	public static void main(String[] args) {
		int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
		pizzaSlices = 16;
		numPeople = 5;
		slicesPerPerson = pizzaSlices/numPeople;
		leftoverSlices = pizzaSlices%numPeople;
		System.out.print("Each person gets "+slicesPerPerson+" slices of pizza and "+leftoverSlices+" slices of pizza are leftover.");

	}

}
