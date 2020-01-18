package com.iteriam.SanitasCalculator.service;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;

class SubstractCalculatorTest {

	private final static SubstractCalculatorService SUBSTRACTCALCULATOR = new SubstractCalculatorService();
	private final static BasicOperandModel OPERAND = new BasicOperandModel(5,2);	
	
	@Test
	public void givenTwoNumbersShouldCalculateCorrectlySubstract() {
		BasicOperandModel  operand = SUBSTRACTCALCULATOR.calculate(OPERAND);
		Assertions.assertEquals(3, operand.getResult(), 0);
	}
	
	@Test
	public void shouldPrintCorrectResult() {
		BasicOperandModel operand = new BasicOperandModel();
		operand.setResult(3);
		
		ByteArrayOutputStream byteArrayOutPut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteArrayOutPut));

		SUBSTRACTCALCULATOR.trace(operand);
		String expected  = "result :: 3.0\r\n";

		Assertions.assertEquals(expected, byteArrayOutPut.toString());
	}

}
