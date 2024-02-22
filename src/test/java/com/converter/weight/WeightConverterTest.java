package com.converter.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightConverterTest {

    @Test
    void convertKilogramsToPounds() {
        double expectedOutput = 22.0462;
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(10));
    }

    @Test
    void convertPoundsToKilograms() {
        double expectedOutput = 4.535929094356398;
        assertEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(10));
    }

    @Test
    void convertKilogramsToGrams() {
        double expectedOutput = 10000;
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(10));
    }

    @Test
    void convertGramsToKilograms() {
        double expectedOutput = 0.01;
        assertEquals(expectedOutput, WeightConverter.convertGramsToKilograms(10));
    }

    @Test
    void convertPoundsToGrams() {
        double expectedOutput = 4535.92;
        assertEquals(expectedOutput, WeightConverter.convertPoundsToGrams(10));
    }

    @Test
    void convertGramsToPounds() {
        double expectedOutput = 0.022046244201837775;
        assertEquals(expectedOutput, WeightConverter.convertGramsToPounds(10));
    }
}