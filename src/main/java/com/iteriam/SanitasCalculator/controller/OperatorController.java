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
/**
 * Clase receptora de peticiones
 * @author esuvarian
 *
 */
@RestController
public class OperatorController {

	ICalculatorService calculator;
	
	//Creamos las llamada de tipo POST de cara a que crezca el número de parámetros de entrada
	
	/**
	 * Método que recibe la petición de la resta
	 * @param operand objeto que contiene los operandos
	 * @return resultado de tipo Http que contiene el resultado
	 */
	@PostMapping(path= "/substract", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> substract(@RequestBody BasicOperandModel operand) {
		calculator = new SubstractCalculatorService(); 
		try {
			operand = calculator.calculate(operand);
			return new ResponseEntity<>(operand.getResult(), HttpStatus.OK);
		}catch(Exception ex){	
			return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}finally {
			calculator.trace(operand);
		}
	}
	/**
	 * Método que recibe la petición de la suma
	 * @param operand objeto que contiene los operandos
	 * @return resultado de tipo Http que contiene el resultado
	 */
	@PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> add(@RequestBody BasicOperandModel operand) {
		calculator = new AddCalculatorService(); 
		try {	
			operand = calculator.calculate(operand);
			return new ResponseEntity<>(operand.getResult(), HttpStatus.OK);
		}catch(Exception ex){
			return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}finally {
			calculator.trace(operand);
		}
	}
}
