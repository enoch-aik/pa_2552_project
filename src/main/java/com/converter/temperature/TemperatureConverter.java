package com.converter.temperature;

import com.converter.constants.ConverterConstants;

public class TemperatureConverter {
    //function to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //function to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    //function to convert Celsius to Kelvin
    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + ConverterConstants.KELVIN_CELSIUS_UNIT;
    }

    //function to convert Kelvin to Celsius
    public static double convertKelvinToCelsius(double kelvin) {
        return kelvin - ConverterConstants.KELVIN_CELSIUS_UNIT;
    }

    //function to convert Fahrenheit to Kelvin
    public static double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    //function to convert Kelvin to Fahrenheit
    public static double convertKelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
