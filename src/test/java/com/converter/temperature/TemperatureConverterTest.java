package com.converter.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertCelsiusToFahrenheit() {
        double expectedOutput = 50;
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToFahrenheit(10));
    }

    @Test
    void convertFahrenheitToCelsius() {
        double expectedOutput = 10;
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(50));
    }

    @Test
    void convertCelsiusToKelvin() {
        double expectedOutput = 283.15;
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(10));
    }

    @Test
    void convertKelvinToCelsius() {
        double expectedOutput = 10;
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(283.15));
    }

    @Test
    void convertFahrenheitToKelvin() {
        double expectedOutput = 283.15;
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(50));
    }

    @Test
    void convertKelvinToFahrenheit() {
        double expectedOutput = 50;
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(283.15));
    }
}