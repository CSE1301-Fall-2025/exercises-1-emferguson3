package module2._01ifs;

import java.util.Scanner;
public class E04PizzaCalculatorInput {

	//Exercise 4: Add a check to this program that skips
	//the computations if the number of people is less than
	//or equal to zero
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        pizzaSlices = scan.nextInt();
        numPeople = scan.nextInt();
        if(pizzaSlices<=0 || numPeople<=0){
            System.out.println("Invalid Input");
        } else {
        slicesPerPerson = pizzaSlices / numPeople;
        leftoverSlices = pizzaSlices % numPeople;
        System.out.println(slicesPerPerson);
        System.out.println(leftoverSlices);}
    }

}
