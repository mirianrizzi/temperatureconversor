package com.temperature.converter.service;

public class Calculator {

    public static float celsiusToFahrenheit(float c) {
        return (c * 1.8f) + 32;
    }
    public static float celsiusToKelvin(float c) {
        return c + 273.15f;
    }
    public static float celsiusToReaumur(float c) {
        return c * 0.8f;
    }
    public static float celsiusToRankine(float c) {
        return (c * 1.8f) + 491;
    }

}

