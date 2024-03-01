package com.converter.volume;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class VolumeConverterTest {

    @org.junit.jupiter.api.Test
    void convertLitersToGallon() {
        // testing for conversion of 20 liters to gallon
<<<<<<< HEAD
        double expectedOutput = 5.284015852047556;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToGallon(20));
=======
        double expectedOutput = 5.283440000000001;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToGallon(20));
    }

    @org.junit.jupiter.api.Test
    void convertFalseLitersToGallon() {
        // testing for false conversion of 20 liters to gallon
        double expectedOutput = 15;
        assertNotEquals(expectedOutput, VolumeConverter.convertLitersToGallon(20));
>>>>>>> ff506b0a50fefc8f1d84ce9794b4e26172b55b9f
    }

    @org.junit.jupiter.api.Test
    void convertGallonToLiters() {
        // testing for conversion of 20 gallons to liters
<<<<<<< HEAD
        double expectedOutput = 75.7;
=======
        double expectedOutput = 75.7082;
>>>>>>> ff506b0a50fefc8f1d84ce9794b4e26172b55b9f
        assertEquals(expectedOutput, VolumeConverter.convertGallonToLiters(20));
    }

    @org.junit.jupiter.api.Test
    void convertFalseGallonToLiters() {
        // testing for false conversion of 20 gallons to liters
        double expectedOutput = 95;
        assertNotEquals(expectedOutput, VolumeConverter.convertGallonToLiters(20));
    }

    @org.junit.jupiter.api.Test
    void convertLitersToMilliliters() {
        // testing for conversion of 20 liters to milliliters
        double expectedOutput = 20000;
        assertEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(20));
    }

    @org.junit.jupiter.api.Test
    void convertFalseLitersToMilliliters() {
        // testing for False conversion of 20 liters to milliliters
        double expectedOutput = 200;
        assertNotEquals(expectedOutput, VolumeConverter.convertLitersToMilliliters(20));
    }

    @org.junit.jupiter.api.Test
    void convertMillilitersToLiters() {
        // testing for conversion of 20 milliliters to liters
        double expectedOutput = 0.02;
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(20));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMillilitersToLiters() {
        // testing for False conversion of 20 milliliters to liters
        double expectedOutput = 200;
        assertNotEquals(expectedOutput, VolumeConverter.convertMillilitersToLiters(20));
    }

    @org.junit.jupiter.api.Test
    void convertTablespoonToMilliliters() {
        // testing for conversion of 1 tablespoon to milliliters
<<<<<<< HEAD
        double expectedOutput = 14.79;
=======
        double expectedOutput = 14.7868;
>>>>>>> ff506b0a50fefc8f1d84ce9794b4e26172b55b9f
        assertEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(1));
    }

    @org.junit.jupiter.api.Test
    void convertFalseTablespoonToMilliliters() {
        // testing for False conversion of 1 tablespoon to milliliters
        double expectedOutput = 20;
        assertNotEquals(expectedOutput, VolumeConverter.convertTablespoonToMilliliters(1));
    }
    @org.junit.jupiter.api.Test
    void convertMillilitersToTablespoon() {
        // testing for conversion of 50 milliliters to tablespoon
<<<<<<< HEAD
        double expectedOutput = 3.0;
=======
        double expectedOutput = 3.3813942164633324;

>>>>>>> ff506b0a50fefc8f1d84ce9794b4e26172b55b9f
        assertEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(50));
    }

    @org.junit.jupiter.api.Test
    void convertFalseMillilitersToTablespoon() {
        // testing for conversion of 50 milliliters to tablespoon
        double expectedOutput = 5.0;
        assertNotEquals(expectedOutput, VolumeConverter.convertMillilitersToTablespoon(10));
    }
}
