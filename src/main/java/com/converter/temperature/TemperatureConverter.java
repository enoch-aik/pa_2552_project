package com.converter.temperature;

import com.converter.constants.ConverterConstants;

public class TemperatureConverter {
    //convert celsius to fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //convert fahrenheit to celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    //convert celsius to kelvin
    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + ConverterConstants.KELVIN_CELSIUS_UNIT;
    }

    //convert kelvin to celsius
    public static double convertKelvinToCelsius(double kelvin) {
        return kelvin - ConverterConstants.KELVIN_CELSIUS_UNIT;
    }

    //convert fahrenheit to kelvin
    public static double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    //convert kelvin to fahrenheit
    public static double convertKelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
