package ru.roombooking.admin.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE;

@ResponseStatus(SERVICE_UNAVAILABLE)
public class EmployeeDeleteException extends RuntimeException {
    public EmployeeDeleteException() {
        super();
    }

    public EmployeeDeleteException(String message) {
        super(message);
    }

    public EmployeeDeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeDeleteException(Throwable cause) {
        super(cause);
    }

    protected EmployeeDeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}