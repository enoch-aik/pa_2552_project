package com.converter.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertCelsiusToFahrenheit() {
        // test input in Celsius
        double testInput = 10;
        // expected output in Fahrenheit
        double expectedOutput = 50;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToFahrenheit(testInput));
    }

    @Test
    void convertFalseCelsiusToFahrenheit() {
        // test input in Celsius
        double testInput = 10;
        // expected output in Fahrenheit
        double expectedOutput = 500;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, TemperatureConverter.convertCelsiusToFahrenheit(testInput));
    }

    @Test
    void convertFahrenheitToCelsius() {
        // test input in Fahrenheit
        double testInput = 50;
        // expected output in Celsius
        double expectedOutput = 10;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(testInput));
    }

    @Test
    void convertFalseFahrenheitToCelsius() {
        // test input in Fahrenheit
        double testInput = 50;
        // expected output in Celsius
        double expectedOutput = 100;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, TemperatureConverter.convertFahrenheitToCelsius(testInput));
    }
    @Test
    void convertCelsiusToKelvin() {
        // test input in Celsius
        double testInput = 10;
        // expected output in Kelvin
        double expectedOutput = 283.15;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(testInput));
    }

    @Test
    void convertFalseCelsiusToKelvin() {
        // test input in Celsius
        double testInput = 10;
        // expected output in Kelvin
        double expectedOutput = 200.15;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, TemperatureConverter.convertCelsiusToKelvin(testInput));
    }

    @Test
    void convertKelvinToCelsius() {
        // test input in Kelvin
        double testInput = 283.15;
        // expected output in Celsius
        double expectedOutput = 10;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(testInput));
    }

    @Test
    void convertFalseKelvinToCelsius() {
        // test input in Kelvin
        double testInput = 283.15;
        // expected output in Celsius
        double expectedOutput = 100;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, TemperatureConverter.convertKelvinToCelsius(testInput));
    }

    @Test
    void convertFahrenheitToKelvin() {
        // test input in Fahrenheit
        double testInput = 50;
        // expected output in Kelvin
        double expectedOutput = 283.15;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(testInput));
    }

    @Test
    void convertFalseFahrenheitToKelvin() {
        // test input in Fahrenheit
        double testInput = 50;
        // expected output in Kelvin
        double expectedOutput = 200.15;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, TemperatureConverter.convertFahrenheitToKelvin(testInput));
    }

    @Test
    void convertKelvinToFahrenheit() {
        // test input in Kelvin
        double testInput = 283.15;
        // expected output in Fahrenheit
        double expectedOutput = 50;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(testInput));
    }

    @Test
    void convertFalseKelvinToFahrenheit() {
        // test input in Kelvin
        double testInput = 283.15;
        // expected output in Fahrenheit
        double expectedOutput = 80;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, TemperatureConverter.convertKelvinToFahrenheit(testInput));
    }
}