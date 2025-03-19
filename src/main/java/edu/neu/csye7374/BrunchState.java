package edu.neu.csye7374;
import java.util.ArrayList;

public class BrunchState implements State {
    private ArrayList<MenuItem> brunchList;

    public BrunchState(){
    	brunchList = new ArrayList<>();
    	brunchList.add(new MenuItem(1, "Shakshouka", 8.49));
    	brunchList.add(new MenuItem(2, "Avocado Toast", 3.99));
    	brunchList.add(new MenuItem(3, "French Pancakes", 5.49));
    }

    @Override
    public void displayMenu() {
        System.out.println("Brunch Menu:");
        System.out.println("ID\tPRICE\tDESCRIPTION");
        for (MenuItem item : brunchList) {
            System.out.println(item);
        }
        System.out.println();
    }
}
 