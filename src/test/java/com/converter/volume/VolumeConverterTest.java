package com.converter.volume;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class VolumeConverterTest {

    @org.junit.jupiter.api.Test
    void convertLitersToGallon() {
        // testing for conversion of 20 liters to gallon
        double testInput = 20;
        double expectedOutput = 5.284015852047556;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToGallon(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseLitersToGallon() {
        // testing for false conversion of 20 liters to gallon
        double testInput = 20;
        double expectedOutput = 15;
        assertNotEquals(expectedOutput, VolumeConverter.convertLitersToGallon(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertGallonToLiters() {
        // testing for conversion of 20 gallons to liters
        double testInput = 20;
        double expectedOutput = 75.7;
        assertEquals(expectedOutput, VolumeConverter.convertGallonToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseGallonToLiters() {
        // testing for false conversion of 20 gallons to liters
        double testInput = 20;
        double expectedOutput = 95;
        assertNotEquals(expectedOutput, VolumeConverter.convertGallonToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertLitersToMilliliters() {
        // testing for conversion of 20 liters to milliliters
        double testInput = 20;
        double expectedOutput = 20000;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseLitersToMilliliters() {
        // testing for False conversion of 20 liters to milliliters
        double testInput = 20;
        double expectedOutput = 200;
        assertNotEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertMillilitersToLiters() {
        // testing for conversion of 20 milliliters to liters
        double testInput = 20;
        double expectedOutput = 0.02;
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMillilitersToLiters() {
        // testing for False conversion of 20 milliliters to liters
        double testInput = 20;
        double expectedOutput = 200;
        assertNotEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertTablespoonToMilliliters() {
        // testing for conversion of 1 tablespoon to milliliters
        double testInput = 1;
        double expectedOutput = 14.79;
        assertEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseTablespoonToMilliliters() {
        // testing for False conversion of 1 tablespoon to milliliters
        double testInput = 1;
        double expectedOutput = 20;
        assertNotEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(testInput));
    }
    @org.junit.jupiter.api.Test
    void convertMillilitersToTablespoon() {
        // testing for conversion of 50 milliliters to tablespoon
        double testInput = 50;
        double expectedOutput = 3.0;
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(testInput));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMillilitersToTablespoon() {
        // testing for conversion of 50 milliliters to tablespoon
        double testInput = 10;
        double expectedOutput = 5.0;
        assertNotEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(testInput));
    }
}
