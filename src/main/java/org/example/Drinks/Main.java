package org.example.Drinks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> list = new ArrayList();
        list.add(new HotDrinks("Latte", 0.5, 80));
        list.add(new HotDrinks("Cappuccino", 0.5, 80));
        list.add(new HotDrinks("Chocolate", 0.5, 80));
        list.add(new HotDrinks("Latte", 0.25, 70));
        DrinksVendingMachine machine = new DrinksVendingMachine(list);


        System.out.println(machine.getDrink("Latte",0.5,80));

    }
}
