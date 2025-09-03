package module1._3expressions;

import java.util.Scanner;

public class E11PizzaCalculatorInput {
	
	//Exercise 11: Add code to complete the program according to the flow chart given here:
	
	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#storing-user-input-in-variables
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many pizza slices are there?");
		pizzaSlices = scan.nextInt();
        System.out.print("How many people are there?");
		numPeople = scan.nextInt();
		slicesPerPerson = pizzaSlices/numPeople;
		leftoverSlices = pizzaSlices%numPeople;
		System.out.print("Each person gets "+slicesPerPerson+" slices of pizza and "+leftoverSlices+" slices of pizza are leftover.");
       

    }

}
