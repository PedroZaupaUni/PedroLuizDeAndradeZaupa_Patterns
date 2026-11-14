package org.biblioteca.pedroluizdeandradezaupa_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<TemperatureObserver> observers = new ArrayList<TemperatureObserver>();
    private double temperature;

    public void subscribe(TemperatureObserver o) {
        observers.add(o);
    }

    public void unsubscribe(TemperatureObserver o) {
        observers.remove(o);
    }

    public void setTemperature(double temp) {
        temperature = temp;
        notifyObservers();
    }

    private void notifyObservers() {
        for (TemperatureObserver o : observers) {
            o.onTemperatureChanged(temperature);
        }
    }
}
