package org.biblioteca.pedroluizdeandradezaupa_patterns.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation estacao = new WeatherStation();
        ConsoleDisplay display = new ConsoleDisplay();
        FanController ventilador = new FanController();

        estacao.subscribe(display);
        estacao.subscribe(ventilador);

        estacao.setTemperature(26);
        estacao.setTemperature(30);

        estacao.unsubscribe(display);
        estacao.setTemperature(27);
    }
}
