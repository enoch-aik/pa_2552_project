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
    void convertFalseCelsiusToFahrenheit() {
        double expectedOutput = 500;
        assertNotEquals(expectedOutput, TemperatureConverter.convertCelsiusToFahrenheit(10));
    }

    @Test
    void convertFahrenheitToCelsius() {
        double expectedOutput = 10;
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(50));
    }

    @Test
    void convertFalseFahrenheitToCelsius() {
        double expectedOutput = 100;
        assertNotEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(50));
    }
    @Test
    void convertCelsiusToKelvin() {
        double expectedOutput = 283.15;
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(10));
    }

    @Test
    void convertFalseCelsiusToKelvin() {
        double expectedOutput = 200.15;
        assertNotEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(10));
    }

    @Test
    void convertKelvinToCelsius() {
        double expectedOutput = 10;
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(283.15));
    }

    @Test
    void convertFalseKelvinToCelsius() {
        double expectedOutput = 100;
        assertNotEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(283.15));
    }

    @Test
    void convertFahrenheitToKelvin() {
        double expectedOutput = 283.15;
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(50));
    }

    @Test
    void convertFalseFahrenheitToKelvin() {
        double expectedOutput = 200.15;
        assertNotEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(50));
    }

    @Test
    void convertKelvinToFahrenheit() {
        double expectedOutput = 50;
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(283.15));
    }

    @Test
    void convertFalseKelvinToFahrenheit() {
        double expectedOutput = 80;
        assertNotEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(283.15));
    }
}