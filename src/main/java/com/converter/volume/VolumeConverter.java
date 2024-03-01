package com.converter.volume;

import com.converter.constants.ConverterConstants;

import static java.lang.Math.round;

public class VolumeConverter {
<<<<<<< HEAD

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

    // convert tablespoon to milliliters
    public static double convertTablespoonToMilliliters(double tablespoon) {
        return tablespoon * ConverterConstants.MILLILITER_TABLESPOON_UNIT;
    }

    //convert milliliters to tablespoon
    public static double convertMillilitersToTablespoon(double milliliters) {
        return round(milliliters / ConverterConstants.MILLILITER_TABLESPOON_UNIT);
    }

=======
//function to convert liters to gallon
    public static double convertLitersToGallon(double liters) {
        return liters * 0.264172;
    }

    //function to convert gallon to liters
    public static double convertGallonToLiters(double gallon) {
        return gallon * 3.78541;
    }

    //function to convert liters to milliliters
    public static double convertLitersToMilliliters(double liters) {
        return liters * 1000;
    }

    //function to convert milliliters to liters
    public static double convertMillilitersToLiters(double milliliters) {
        return milliliters / 1000;
    }

    //function to convert tablespoon to milliliters
    public static double convertTablespoonToMilliliters(double tablespoon) {
        return tablespoon * 14.7868;
    }

    //function to convert milliliters to tablespoon
    public static double convertMillilitersToTablespoon(double milliliters) {
        return milliliters / 14.7868;
    }
>>>>>>> ff506b0a50fefc8f1d84ce9794b4e26172b55b9f
}
