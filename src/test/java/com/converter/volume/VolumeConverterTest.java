package com.converter.volume;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VolumeConverterTest {

    @org.junit.jupiter.api.Test
    void convertLitersToGallon() {
        // testing for conversion of 20 liters to gallon
        double expectedOutput = 5.28344105;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToGallon(20));
    }

    @org.junit.jupiter.api.Test
    void convertGallonToLiters() {
        // testing for conversion of 20 gallons to liters
        double expectedOutput = 75.7082357;
        assertEquals(expectedOutput, VolumeConverter.convertGallonToLiters(20));
    }

    @org.junit.jupiter.api.Test
    void convertLitersToMilliliters() {
        // testing for conversion of 20 liters to milliliters
        double expectedOutput = 20000;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(20));
    }

    @org.junit.jupiter.api.Test
    void convertMillilitersToLiters() {
        // testing for conversion of 20 milliliters to liters
        double expectedOutput = 0.02;
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(20));
    }

    @org.junit.jupiter.api.Test
    void convertTablespoonToMilliliters() {
        // testing for conversion of 1 tablespoon to milliliters
        double expectedOutput = 14.7867648;
        assertEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(1));
    }

    @org.junit.jupiter.api.Test
    void convertMillilitersToTablespoon() {
        // testing for conversion of 50 milliliters to tablespoon
        double expectedOutput = 3.0;
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(50));
    }

}
