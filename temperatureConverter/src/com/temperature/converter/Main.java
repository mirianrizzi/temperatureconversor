package com.temperature.converter;

import com.temperature.converter.service.Calculator;
import com.temperature.converter.utils.Reader;

public class Main {

    public static void main (String[] args) {

        float celsiusTemperature = Reader.scanTemperatureToConvert();

        System.out.println("As temperaturas convertidas são:");
        System.out.printf("A temperatura em Fahrenheit é %.2f %n", Calculator.celsiusToFahrenheit(celsiusTemperature));
        System.out.printf("A temperatura em Kelvin é %.2f %n", Calculator.celsiusToKelvin(celsiusTemperature));
        System.out.printf("A temperatura em Reaumur é %.2f %n", Calculator.celsiusToReaumur(celsiusTemperature));
        System.out.printf("A temperatura em Rankine é %.2f %n", Calculator.celsiusToRankine(celsiusTemperature));

    }
}