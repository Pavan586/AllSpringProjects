package com.ipl.players.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;



@ControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(value= {PlayerNotExistsException.class})
	public ResponseEntity<Object> handlePlayerNotExistsException(PlayerNotExistsException player) {
		ExceptionInfo ei=new ExceptionInfo(player.getMessage(),player.getCause(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(ei,HttpStatus.NOT_FOUND);
		
	}
	@org.springframework.web.bind.annotation.ExceptionHandler(value= {PlayerAlreadyExistsException.class})
	public ResponseEntity<Object> handlePlayerAlreadyExistsException(PlayerAlreadyExistsException player) {
		ExceptionInfo ei=new ExceptionInfo(player.getMessage(),player.getCause(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(ei,HttpStatus.NOT_FOUND);
		
	}

}
