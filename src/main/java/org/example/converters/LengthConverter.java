package org.example.converters;

import org.example.enums.LengthUnit;

public class LengthConverter implements BaseConverter<LengthUnit> {
    @Override
    public double convert(double value, LengthUnit from, LengthUnit to) {
        double inMeters = from.toMeters(value);
        return to.fromMeters(inMeters);
    }
}
