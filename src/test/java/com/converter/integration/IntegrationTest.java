package com.converter.integration;

import com.converter.length.LengthConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

//This file is used to run integration test for all the converter categories
class IntegrationTest {

    //test to convert from inch to centimeters
    @org.junit.jupiter.api.Test
    void convertInchToCentimeter() {
        //input value in inches
        double testInput = 10;
        //expected output value in centimeters
        double expectedOutput = 25.399986284007408;
        //assertion to check if the expected output and the actual output are same
        assertEquals(LengthConverter.convertMetersToCentimeters(LengthConverter.convertInchesToMeters(testInput)), expectedOutput);
    }

    //test to convert feet to inches
    @org.junit.jupiter.api.Test
    void convertFeetToInch() {
        //input value in feet
        double testInput = 10;
        //expected output value in inches
        double expectedOutput = 120.00006095999805;
        //assertion to check if the expected output and the actual output are same
        assertEquals(LengthConverter.convertMetersToInches(LengthConverter.convertFeetToMeters(testInput)), expectedOutput);
    }

}