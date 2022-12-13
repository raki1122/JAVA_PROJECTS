package com.example.SchoolApplication.CustomExce;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(IdNotFoundException.class)
	public final ResponseEntity<ErrorDetails> handleIdNotFOundException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails=new ErrorDetails(ex.getMessage(), LocalDateTime.now(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
}
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

		ErrorDetails errorDetails=new ErrorDetails("Total Number of errors "+ex.getErrorCount()+". FIrst error is: "+ ex.getFieldError().getDefaultMessage(), LocalDateTime.now(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
	}
}
