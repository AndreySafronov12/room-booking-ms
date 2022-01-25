package ru.roombooking.front.exception;

import static org.springframework.http.HttpStatus.*;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(BAD_REQUEST)
public class EmployeeViewBadRequestException extends IllegalArgumentException {
    public EmployeeViewBadRequestException() {
        super();
    }

    public EmployeeViewBadRequestException(String s) {
        super(s);
    }

    public EmployeeViewBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeViewBadRequestException(Throwable cause) {
        super(cause);
    }
}