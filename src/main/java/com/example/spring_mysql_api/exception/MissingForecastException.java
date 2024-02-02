package com.example.spring_mysql_api.exception;

public class MissingForecastException extends RuntimeException{
    public MissingForecastException() {
    }

    public MissingForecastException(String message) {
        super(message);
    }

    public MissingForecastException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingForecastException(Throwable cause) {
        super(cause);
    }

}
