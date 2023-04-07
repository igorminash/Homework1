package org.example.Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> list = new ArrayList();
        list.add(new HotDrinks("Latte", 0.5, 80));
        list.add(new HotDrinks("Cappuccino", 0.7, 80));
        list.add(new HotDrinks("Chocolate", 0.5, 80));
        list.add(new HotDrinks("Latte", 0.25, 70));
        DrinksVendingMachine machine = new DrinksVendingMachine(list);


        System.out.println(machine.getDrink("Latte",0.5,80));

        System.out.println("Список напитков без сортировки:");
        for (Drink el : list) System.out.println(el);

        System.out.println();
        System.out.println("Список напитков c сортировкой по объему:");
        list.sort(new DrinkComparator());
        Iterator<Drink> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}