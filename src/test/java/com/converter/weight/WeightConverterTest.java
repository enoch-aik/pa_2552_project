package com.converter.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class WeightConverterTest {

    @Test
    void convertKilogramsToPounds() {
        double expectedOutput = 22.0462;
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(10));
    }

    @Test
    void convertFalseKilogramsToPounds() {
        double expectedOutput = 25.0462;
        assertNotEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(10));
    }

    @Test
    void convertPoundsToKilograms() {
        double expectedOutput = 4.535929094356398;
        assertEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(10));
    }

    @Test
    void convertFalsePoundsToKilograms() {
        double expectedOutput = 40;
        assertNotEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(10));
    }

    @Test
    void convertKilogramsToGrams() {
        double expectedOutput = 10000;
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(10));
    }

    @Test
    void convertFalseKilogramsToGrams() {
        double expectedOutput = 100;
        assertNotEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(10));
    }

    @Test
    void convertGramsToKilograms() {
        double expectedOutput = 0.01;
        assertEquals(expectedOutput, WeightConverter.convertGramsToKilograms(10));
    }

    @Test
    void convertFalseGramsToKilograms() {
        double expectedOutput = 10.01;
        assertNotEquals(expectedOutput, WeightConverter.convertGramsToKilograms(10));
    }

    @Test
    void convertPoundsToGrams() {
        double expectedOutput = 4535.92;
        assertEquals(expectedOutput, WeightConverter.convertPoundsToGrams(10));
    }

    @Test
    void convertFalsePoundsToGrams() {
        double expectedOutput = 45.92;
        assertNotEquals(expectedOutput, WeightConverter.convertPoundsToGrams(10));
    }

    @Test
    void convertGramsToPounds() {
        double expectedOutput = 0.022046244201837775;
        assertEquals(expectedOutput, WeightConverter.convertGramsToPounds(10));
    }

    @Test
    void convertFalseGramsToPounds() {
        double expectedOutput = 10.022046244201837775;
        assertNotEquals(expectedOutput, WeightConverter.convertGramsToPounds(10));
    }
}