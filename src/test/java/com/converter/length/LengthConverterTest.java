package com.converter.length;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthConverterTest {

    @org.junit.jupiter.api.Test
    void convertMetersToFeet() {
        //testing for conversion of 10 meters to feet
        double expectedOutput = 32.8084;
        assertEquals(expectedOutput, LengthConverter.convertMetersToFeet(10));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMetersToFeet() {
        //testing for conversion of 10 meters to feet
        double expectedOutput = 32.80849;
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToFeet(10));
    }

    @org.junit.jupiter.api.Test
    void convertFeetToMeters() {
        //testing for conversion of 10 feet to meters
        double expectedOutput = 3.047999902464003;
        assertEquals(expectedOutput, LengthConverter.convertFeetToMeters(10));
    }

    @org.junit.jupiter.api.Test
    void convertFalseFeetToMeters() {
        //testing for conversion of 10 feet to meters
        double expectedOutput = 3.0479999024640039;
        assertNotEquals(expectedOutput, LengthConverter.convertFeetToMeters(10));
    }

    @org.junit.jupiter.api.Test
    void convertMetersToInches() {
        //testing for conversion of 10 meters to inches
        double expectedOutput = 393.701;
        assertEquals(expectedOutput, LengthConverter.convertMetersToInches(10));

    }

    @org.junit.jupiter.api.Test
    void convertFalseMetersToInches() {
        //testing for conversion of 10 meters to inches
        double expectedOutput = 393.7019;
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToInches(10));

    }

    @org.junit.jupiter.api.Test
    void convertInchesToMeters() {
        //testing for conversion of 10 inches to meters
        double expectedOutput = 0.6349996571001851;
        assertEquals(expectedOutput, LengthConverter.convertInchesToMeters(25));
    }

    @org.junit.jupiter.api.Test
    void convertFalseInchesToMeters() {
        //testing for conversion of 10 inches to meters
        double expectedOutput = 0.63499965710018519;
        assertNotEquals(expectedOutput, LengthConverter.convertInchesToMeters(25));
    }
    @org.junit.jupiter.api.Test
    void convertMetersToCentimeters() {
        //testing for conversion of 10 meters to centimeters
        double expectedOutput = 1000;
        assertEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(10));
    }
    @org.junit.jupiter.api.Test
    void convertFalseMetersToCentimeters() {
        //testing for conversion of 10 meters to centimeters
        double expectedOutput = 10009;
        assertNotEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(10));
    }
    @org.junit.jupiter.api.Test
    void convertCentimetersToMeters() {
        //testing for conversion of 10 centimeters to meters
        double expectedOutput = 0.1;
        assertEquals(expectedOutput, LengthConverter.convertCentimetersToMeters(10));
    }

    @org.junit.jupiter.api.Test
    void convertFalseCentimetersToMeters() {
        //testing for conversion of 10 centimeters to meters
        double expectedOutput = 0.19;
        assertNotEquals(expectedOutput, LengthConverter.convertCentimetersToMeters(10));
    }
}