package edu.neu.csye7374;
import java.util.ArrayList;

public class BreakfastState implements State {
    private ArrayList<MenuItem> breakfastmenu;

    public BreakfastState() {
    	breakfastmenu = new ArrayList<>();
    	breakfastmenu.add(new MenuItem(1, "Bread", 11.99));
    	breakfastmenu.add(new MenuItem(2, "Milk", 12.99));
    	breakfastmenu.add(new MenuItem(3, "Egg", 13.99));
    	breakfastmenu.add(new MenuItem(4, "Cerials", 14.99));    // Optional
    }

    @Override
    public void displayMenu() {
        System.out.println("Breakfast Menu:");
        System.out.println("ID\tPRICE\tDESCRIPTION");
        for (MenuItem item : breakfastmenu) {
            System.out.println(item);
        }
        System.out.println();
    }
}
 