package edu.neu.csye7374;

public class Restaurant {
    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void displayMenu() {
        if (currentState != null) {
            currentState.displayMenu();
        } else {
            System.out.println("No menu available.");
        }
    }
}
