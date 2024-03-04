package com.converter.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertCelsiusToFahrenheit() {
        // testing for 10 Celsius to Fahrenheit
        double testInput = 10;
        double expectedOutput = 50;
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToFahrenheit(testInput));
    }

    @Test
    void convertFalseCelsiusToFahrenheit() {
        // testing for 10 Celsius to Fahrenheit
        double testInput = 10;
        double expectedOutput = 500;
        assertNotEquals(expectedOutput, TemperatureConverter.convertCelsiusToFahrenheit(testInput));
    }

    @Test
    void convertFahrenheitToCelsius() {
        // testing for 50 Fahrenheit to Celsius
        double testInput = 50;
        double expectedOutput = 10;
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(testInput));
    }

    @Test
    void convertFalseFahrenheitToCelsius() {
        // testing for 50 Fahrenheit to Celsius
        double testInput = 50;
        double expectedOutput = 100;
        assertNotEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(testInput));
    }
    @Test
    void convertCelsiusToKelvin() {
        // testing for 10 Celsius to Kelvin
        double testInput = 10;
        double expectedOutput = 283.15;
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(testInput));
    }

    @Test
    void convertFalseCelsiusToKelvin() {
        // testing for 10 Celsius to Kelvin
        double testInput = 10;
        double expectedOutput = 200.15;
        assertNotEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(testInput));
    }

    @Test
    void convertKelvinToCelsius() {
        // testing for 283.15 Kelvin to Celsius
        double testInput = 283.15;
        double expectedOutput = 10;
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(testInput));
    }

    @Test
    void convertFalseKelvinToCelsius() {
        // testing for 283.15 Kelvin to Celsius
        double testInput = 283.15;
        double expectedOutput = 100;
        assertNotEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(testInput));
    }

    @Test
    void convertFahrenheitToKelvin() {
        // testing for 50 Fahrenheit to Kelvin
        double testInput = 50;
        double expectedOutput = 283.15;
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(testInput));
    }

    @Test
    void convertFalseFahrenheitToKelvin() {
        // testing for 50 Fahrenheit to Kelvin
        double testInput = 50;
        double expectedOutput = 200.15;
        assertNotEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(testInput));
    }

    @Test
    void convertKelvinToFahrenheit() {
        // testing for 283.15 Kelvin to Fahrenheit
        double testInput = 283.15;
        double expectedOutput = 50;
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(testInput));
    }

    @Test
    void convertFalseKelvinToFahrenheit() {
        // testing for 283.15 Kelvin to Fahrenheit
        double testInput = 283.15;
        double expectedOutput = 80;
        assertNotEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(testInput));
    }
}