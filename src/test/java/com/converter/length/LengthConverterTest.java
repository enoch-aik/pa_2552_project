package com.converter.length;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthConverterTest {

    @org.junit.jupiter.api.Test
    void convertMetersToFeet() {
        // test input in meters
        double testInput = 10;
        // expected output in feet
        double expectedOutput = 32.8084;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToFeet(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMetersToFeet() {
        // test input in meters
        double testInput = 10;
        // expected output in feet
        double expectedOutput = 32;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToFeet(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFeetToMeters() {
        // test input in feet
        double testInput = 10;
        // expected out in meters
        double expectedOutput = 3.047999902464003;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertFeetToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseFeetToMeters() {
        // test input in feet
        double testInput = 10;
        // expected output in meters
        double expectedOutput = 3;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, LengthConverter.convertFeetToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertMetersToInches() {
        // test input in meters
        double testInput = 10;
        // expected output in inches
        double expectedOutput = 393.701;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToInches(testInput));

    }

    @org.junit.jupiter.api.Test
    void convertFalseMetersToInches() {
        // test input in meters
        double testInput = 10;
        // expected output in inches
        double expectedOutput = 500;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToInches(testInput));

    }

    @org.junit.jupiter.api.Test
    void convertInchesToMeters() {
        // test input in inches
        double testInput = 25;
        // expected output in meters
        double expectedOutput = 0.6349996571001851;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertInchesToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseInchesToMeters() {
        // test input in inches
        double testInput = 25;
        // expected output in meters
        double expectedOutput = 10;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, LengthConverter.convertInchesToMeters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertMetersToCentimeters() {
        // test input in meters
        double testInput = 10;
        // expected output in centimeters
        double expectedOutput = 1000;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertFalseMetersToCentimeters() {
        // test input in meters
        double testInput = 10;
        // expected output in centimeters
        double expectedOutput = 100;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertCentimetersToMeters() {
        // test input in centimeters
        double testInput = 10;
        // expected output in meters
        double expectedOutput = 0.1;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertCentimetersToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseCentimetersToMeters() {
        // test input in centimeters
        double testInput = 10;
        // expected output in meters
        double expectedOutput = 1;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, LengthConverter.convertCentimetersToMeters(testInput));
    }
}