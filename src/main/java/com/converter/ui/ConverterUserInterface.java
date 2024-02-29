package com.converter.ui;


import com.converter.constants.ConverterConstants;
import com.converter.length.LengthConverter;

import javax.swing.*;

enum ConverterCategories {Length, Temperature, Weight, Volume}

public class ConverterUserInterface {

    public static void main(String[] args) {
        // String[] converterCategories = new String[]{"Length", "Temperature", "Weight"};
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
                Object converter0ption = JOptionPane.showInputDialog(null, "Select the unit you want to convert", "Length Converter", JOptionPane.QUESTION_MESSAGE, null, ConverterConstants.lengthConverterCategory, null);
                if (converter0ption == null) {
                    System.exit(0);
                    return;
                }
                String selectedConverter = converter0ption.toString();
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
                    case "Inches to Meter" -> {
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
                }


            }
            case Weight -> {

            }
            case Temperature -> {

            }
            case Volume -> {

            }
            default -> {
            }
        }

    }

    private static String selectCategory() {
        return JOptionPane.showInputDialog(null, "Hello!\nWhat do you want to convert?\n\n\n", "Unit Converter", JOptionPane.QUESTION_MESSAGE, null, com.converter.constants.ConverterConstants.converterCategories, "Length").toString();

    }

    //function to convert the selected category to the enum
    private static ConverterCategories convertSelectedCategory(String category) {
        return switch (category) {
            case "Length" -> ConverterCategories.Length;
            case "Temperature" -> ConverterCategories.Temperature;
            case "Weight" -> ConverterCategories.Weight;
            default -> null;
        };
    }
}

