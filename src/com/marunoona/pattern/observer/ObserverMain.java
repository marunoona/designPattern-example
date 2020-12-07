package com.marunoona.pattern.observer;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 64, 30.4f);
        weatherData.setMeasurements(40, 74, 23.0f);
        weatherData.setMeasurements(64, 57, 49.2f);

    }
}
