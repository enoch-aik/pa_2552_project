package com.converter.integration;

import com.converter.length.LengthConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

//This file is used to run integration test for the length converter

class IntegrationLengthConverterTest {

    //test to convert feet to inches
    @org.junit.jupiter.api.Test
    void convertFeetToInch() {
        //input value in feet
        double testInput = 10;
        //expected output value in inches
        double expectedOutput = 120.00006095999805;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToInches(LengthConverter.convertFeetToMeters(testInput)));
    }

    //test to convert inch to feet
    @org.junit.jupiter.api.Test
    void convertInchToFeet() {
        //input value in inches
        double testInput = 120.00006095999805;
        //expected output value in feet
        double expectedOutput = 10;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToFeet(LengthConverter.convertInchesToMeters(testInput)));
    }

    //test to convert feet to centimeters
    @org.junit.jupiter.api.Test
    void convertFeetToCentimeter() {
        //input value in feet
        double testInput = 10;
        //expected output value in centimeters
        double expectedOutput = 304.7999902464003;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(LengthConverter.convertFeetToMeters(testInput)));
    }

    //test to convert centimeters to feet
    @org.junit.jupiter.api.Test
    void convertCentimeterToFeet() {
        //input value in centimeters
        double testInput = 304.7999902464003;
        //expected output value in feet
        double expectedOutput = 10;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToFeet(LengthConverter.convertCentimetersToMeters(testInput)));
    }

    //test to convert centimeters to inches
    @org.junit.jupiter.api.Test
    void convertCentimeterToInch() {
        //input value in centimeters
        double testInput = 25;
        //expected output value in inches
        double expectedOutput = 9.842525;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToInches(LengthConverter.convertCentimetersToMeters(testInput)));
    }

    //test to convert inches to centimeters
    @org.junit.jupiter.api.Test
    void convertInchesToCentimeters() {
        //input value in inches
        double testInput = 9.842525;
        //expected output value in centimeters
        double expectedOutput = 25;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, LengthConverter.convertMetersToCentimeters(LengthConverter.convertInchesToMeters(testInput)));
    }
}
