package org.example.Homework3;



public interface Machine {
    Drink getDrink(String name) throws IllegalStateException;
//    public HotDrinks getDrink(String name, Double volume, Integer temperature) throws IllegalStateException;
}