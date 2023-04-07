package org.example.Homework3;

import java.util.Comparator;

public class DrinkComparator implements Comparator<Drink> {

    @Override
    public int compare(Drink o1, Drink o2) {
        return o1.getVolume().compareTo(o2.getVolume());
    }
}
