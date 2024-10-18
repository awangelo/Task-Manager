package com.github.awangelo.taskmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundException(IllegalArgumentException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error/404";
    }

}
