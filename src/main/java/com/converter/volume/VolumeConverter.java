package com.converter.volume;

public class VolumeConverter {
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
}
