package com.converter.length;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthConverterTest {

    @org.junit.jupiter.api.Test
    void convertMetersToFeet() {
        //testing for conversion of 10 meters to feet
        double expectedOutput = 32.8084;
        assertEquals(expectedOutput, LengthConverter.convertMetersToFeet(10));
    }

    @org.junit.jupiter.api.Test
    void convertFeetToMeters() {
    //testing for conversion of 10 feets to meters
        double expectedOutput = 3.048;
        assertEquals(expectedOutput, LengthConverter.convertFeetToMeters(10));
    }

    @org.junit.jupiter.api.Test
    void convertMetersToInches() {

    }

    @org.junit.jupiter.api.Test
    void convertInchesToMeters() {
    }

    @org.junit.jupiter.api.Test
    void convertMetersToCentimeters() {
    }

    @org.junit.jupiter.api.Test
    void convertCentimetersToMeters() {
    }
}