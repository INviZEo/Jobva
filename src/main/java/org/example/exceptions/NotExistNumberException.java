package org.example.exceptions;

public class NotExistNumberException extends Exception { // Несуществующее значение
    public NotExistNumberException(String message) {
        super(message);
    }
}
