package edu.neu.csye7374;

import java.util.ArrayList;
public class LunchState implements State {
    private ArrayList<MenuItem> lunchMenu;

    public LunchState(){
        lunchMenu = new ArrayList<>();
        lunchMenu.add(new MenuItem(1, "hot dog", 1.99));
        lunchMenu.add(new MenuItem(2, "salad", 2.99));
        lunchMenu.add(new MenuItem(3, "hamburge", 3.99));
    }

    @Override
    public void displayMenu(){
        System.out.println("Lunch Menu:");
        System.out.println("ITEM\tPRICE\tDESCRIPTION");
        for(MenuItem item: lunchMenu){
            System.out.println(item);
        }
        System.out.println();
    }
}
