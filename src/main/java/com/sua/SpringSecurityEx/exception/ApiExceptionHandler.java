package com.sua.SpringSecurityEx.exception;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * This class is used to handle exceptions in the all rest controller class.
 */
@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * This method is used to handle ObjectNotFoundException in all rest controller class.
     * In this we use Spring AOP concept to handle global exception.
     */
    @ExceptionHandler(value = {ObjectNotFoundException.class})
    public ResponseEntity<String> handleApiRequestException(ObjectNotFoundException e) {
        return new ResponseEntity<String>(e.getEntityName(), HttpStatus.NOT_FOUND);
    }
}
