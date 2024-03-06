package com.converter.integration;


import com.converter.weight.WeightConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class IntegrationWeightConverterTest {


    @org.junit.jupiter.api.Test
    void convertGramsToPounds() {
        // test input in grams
        double testInput = 10;
        // expected output in pounds
        double expectedOutput = 0.022046244201837775;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, WeightConverter.convertGramsToPounds(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertKilogramsToGrams() {
        // test input in kilograms
        double testInput = 10;
        // expected output in grams
        double expectedOutput = 10000;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(testInput));
    }


}
