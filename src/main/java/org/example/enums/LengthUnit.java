package org.example.enums;

public enum LengthUnit {
    METER(1.0),
    KILOMETER(1000),
    MILE(1609.34); // Единицы измерения длины

    private final double toMeters;

    LengthUnit(double toMeters) {
        this.toMeters = toMeters;
    }

    public double toMeters(double value) {
        return value * this.toMeters;
    }

    public double fromMeters(double meters) {
        return meters / this.toMeters;
    }
}
