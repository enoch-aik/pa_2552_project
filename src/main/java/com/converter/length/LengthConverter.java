package com.converter.length;

import com.converter.constants.ConverterConstants;

public class LengthConverter {
    //convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * ConverterConstants.METER_FEET_UNIT;
    }

    //convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet / ConverterConstants.METER_FEET_UNIT;
    }

    //convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * ConverterConstants.METER_INCH_UNIT;
    }

    //convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches / ConverterConstants.METER_INCH_UNIT;
    }

    //convert meters to centimeters
    public static double convertMetersToCentimeters(double meters) {
        return meters * ConverterConstants.METER_CENTIMETER_UNIT;
    }

    //convert centimeters to meters
    public static double convertCentimetersToMeters(double centimeters) {
        return centimeters / ConverterConstants.METER_CENTIMETER_UNIT;
    }

}
