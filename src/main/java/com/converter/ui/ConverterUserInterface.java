package com.converter.ui;


import javax.swing.*;

enum ConverterCategories {Length, Temperature, Weight}

public class ConverterUserInterface {

    public static void main(String[] args) {
        String[] converterCategories = new String[]{"Length", "Temperature", "Weight"};
        Object selectedCategory = selectCategory(converterCategories);

        //If the user clicks cancel, close the program
        if (selectedCategory == null) {
            System.exit(0);
            return;
        }

        //get the category selected by the user
        ConverterCategories category = convertSelectedCategory(selectedCategory.toString());

        switch (category) {
            case Length -> {


            }
            case Weight -> {

            }
            case Temperature -> {

            }
            default -> {
            }
        }

    }

    private static String selectCategory(String[] categories) {
        return JOptionPane.showInputDialog(null, "Hello!\nWhat do you want to convert?\n\n\n", "Unit Converter", JOptionPane.QUESTION_MESSAGE, null, categories, "Length").toString();

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

