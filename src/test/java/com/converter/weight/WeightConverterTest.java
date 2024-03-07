package com.converter.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class WeightConverterTest {

    @Test
    void convertKilogramsToPounds() {
        // test input in kilograms
        double testInput = 10;
        // expected output in pounds
        double expectedOutput = 22.0462;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(testInput));
    }

    @Test
    void convertFalseKilogramsToPounds() {
        // test input in kilograms
        double testInput = 10;
        // expected output in pounds
        double expectedOutput = 25.0462;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, WeightConverter.convertKilogramsToPounds(testInput));
    }

    @Test
    void convertPoundsToKilograms() {
        // test input in pounds
        double testInput = 10;
        // expected output in kilograms
        double expectedOutput = 4.535929094356398;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(testInput));
    }

    @Test
    void convertFalsePoundsToKilograms() {
        // test input in pounds
        double testInput = 10;
        // expected output in kilograms
        double expectedOutput = 40;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, WeightConverter.convertPoundsToKilograms(testInput));
    }

    @Test
    void convertFalseKilogramsToGrams() {
        // test input in kilograms
        double testInput = 10;
        // expected output in grams
        double expectedOutput = 100;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, WeightConverter.convertKilogramsToGrams(testInput));
    }

    @Test
    void convertGramsToKilograms() {
        // test input in grams
        double testInput = 10;
        // expected output in kilograms
        double expectedOutput = 0.01;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, WeightConverter.convertGramsToKilograms(testInput));
    }

    @Test
    void convertFalseGramsToKilograms() {
        // test input in grams
        double testInput = 10;
        // expected output in kilograms
        double expectedOutput = 10.01;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, WeightConverter.convertGramsToKilograms(testInput));
    }

    @Test
    void convertGramsToMilligrams() {
        // test input in grams
        double testInput = 10;
        // expected output in milligrams
        double expectedOutput = 10000;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, WeightConverter.convertGramsToMilligrams(testInput));
    }

    @Test
    void convertFalseMilligramsToGrams() {
        // test input in milligrams
        double testInput = 10;
        // expected output in grams
        double expectedOutput = 45.92;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, WeightConverter.convertGramsToMilligrams(testInput));
    }

    @Test
    void convertFalseGramsToMilligrams() {
        // test input in grams
        double testInput = 10;
        // expected output in pounds
        double expectedOutput = 10.022046244201837775;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, WeightConverter.convertMilligramsToGrams(testInput));
    }
}