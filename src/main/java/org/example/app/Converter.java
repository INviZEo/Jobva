package org.example.app;

import org.example.converters.LengthConverter;
import org.example.converters.TemperatureConverter;
import org.example.converters.WeightConverter;
import org.example.enums.LengthUnit;
import org.example.enums.TemperatureUnit;
import org.example.enums.WeightUnit;
import org.example.exceptions.CategoryException;
import org.example.exceptions.NotExistNumberException;

import java.util.Scanner;

public class Converter {
    private final Scanner scanner = new Scanner(System.in);

    public void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what will we measure");
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "WEIGHT" -> {
                WeightConverter weightConverter = new WeightConverter();
                WeightUnit from = readUnit(WeightUnit.class, "Enter Weight Unit");
                WeightUnit to = readUnit(WeightUnit.class, "Enter Weight Unit");
                double value = readValue("Enter number of mass");
                double result = weightConverter.convert(value, from, to);
                printResult(value, from, result, to);
            }

            case "LENGTH" -> {
                LengthConverter lengthConverter = new LengthConverter();
                LengthUnit from = readUnit(LengthUnit.class, "Enter Length Unit");
                LengthUnit to = readUnit(LengthUnit.class, "Enter Length Unit");
                double value = readValue("Enter number of length");
                double result = lengthConverter.convert(value, from, to);
                printResult(value, from, result, to);
            }

            case "TEMPERATURE" -> {
                TemperatureConverter temperatureConverter = new TemperatureConverter();
                TemperatureUnit from = readUnit(TemperatureUnit.class, "Enter Temperature Unit");
                TemperatureUnit to = readUnit(TemperatureUnit.class, "Enter Temperature Unit");
                double value = readValue("Enter number of temperature");
                double result = temperatureConverter.convert(value, from, to);
                printResult(value, from, result, to);
            }

            default -> throw new CategoryException("Not supported category: " + input);
        }

    }

    private <T extends Enum<T>> T readUnit(Class<T> enumClass, String prompt) throws CategoryException {
        System.out.println(prompt);
        String input = scanner.nextLine().trim().toUpperCase();
        try {
            return Enum.valueOf(enumClass, input);
        } catch (IllegalArgumentException e) {
            throw new CategoryException("Неверная единица: " + input);
        }
    }

    private double readValue(String prompt) throws NotExistNumberException {
        System.out.println(prompt);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.nextLine();
            throw new NotExistNumberException("Invalid number. Please enter a number (e.g. 10.5)");
        }
    }

    private void printResult(double value, Enum<?> from, double result, Enum<?> to) {
        System.out.printf("%.3f %s = %.3f %s%n", value, from, result, to);
    }

    private <T extends Enum<T>> String getAvailableUnits(Class<T> enumClass) {
        T[] units = enumClass.getEnumConstants();
        if (units == null || units.length == 0) {
            return "Доступных значений нет";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < units.length - 1; i++) {
            sb.append(units[i]);
            if (i < units.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}