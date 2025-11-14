package org.example.converters;

import org.example.enums.TemperatureUnit;

public class TemperatureConverter implements BaseConverter<TemperatureUnit> {
    @Override
    public double convert(double value, TemperatureUnit from, TemperatureUnit to) {
        double inCelsius = from.toCelsius(value);
        return to.fromCelsius(inCelsius);
    }
}
