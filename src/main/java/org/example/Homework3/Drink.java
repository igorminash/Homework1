package org.example.Homework3;

public abstract class Drink {
    protected String name;
    protected Double volume;

    public Drink(String name, Double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Double getVolume() {
        return volume;
    }


}
