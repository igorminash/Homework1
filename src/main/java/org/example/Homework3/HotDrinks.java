package org.example.Homework3;


public class HotDrinks extends Drink {
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public HotDrinks(String name, Double volume, Integer temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    private Integer temperature;

    public HotDrinks(String name, Double volume) {
        super(name, volume);
    }


    @Override
    public String toString() {
        return "HotDrinks{" +
                " name='" + getName() + '\'' +
                ", volume=" + getVolume() + ' ' +
                ",temperature=" + temperature +
                '}';
    }
}
