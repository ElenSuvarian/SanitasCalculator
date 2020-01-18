package com.iteriam.SanitasCalculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;
import com.iteriam.SanitasCalculator.service.AddCalculatorService;
import com.iteriam.SanitasCalculator.service.ICalculatorService;
import com.iteriam.SanitasCalculator.service.SubstractCalculatorService;

@RestController
public class OperatorController {

	ICalculatorService calculator;
	
	@PostMapping(path= "/substract", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> substract(@RequestBody BasicOperandModel operand) {
		calculator = new SubstractCalculatorService(); 
		operand = calculator.calculate(operand);
				
		return new ResponseEntity<>(operand.getResult(), HttpStatus.OK);
	}
	
	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> add(@RequestBody BasicOperandModel operand) {
		calculator = new AddCalculatorService();
		operand = calculator.calculate(operand);
		
		return new ResponseEntity<>(operand.getResult(), HttpStatus.OK);
	}
}
