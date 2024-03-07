package com.converter.ui;


import com.converter.constants.ConverterConstants;
import com.converter.length.LengthConverter;
import com.converter.temperature.TemperatureConverter;
import com.converter.volume.VolumeConverter;
import com.converter.weight.WeightConverter;

import javax.swing.*;

enum ConverterCategories {Length, Temperature, Weight, Volume}

public class ConverterUserInterface {

    public static void main(String[] args) {
        Object selectedCategory = selectCategory();

        //If the user clicks cancel, close the program
        if (selectedCategory == null) {
            System.exit(0);
            return;
        }

        //get the category selected by the user
        ConverterCategories category = convertSelectedCategory(selectedCategory.toString());

        switch (category) {
            case Length -> {
                Object converterOption = JOptionPane.showInputDialog(null, "Select the unit you want to convert", "Length Converter", JOptionPane.QUESTION_MESSAGE, null, ConverterConstants.lengthConverterCategory, null);
                if (converterOption == null) {
                    System.exit(0);
                    return;
                }
                String selectedConverter = converterOption.toString();
                switch (selectedConverter) {
                    case "Meter to Feet" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in meters", "Length Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double meters = Double.parseDouble(input);
                        double feet = LengthConverter.convertMetersToFeet(meters);
                        JOptionPane.showMessageDialog(null, meters + " meters is equal to " + feet + " feet", "Length Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Feet to Meter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in feet", "Length Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double feet = Double.parseDouble(input);
                        double meters = LengthConverter.convertFeetToMeters(feet);
                        JOptionPane.showMessageDialog(null, feet + " feet is equal to " + meters + " meters", "Length Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Meter to Inch" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in meters", "Length Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double meters = Double.parseDouble(input);
                        double inches = LengthConverter.convertMetersToInches(meters);
                        JOptionPane.showMessageDialog(null, meters + " meters is equal to " + inches + " inches", "Length Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Inch to Meter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in inches", "Length Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double inches = Double.parseDouble(input);
                        double meters = LengthConverter.convertInchesToMeters(inches);
                        JOptionPane.showMessageDialog(null, inches + " inches is equal to " + meters + " meters", "Length Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Meter to Centimeter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in meters", "Length Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double meters = Double.parseDouble(input);
                        double centimeters = LengthConverter.convertMetersToCentimeters(meters);
                        JOptionPane.showMessageDialog(null, meters + " meters is equal to " + centimeters + " centimeters", "Length Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Centimeter to Meter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in centimeters", "Length Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double centimeters = Double.parseDouble(input);
                        double meters = LengthConverter.convertCentimetersToMeters(centimeters);
                        JOptionPane.showMessageDialog(null, centimeters + " centimeters is equal to " + meters + " meters", "Length Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                }


            }
            case Weight -> {
                Object converterOption = JOptionPane.showInputDialog(null, "Select the unit you want to convert", "Weight Converter", JOptionPane.QUESTION_MESSAGE, null, ConverterConstants.weightConverterCategory, null);
                if (converterOption == null) {
                    System.exit(0);
                    return;
                }
                String selectedConverter = converterOption.toString();
                switch (selectedConverter) {
                    case "Kilogram to Pound" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in kilograms", "Weight Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double kilograms = Double.parseDouble(input);
                        double pounds = WeightConverter.convertKilogramsToPounds(kilograms);
                        JOptionPane.showMessageDialog(null, kilograms + " kilograms is equal to " + pounds + " pounds", "Weight Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Pound to Kilogram" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in pounds", "Weight Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double pounds = Double.parseDouble(input);
                        double kilograms = WeightConverter.convertPoundsToKilograms(pounds);
                        JOptionPane.showMessageDialog(null, pounds + " pounds is equal to " + kilograms + " kilograms", "Weight Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Kilogram to Gram" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in kilograms", "Weight Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double kilograms = Double.parseDouble(input);
                        double grams = WeightConverter.convertKilogramsToGrams(kilograms);
                        JOptionPane.showMessageDialog(null, kilograms + " kilograms is equal to " + grams + " grams", "Weight Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Gram to Kilogram" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in grams", "Weight Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double grams = Double.parseDouble(input);
                        double kilograms = WeightConverter.convertGramsToKilograms(grams);
                        JOptionPane.showMessageDialog(null, grams + " grams is equal to " + kilograms + " kilograms", "Weight Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Gram to Milligram" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in gram", "Weight Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double gram = Double.parseDouble(input);
                        double milligrams = WeightConverter.convertGramsToMilligrams(gram);
                        JOptionPane.showMessageDialog(null, gram + " gram is equal to " + milligrams + " milligrams", "Weight Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Milligram to Gram" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in milligrams", "Weight Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double milligrams = Double.parseDouble(input);
                        double gram = WeightConverter.convertMilligramsToGrams(milligrams);
                        JOptionPane.showMessageDialog(null, milligrams + " milligrams is equal to " + gram + " grams", "Weight Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
            case Temperature -> {
                Object converterOption = JOptionPane.showInputDialog(null, "Select the unit you want to convert", "Temperature Converter", JOptionPane.QUESTION_MESSAGE, null, ConverterConstants.temperatureConverterCategory, null);
                if (converterOption == null) {
                    System.exit(0);
                    return;
                }
                String selectedConverter = converterOption.toString();
                switch (selectedConverter) {
                    case "Celsius to Fahrenheit" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in celsius", "Temperature Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double celsius = Double.parseDouble(input);
                        double fahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsius);
                        JOptionPane.showMessageDialog(null, celsius + " celsius is equal to " + fahrenheit + " fahrenheit", "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Fahrenheit to Celsius" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in fahrenheit", "Temperature Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double fahrenheit = Double.parseDouble(input);
                        double celsius = TemperatureConverter.convertFahrenheitToCelsius(fahrenheit);
                        JOptionPane.showMessageDialog(null, fahrenheit + " fahrenheit is equal to " + celsius + " celsius", "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Celsius to Kelvin" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in celsius", "Temperature Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double celsius = Double.parseDouble(input);
                        double kelvin = TemperatureConverter.convertCelsiusToKelvin(celsius);
                        JOptionPane.showMessageDialog(null, celsius + " celsius is equal to " + kelvin + " kelvin", "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Kelvin to Celsius" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in kelvin", "Temperature Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double kelvin = Double.parseDouble(input);
                        double celsius = TemperatureConverter.convertKelvinToCelsius(kelvin);
                        JOptionPane.showMessageDialog(null, kelvin + " kelvin is equal to " + celsius + " celsius", "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Fahrenheit to Kelvin" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in fahrenheit", "Temperature Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double fahrenheit = Double.parseDouble(input);
                        double kelvin = TemperatureConverter.convertFahrenheitToKelvin(fahrenheit);
                        JOptionPane.showMessageDialog(null, fahrenheit + " fahrenheit is equal to " + kelvin + " kelvin", "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Kelvin to Fahrenheit" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in kelvin", "Temperature Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double kelvin = Double.parseDouble(input);
                        double fahrenheit = TemperatureConverter.convertKelvinToFahrenheit(kelvin);
                        JOptionPane.showMessageDialog(null, kelvin + " kelvin is equal to " + fahrenheit + " fahrenheit", "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
            case Volume -> {
                Object converterOption = JOptionPane.showInputDialog(null, "Select the unit you want to convert", "Volume Converter", JOptionPane.QUESTION_MESSAGE, null, ConverterConstants.volumeConverterCategory, null);
                if (converterOption == null) {
                    System.exit(0);
                    return;
                }
                String selectedConverter = converterOption.toString();
                switch (selectedConverter) {
                    case "Liter to Gallon" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in liters", "Volume Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double liters = Double.parseDouble(input);
                        double gallons = VolumeConverter.convertLitersToGallon(liters);
                        JOptionPane.showMessageDialog(null, liters + " liters is equal to " + gallons + " gallons", "Volume Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Gallon to Liter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in gallons", "Volume Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double gallons = Double.parseDouble(input);
                        double liters = VolumeConverter.convertGallonToLiters(gallons);
                        JOptionPane.showMessageDialog(null, gallons + " gallons is equal to " + liters + " liters", "Volume Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Liter to Milliliter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in liters", "Volume Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double liters = Double.parseDouble(input);
                        double milliliters = VolumeConverter.convertLitersToMilliliters(liters);
                        JOptionPane.showMessageDialog(null, liters + " liters is equal to " + milliliters + " milliliters", "Volume Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Milliliter to Liter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in milliliters", "Volume Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double milliliters = Double.parseDouble(input);
                        double liters = VolumeConverter.convertMillilitersToLiters(milliliters);
                        JOptionPane.showMessageDialog(null, milliliters + " milliliters is equal to " + liters + " liters", "Volume Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Tablespoon to Milliliter" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in tablespoons", "Volume Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double tablespoons = Double.parseDouble(input);
                        double milliliters = VolumeConverter.convertTablespoonToMilliliters(tablespoons);
                        JOptionPane.showMessageDialog(null, tablespoons + " tablespoons is equal to " + milliliters + " milliliters", "Volume Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case "Milliliter to Tablespoon" -> {
                        String input = JOptionPane.showInputDialog(null, "Enter the value in milliliters", "Volume Converter", JOptionPane.QUESTION_MESSAGE);
                        if (input == null) {
                            System.exit(0);
                            return;
                        }
                        double milliliters = Double.parseDouble(input);
                        double tablespoons = VolumeConverter.convertMillilitersToTablespoon(milliliters);
                        JOptionPane.showMessageDialog(null, milliliters + " milliliters is equal to " + tablespoons + " tablespoons", "Volume Converter", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
            default -> {
            }
        }

    }

    private static String selectCategory() {
        return JOptionPane.showInputDialog(null, "Hello!\nWhat would you want to convert?\n\n\n", "Unit Converter", JOptionPane.QUESTION_MESSAGE, null, com.converter.constants.ConverterConstants.converterCategories, "Length").toString();

    }

    //function to convert the selected category to the enum
    private static ConverterCategories convertSelectedCategory(String category) {
        return switch (category) {
            case "Length" -> ConverterCategories.Length;
            case "Temperature" -> ConverterCategories.Temperature;
            case "Weight" -> ConverterCategories.Weight;
            case "Volume" -> ConverterCategories.Volume;
            default -> null;
        };
    }
}

