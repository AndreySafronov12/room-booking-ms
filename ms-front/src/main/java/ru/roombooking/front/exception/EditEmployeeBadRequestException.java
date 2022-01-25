package ru.roombooking.front.exception;

import static org.springframework.http.HttpStatus.*;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(BAD_REQUEST)
public class EditEmployeeBadRequestException extends IllegalArgumentException {
    public EditEmployeeBadRequestException() {
        super();
    }

    public EditEmployeeBadRequestException(String s) {
        super(s);
    }

    public EditEmployeeBadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public EditEmployeeBadRequestException(Throwable cause) {
        super(cause);
    }
}