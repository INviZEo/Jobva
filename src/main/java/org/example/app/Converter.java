package org.example.app;

import org.example.converters.LengthConverter;
import org.example.converters.TemperatureConverter;
import org.example.converters.WeightConverter;
import org.example.enums.LengthUnit;
import org.example.enums.TemperatureUnit;
import org.example.enums.WeightUnit;
import org.example.exceptions.CategoryException;

import java.util.Scanner;

public class Converter {
    private final Scanner scanner = new Scanner(System.in);

    public void run() throws Exception {
        System.out.println("The converter, format: category value from to");
        System.out.println("Example: weight 10 pound kilogram");
        System.out.println("Enter 'exit' for exit the program\n");

        while (true) {
            System.out.println(">>> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            try {
                processSingleLine(input);
            } catch (CategoryException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    private void processSingleLine(String input) throws CategoryException {
        String[] parts = input.split("\\s+");
        if (parts.length != 4) {
            throw new CategoryException("Invalid input: Example: weight 10 pound kilogram");
        }

        String category = parts[0].toUpperCase();
        double value = parseValueFromString(parts[1]);
        String fromStr = parts[2].toUpperCase();
        String toStr = parts[3].toUpperCase();

        switch (category) {
            case "WEIGHT" -> {
                WeightConverter weightConverter = new WeightConverter();
                WeightUnit from = readUnit(WeightUnit.class, fromStr);
                WeightUnit to = readUnit(WeightUnit.class, toStr);
                double result = weightConverter.convert(value, from, to);
                printResult(value, from, result, to);
            }

            case "LENGTH" -> {
                LengthConverter lengthConverter = new LengthConverter();
                LengthUnit from = readUnit(LengthUnit.class, fromStr);
                LengthUnit to = readUnit(LengthUnit.class, toStr);
                double result = lengthConverter.convert(value, from, to);
                printResult(value, from, result, to);
            }

            case "TEMPERATURE" -> {
                TemperatureConverter temperatureConverter = new TemperatureConverter();
                TemperatureUnit from = readUnit(TemperatureUnit.class, fromStr);
                TemperatureUnit to = readUnit(TemperatureUnit.class, toStr);
                double result = temperatureConverter.convert(value, from, to);
                printResult(value, from, result, to);
            }
            default -> throw new CategoryException("Not supported category: " + category);
        }
    }


    private <T extends Enum<T>> T readUnit(Class<T> enumClass, String prompt) throws CategoryException {
        try {
            return Enum.valueOf(enumClass, prompt);
        } catch (IllegalArgumentException e) {
            throw new CategoryException("Wrong unit: " + prompt + ". Available units: "
                    + getAvailableUnits(enumClass));
        }
    }

    private double parseValueFromString(String s) throws CategoryException {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            throw new CategoryException("Wrong number: '" + s + "'");
        }
    }

    private void printResult(double value, Enum<?> from, double result, Enum<?> to) {
        System.out.printf("%.2f %s = %.2f %s%n", value, from, result, to);
    }

    private <T extends Enum<T>> String getAvailableUnits(Class<T> enumClass) {
        T[] units = enumClass.getEnumConstants();
        if (units == null || units.length == 0) {
            return "Доступных значений нет";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < units.length; i++) {
            sb.append(units[i]);
            if (i < units.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}