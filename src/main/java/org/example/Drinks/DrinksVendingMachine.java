package org.example.Drinks;

import java.util.List;

public class DrinksVendingMachine implements Machine {
    private final List<Drink> drinks;

    public DrinksVendingMachine(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public Drink getDrink(String name) {
        for (Drink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name)) {
                return drink;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }

    public HotDrinks getDrink(String name, Double volume, Integer temperature) {
        for (Drink drink : drinks) {
            if (drink instanceof HotDrinks) {
                if (((HotDrinks) drink).getName().equalsIgnoreCase(name) && ((HotDrinks) drink).getVolume().equals(volume) && ((HotDrinks) drink).getTemperature().equals(temperature)) {
                    return (HotDrinks) drink;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }
}
