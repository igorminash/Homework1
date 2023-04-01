package org.example.Drinks;

import java.util.ArrayList;

public interface Machine {
    public Drink getDrink(String name) throws IllegalStateException;
//    public HotDrinks getDrink(String name, Double volume, Integer temperature) throws IllegalStateException;
}
