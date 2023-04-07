package org.example.Homework3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrinkShelter {
    private List<HotDrinks> drinks;

    public DrinkShelter() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink(HotDrinks drink) {
        drinks.add(drink);

    }

    public void print() {
        for (HotDrinks drink : drinks) {
            System.out.println(drink);
        }
    }


    public List<HotDrinks> getDrinks() {
        return drinks;
    }

    public void sort(DrinkComparator comparator) {
        Collections.sort(drinks, comparator);

    }
}
