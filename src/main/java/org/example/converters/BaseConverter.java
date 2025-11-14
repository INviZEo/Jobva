package org.example.converters;

public interface BaseConverter<T> {
    double convert(double value, T from, T to); // Общий метод для конвертации
}
