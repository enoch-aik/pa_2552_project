package com.converter.weight;

import com.converter.constants.ConverterConstants;

public class WeightConverter {
    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * ConverterConstants.KILOGRAM_POUND_UNIT;
    }

    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds / ConverterConstants.KILOGRAM_POUND_UNIT;
    }

    //convert kilograms to grams
    public static double convertKilogramsToGrams(double kilograms) {
        return kilograms * ConverterConstants.KILOGRAM_GRAM_UNIT;
    }

    //convert grams to kilograms
    public static double convertGramsToKilograms(double grams) {
        return grams / ConverterConstants.KILOGRAM_GRAM_UNIT;
    }

    //convert pounds to grams
    public static double convertGramsToMilligrams(double pounds) {
        return pounds * ConverterConstants.GRAM_MILLIGRAM_UNIT;
    }

    //convert grams to pounds
    public static double convertMilligramsToGrams(double grams) {
        return grams / ConverterConstants.GRAM_MILLIGRAM_UNIT;
    }
}

