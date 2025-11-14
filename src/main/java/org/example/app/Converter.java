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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what will we measure");
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "WEIGHT" -> {
                WeightConverter weightConverter = new WeightConverter();
                System.out.println("Enter kilogram, ounce or pound");
                WeightUnit weightUnit = WeightUnit.valueOf(scanner.nextLine().toUpperCase());
                System.out.println("Enter kilogram, ounce or pound");
                WeightUnit weightUnit2 = WeightUnit.valueOf(scanner.nextLine().toUpperCase());
                System.out.println("Enter number of mass");
                int mass = scanner.nextInt();
                System.out.println(mass + " " + weightUnit + " = "
                        + weightConverter.convert(mass, weightUnit, weightUnit2) + " " + weightUnit2);
            }

            case "LENGTH" -> {
                LengthConverter lengthConverter = new LengthConverter();
                System.out.println("Enter meter, kilometer or mile");
                LengthUnit lengthUnit = LengthUnit.valueOf(scanner.nextLine().toUpperCase());
                System.out.println("Enter meter, kilometer or mile");
                LengthUnit lengthUnit2 = LengthUnit.valueOf(scanner.nextLine().toUpperCase());
                System.out.println("Enter number of length");
                int length = scanner.nextInt();
                System.out.println(length + " " + lengthUnit + " = "
                        + lengthConverter.convert(length, lengthUnit, lengthUnit2) + " " + lengthUnit2);
            }


            case "TEMPERATURE" -> {
                TemperatureConverter temperatureConverter = new TemperatureConverter();
                System.out.println("Enter celsius, fahrenheit, kelvin");
                TemperatureUnit temperatureUnit = TemperatureUnit.valueOf(scanner.nextLine().toUpperCase());
                System.out.println("Enter celsius, fahrenheit, kelvin");
                TemperatureUnit temperatureUnit2 = TemperatureUnit.valueOf(scanner.nextLine().toUpperCase());
                System.out.println("Enter number of temperature");
                int temperature = scanner.nextInt();
                System.out.println(temperature + " " + temperatureUnit + " = "
                        + temperatureConverter.convert(temperature, temperatureUnit, temperatureUnit2) + " " + temperatureUnit2);
            }

            default -> throw new CategoryException("Not supported category: " + input);
        }
    }
}