package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements
		Restaurant restaurant = new Restaurant();

		System.out.println("Switching to Breakfast State:");
		restaurant.setState(new BreakfastState());
		restaurant.displayMenu();

		System.out.println("Switching to Lunch State:");
		restaurant.setState(new LunchState());
		restaurant.displayMenu();

		System.out.println("Switching to Brunch State:");
		restaurant.setState(new BrunchState());
		restaurant.displayMenu();

		System.out.println("Switching to Dinner State:");
		restaurant.setState(new DinnerState());
		restaurant.displayMenu();

		System.out.println("\n\n============Main Execution End===================");
	}

}
