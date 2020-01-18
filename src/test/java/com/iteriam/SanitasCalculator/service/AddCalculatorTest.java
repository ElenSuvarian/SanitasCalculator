package com.iteriam.SanitasCalculator.service;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;

class AddCalculatorTest {

	private final static AddCalculatorService ADDCALCULATOR = new AddCalculatorService();
	private final static BasicOperandModel OPERAND = new BasicOperandModel(5,2);	
	
	@Test
	public void givenTwoNumbersShouldCalculateCorrectlySubstract() {
		BasicOperandModel  operand = ADDCALCULATOR.calculate(OPERAND);
		Assertions.assertEquals(7, operand.getResult(), 0);
	}
	
	@Test
	public void shouldPrintCorrectResult() {
		BasicOperandModel operand = new BasicOperandModel();
		operand.setResult(7);
		
		ByteArrayOutputStream byteArrayOutPut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutPut));

		ADDCALCULATOR.trace(operand);
		String expected  = "result :: 7.0\r\n";

		Assertions.assertEquals(expected, byteArrayOutPut.toString());
	}

}
