package com.converter.integration;


import com.converter.weight.WeightConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationWeightConverterTest {


    //Integration test to convert kilograms to milligrams
    @org.junit.jupiter.api.Test
    void convertKilogramsToMilligrams() {
        //input value in kilograms
        double testInput = 15;
        //expected output value in milligrams
        double expectedOutput = 15000000;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, WeightConverter.convertGramsToMilligrams(WeightConverter.convertKilogramsToGrams(testInput)));
    }


    //Integration test to convert milligrams to kilograms
    @org.junit.jupiter.api.Test
    void convertMilligramsToKilograms() {
        //input value in milligrams
        double testInput = 1000000;
        //expected output value in kilograms
        double expectedOutput = 1;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, WeightConverter.convertGramsToKilograms(WeightConverter.convertMilligramsToGrams(testInput)));
    }

    //Integration test to convert grams to pounds
    @org.junit.jupiter.api.Test
    void convertGramsToPounds() {
        //input value in grams
        double testInput = 100;
        //expected output value in pounds
        double expectedOutput = 0.220462;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(WeightConverter.convertGramsToKilograms(testInput)));
    }

    //Integration test to convert pounds to grams
    @org.junit.jupiter.api.Test
    void convertPoundsToGrams() {
        //input value in pounds
        double testInput = 10;
        //expected output value in grams
        double expectedOutput = 4535.929094356397;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(WeightConverter.convertPoundsToKilograms(testInput)));
    }

    //Integration test to convert pounds to milligrams
    @org.junit.jupiter.api.Test
    void convertPoundsToMilligrams() {
        //input value in pounds
        double testInput = 10;
        //expected output value in milligrams
        double expectedOutput = 4535929.094356397;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, WeightConverter.convertGramsToMilligrams(WeightConverter.convertKilogramsToGrams(WeightConverter.convertPoundsToKilograms(testInput))));
    }

    //Integration test to convert milligrams to pounds
    @org.junit.jupiter.api.Test
    void convertMilligramsToPounds() {
        //input value in milligrams
        double testInput = 1000000;
        //expected output value in pounds
        double expectedOutput = 2.20462;
        //assertion to check if the expected output and the actual output are same
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(WeightConverter.convertGramsToKilograms(WeightConverter.convertMilligramsToGrams(testInput))));
    }


}
