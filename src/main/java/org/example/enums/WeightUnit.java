package org.example.enums;

public enum WeightUnit { // Единицы измерения веса
    KILOGRAM(1.0),
    POUND(0.453592),
    OUNCE(0.02835);

    private final double toKilograms;

    WeightUnit(double toKilograms) {
        this.toKilograms = toKilograms;
    }

    public double toKilograms(double value) {
        return value * this.toKilograms;
    }

    public double fromKilograms(double value) {
        return value / this.toKilograms;
    }
}
