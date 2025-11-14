package org.example.converters;

import org.example.enums.WeightUnit;

public class WeightConverter implements BaseConverter<WeightUnit> {
    @Override
    public double convert(double value, WeightUnit from, WeightUnit to) {
        double inKilo = from.toKilograms(value);
        return to.fromKilograms(inKilo);
    }
}
