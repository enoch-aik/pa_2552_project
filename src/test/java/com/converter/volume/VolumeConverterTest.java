package com.converter.volume;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class VolumeConverterTest {

    @org.junit.jupiter.api.Test
    void convertLitersToGallon() {
        // test input in liters
        double testInput = 20;
        // expected output in gallon
        double expectedOutput = 5.284015852047556;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, VolumeConverter.convertLitersToGallon(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseLitersToGallon() {
        // test input in liters
        double testInput = 20;
        // expected output in gallon
        double expectedOutput = 15;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, VolumeConverter.convertLitersToGallon(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertGallonToLiters() {
        // test input in gallon
        double testInput = 20;
        // expected output in liters
        double expectedOutput = 75.7;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, VolumeConverter.convertGallonToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseGallonToLiters() {
        // test input in gallon
        double testInput = 20;
        // expected output in liters
        double expectedOutput = 95;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, VolumeConverter.convertGallonToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertLitersToMilliliters() {
        // test input in liters
        double testInput = 20;
        // expected output in milliliters
        double expectedOutput = 20000;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseLitersToMilliliters() {
        // test input in liters
        double testInput = 20;
        // expected output in milliliters
        double expectedOutput = 200;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertMillilitersToLiters() {
        // test input in milliliters
        double testInput = 20;
        // expected output in liters
        double expectedOutput = 0.02;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMillilitersToLiters() {
        // test input in milliliters
        double testInput = 20;
        // expected output in liters
        double expectedOutput = 200;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertTablespoonToMilliliters() {
        // test input in tablespoon
        double testInput = 1;
        // expected output in milliliters
        double expectedOutput = 14.79;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseTablespoonToMilliliters() {
        // test input in tablespoon
        double testInput = 1;
        // expected output in milliliters
        double expectedOutput = 20;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertMillilitersToTablespoon() {
        // test input in milliliters
        double testInput = 50;
        // expected output in tablespoon
        double expectedOutput = 3.0;
        // assertion statement to check if expected output and actual output are same
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMillilitersToTablespoon() {
        // test input in milliliters
        double testInput = 10;
        // expected output in tablespoon
        double expectedOutput = 5.0;
        // assertion statement to check if expected output and actual output are not same
        assertNotEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(testInput));
    }
}
