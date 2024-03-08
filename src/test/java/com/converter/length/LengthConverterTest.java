package com.converter.length;

import static org.junit.Assert.assertEquals;

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
    void convertFeetToMeters() {
        // test input in feet
        double testInput = 10;
        // expected out in meters
        double expectedOutput = 3.047999902464003;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, LengthConverter.convertFeetToMeters(testInput));
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

}