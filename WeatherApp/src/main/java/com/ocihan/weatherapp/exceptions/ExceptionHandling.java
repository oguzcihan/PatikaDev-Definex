package com.ocihan.weatherapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(LocationNotFoundException.class)
    public ResponseEntity<?> CustomException(LocationNotFoundException customException){
        return new ResponseEntity<>(customException.getMessage(), HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> FoundHandler(IllegalArgumentException illegalArgumentException){
        return new ResponseEntity<>(illegalArgumentException.getMessage(),HttpStatus.BAD_REQUEST);
    }

}
