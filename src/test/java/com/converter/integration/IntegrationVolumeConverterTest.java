package com.converter.integration;

import com.converter.volume.VolumeConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationVolumeConverterTest {

    // test to convert liters to tablespoon
    @org.junit.jupiter.api.Test
    void convertLitersToTablespoon() {
        // input value in liters
        double testInput = 1;
        // expected output value in tablespoon
        double expectedOutput = 68;
        // assertion to check if the expected output and the actual output are same
        assertEquals(VolumeConverter.convertMillilitersToTablespoon(VolumeConverter.convertLitersToMilliliters(testInput)), expectedOutput);
    }

    // test to convert tablespoon to liters
    @org.junit.jupiter.api.Test
    void convertTablespoonToLiters() {
        // input value in tablespoon
        double testInput = 2;
        // expected output value in liters
        double expectedOutput = 0.02958;
        // assertion to check if the expected output and the actual output are same
        assertEquals(VolumeConverter.convertMillilitersToLiters(VolumeConverter.convertTablespoonToMilliliters(testInput)), expectedOutput);
    }

    // test to convert gallon to milliliters
    @org.junit.jupiter.api.Test
    void convertGallonToMilliliters() {
        // input value in gallon
        double testInput = 1;
        // expected output value in milliliters
        double expectedOutput = 3785.0;
        // assertion to check if the expected output and actual output are same
        assertEquals(VolumeConverter.convertLitersToMilliliters(VolumeConverter.convertGallonToLiters(testInput)), expectedOutput);
    }

    // test to convert milliliters to gallon
    @org.junit.jupiter.api.Test
    void convertMillilitersToGallon() {
        // input value in milliliters
        double testInput = 30;
        // expected output value in gallon
        double expectedOutput = 0.007926023778071334;
        // assertion to check if the expected output and actual output are same
        assertEquals(VolumeConverter.convertLitersToGallon(VolumeConverter.convertMillilitersToLiters(testInput)), expectedOutput);
    }

    // test to convert gallon to tablespoon
    @org.junit.jupiter.api.Test
    void convertGallonToTablespoon() {
        // input value in gallon
        double testInput = 1;
        // expected output in tablespoon
        double expectedOutput = 256;
        // assertion to check if expected output and actual output are same
        assertEquals(VolumeConverter.convertMillilitersToTablespoon(VolumeConverter.convertLitersToMilliliters(VolumeConverter.convertGallonToLiters(testInput))), expectedOutput);
    }

    // test to convert tablespoon to gallon
    @org.junit.jupiter.api.Test
    void convertTablespoonToGallon() {
        // input value in tablespoon
        double testInput = 2;
        // expected output in gallon
        double expectedOutput = 0.007815059445178334;
        // assertion to check if expected output and actual output are same
        assertEquals(VolumeConverter.convertLitersToGallon(VolumeConverter.convertMillilitersToLiters(VolumeConverter.convertTablespoonToMilliliters(testInput))), expectedOutput);
    }
}
