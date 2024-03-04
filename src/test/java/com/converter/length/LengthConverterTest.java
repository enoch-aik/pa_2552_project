package com.converter.length;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthConverterTest {

    @org.junit.jupiter.api.Test
    void convertMetersToFeet() {
        //testing for conversion of 10 meters to feet
        double testInput = 10;
        double expectedOutput = 32.8084;
        assertEquals(expectedOutput, LengthConverter.convertMetersToFeet(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMetersToFeet() {
        //testing for conversion of 10 meters to feet
        double testInput = 10;
        double expectedOutput = 32.8084;
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToFeet(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFeetToMeters() {
        //testing for conversion of 10 feet to meters
        double testInput = 10;
        double expectedOutput = 3.0479999024640039;
        assertEquals(expectedOutput, LengthConverter.convertFeetToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseFeetToMeters() {
        //testing for conversion of 10 feet to meters
        double testInput = 10;
        double expectedOutput = 3.047999902464003;
        assertNotEquals(expectedOutput, LengthConverter.convertFeetToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertMetersToInches() {
        //testing for conversion of 10 meters to inches
        double testInput = 10;
        double expectedOutput = 393.7019;
        assertEquals(expectedOutput, LengthConverter.convertMetersToInches(testInput));

    }

    @org.junit.jupiter.api.Test
    void convertFalseMetersToInches() {
        //testing for conversion of 10 meters to inches
        double testInput = 10;
        double expectedOutput = 393.701;
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToInches(testInput));

    }

    @org.junit.jupiter.api.Test
    void convertInchesToMeters() {
        //testing for conversion of 10 inches to meters
        double testInput = 25;
        double expectedOutput = 0.63499965710018519;
        assertEquals(expectedOutput, LengthConverter.convertInchesToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseInchesToMeters() {
        //testing for conversion of 10 inches to meters
        double testInput = 25;
        double expectedOutput = 0.6349996571001851;
        assertNotEquals(expectedOutput, LengthConverter.convertInchesToMeters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertMetersToCentimeters() {
        //testing for conversion of 10 meters to centimeters
        double testInput = 10;
        double expectedOutput = 10009;
        assertEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertFalseMetersToCentimeters() {
        //testing for conversion of 10 meters to centimeters
        double testInput = 10;
        double expectedOutput = 1000;
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertCentimetersToMeters() {
        //testing for conversion of 10 centimeters to meters
        double testInput = 10;
        double expectedOutput = 0.19;
        assertEquals(expectedOutput, LengthConverter.convertCentimetersToMeters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseCentimetersToMeters() {
        //testing for conversion of 10 centimeters to meters
        double testInput = 10;
        double expectedOutput = 0.1;
        assertNotEquals(expectedOutput, LengthConverter.convertCentimetersToMeters(testInput));
    }
}