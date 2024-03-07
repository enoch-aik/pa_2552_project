package com.converter.constants;

// Class to store all the constants that would be used in the project
public class ConverterConstants {
    public static final double METER_FEET_UNIT = 3.28084;
    public static final double METER_INCH_UNIT = 39.3701;
    public static final double METER_CENTIMETER_UNIT = 100;
    public static final double KELVIN_CELSIUS_UNIT = 273.15;
    public static final double KILOGRAM_POUND_UNIT = 2.20462;
    public static final double KILOGRAM_GRAM_UNIT = 1000;
    public static final double GRAM_MILLIGRAM_UNIT = 1000;
    public static final double LITER_GALLON_UNIT = 3.785;
    public static final double LITER_MILLILITER_UNIT = 1000;
    public static final double MILLILITER_TABLESPOON_UNIT = 14.79;

    public static final String[] converterCategories = new String[]{"Length", "Temperature", "Weight", "Volume"};
    public static final String[] lengthConverterCategory = new String[]{"Meter to Feet", "Feet to Meter", "Meter to Inch", "Inch to Meter", "Meter to Centimeter", "Centimeter to Meter"};
    public static final String[] weightConverterCategory = new String[]{"Kilogram to Pound", "Pound to Kilogram", "Kilogram to Gram", "Gram to Kilogram", "Milligram to Gram", "Gram to Milligram"};
    public static final String[] temperatureConverterCategory = new String[]{"Celsius to Fahrenheit", "Fahrenheit to Celsius", "Celsius to Kelvin", "Kelvin to Celsius", "Fahrenheit to Kelvin", "Kelvin to Fahrenheit"};
    public static final String[] volumeConverterCategory = new String[]{"Liter to Gallon", "Gallon to Liter", "Liter to Milliliter", "Milliliter to Liter", "Tablespoon to Milliliter", "Milliliter to Tablespoon"};

}
