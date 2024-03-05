package com.converter.integration;

import com.converter.length.LengthConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;


//This file is used to run integration test for all the converter categories

class IntegrationTest {

    //test to convert from inch to centimeters
    @org.junit.jupiter.api.Test
    void convertInchToCentimeter() {
        double testInput = 10;
        double expectedOutput = 25;
        assertEquals(LengthConverter.convertMetersToCentimeters(LengthConverter.convertInchesToMeters(testInput)), expectedOutput);
    }
}