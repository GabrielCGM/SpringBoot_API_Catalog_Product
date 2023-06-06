package com.catalog.product.exceptions;

import jakarta.validation.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class SouceHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public SourceProductError methodArgumentNotValid(MethodArgumentNotValidException exception){
        FieldError fieldError = exception.getBindingResult().getFieldErrors().get(0);

        return new SourceProductError(new Date(), fieldError.getField(), fieldError.getDefaultMessage());
    }
}
