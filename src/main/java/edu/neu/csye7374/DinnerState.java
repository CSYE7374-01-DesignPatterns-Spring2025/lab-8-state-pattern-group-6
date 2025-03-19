package edu.neu.csye7374;

import java.util.ArrayList;

public class DinnerState implements State {
    private ArrayList<MenuItem> dinnerMenu;

    public DinnerState() {
        dinnerMenu = new ArrayList<>();
        dinnerMenu.add(new MenuItem(1, "Soup", 11.99));
        dinnerMenu.add(new MenuItem(2, "Salad", 12.99));
        dinnerMenu.add(new MenuItem(3, "Steak", 13.99));
        dinnerMenu.add(new MenuItem(4, "Salmon", 14.99));    // Optional
        dinnerMenu.add(new MenuItem(5, "Chicken", 15.99));   // Optional
    }

    @Override
    public void displayMenu() {
        System.out.println("Dinner Menu:");
        System.out.println("ID\tPRICE\tDESCRIPTION");
        for (MenuItem item : dinnerMenu) {
            System.out.println(item);
        }
        System.out.println();
    }
}
 