package com.iteriam.SanitasCalculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;

@RestController
public class OperatorController {

	@PostMapping(path= "/substract", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> substract(@RequestBody BasicOperandModel operand) {

			return new ResponseEntity<>(null);
	}
	
	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> add(@RequestBody BasicOperandModel operand) {

			return new ResponseEntity<>(null);
	}
}
