package com.converter.volume;

import com.converter.constants.ConverterConstants;

import static java.lang.Math.round;

public class VolumeConverter {

    // convert liters to gallon
    public static double convertLitersToGallon(double liters) {
        return liters / ConverterConstants.LITER_GALLON_UNIT;
    }

    // convert gallons to liters
    public static double convertGallonToLiters(double gallon) {
        return gallon * ConverterConstants.LITER_GALLON_UNIT;
    }

    // convert liters to milliliters
    public static double convertLitersToMilliliters(double liters) {
        return liters * ConverterConstants.LITER_MILLILITER_UNIT;
    }

    // convert milliliters to liters
    public static double convertMillilitersToLiters(double milliliters) {
        return milliliters / ConverterConstants.LITER_MILLILITER_UNIT;
    }

}
