package com.converter.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class WeightConverterTest {

    @Test
    void convertKilogramsToPounds() {
        // testing for conversion of 10 kilograms to pounds
        double testInput = 10;
        double expectedOutput = 22.0462;
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(testInput));
    }

    @Test
    void convertFalseKilogramsToPounds() {
        // testing for conversion of 10 kilograms to pounds
        double testInput = 10;
        double expectedOutput = 25.0462;
        assertNotEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(testInput));
    }

    @Test
    void convertPoundsToKilograms() {
        // testing for 10 pounds to kilograms
        double testInput = 10;
        double expectedOutput = 4.535929094356398;
        assertEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(testInput));
    }

    @Test
    void convertFalsePoundsToKilograms() {
        // testing for 10 pounds to kilograms
        double testInput = 10;
        double expectedOutput = 40;
        assertNotEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(testInput));
    }

    @Test
    void convertKilogramsToGrams() {
        // testing for 10 kilograms to grams
        double testInput = 10;
        double expectedOutput = 10000;
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(testInput));
    }

    @Test
    void convertFalseKilogramsToGrams() {
        // testing for 10 kilograms to grams
        double testInput = 10;
        double expectedOutput = 100;
        assertNotEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(testInput));
    }

    @Test
    void convertGramsToKilograms() {
        // testing for 10 grams to kilograms
        double testInput = 10;
        double expectedOutput = 0.01;
        assertEquals(expectedOutput, WeightConverter.convertGramsToKilograms(testInput));
    }

    @Test
    void convertFalseGramsToKilograms() {
        // testing for 10 grams to kilograms
        double testInput = 10;
        double expectedOutput = 10.01;
        assertNotEquals(expectedOutput, WeightConverter.convertGramsToKilograms(testInput));
    }

    @Test
    void convertPoundsToGrams() {
        // testing for 10 pounds to grams
        double testInput = 10;
        double expectedOutput = 4535.92;
        assertEquals(expectedOutput, WeightConverter.convertPoundsToGrams(testInput));
    }

    @Test
    void convertFalsePoundsToGrams() {
        // testing for 10 pounds to grams
        double testInput = 10;
        double expectedOutput = 45.92;
        assertNotEquals(expectedOutput, WeightConverter.convertPoundsToGrams(testInput));
    }

    @Test
    void convertGramsToPounds() {
        // testing for 10 grams to pounds
        double testInput = 10;
        double expectedOutput = 0.022046244201837775;
        assertEquals(expectedOutput, WeightConverter.convertGramsToPounds(testInput));
    }

    @Test
    void convertFalseGramsToPounds() {
        // testing for 10 grams to pounds
        double testInput = 10;
        double expectedOutput = 10.022046244201837775;
        assertNotEquals(expectedOutput, WeightConverter.convertGramsToPounds(testInput));
    }
}