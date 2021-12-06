package com.temperature.converter.utils;

import java.util.Scanner;
public class Reader {

    public static float scanTemperatureToConvert() {

        Scanner scanTemperatureToConvert = new Scanner(System.in);
        Printerer.insertTemperatureToConvert();
        return Float.parseFloat(scanTemperatureToConvert.nextLine());

    }

}