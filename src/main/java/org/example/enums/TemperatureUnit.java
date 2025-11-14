package org.example.enums;

public enum TemperatureUnit {  // Единицы измерения температуры

    CELSIUS {
        @Override
        public double toCelsius(double value) {
            return value;
        }

        @Override
        public double fromCelsius(double c) {
            return c;
        }
    },

    FAHRENHEIT {
        @Override
        public double toCelsius(double value) {
            return (value - 32) * 5.0 / 9.0;
        }

        @Override
        public double fromCelsius(double c) {
            return c * 9.0 / 5.0 + 32;
        }

    },
    KELVIN {
        @Override
        public double toCelsius(double value) {
            return value - 273.15;
        }

        @Override
        public double fromCelsius(double c) {
            return c + 273.15;
        }
    };

    public abstract double toCelsius(double value);

    public abstract double fromCelsius(double celsius);

}