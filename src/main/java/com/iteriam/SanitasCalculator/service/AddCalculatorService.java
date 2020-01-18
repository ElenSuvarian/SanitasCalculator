package com.iteriam.SanitasCalculator.service;

import com.iteriam.SanitasCalculator.model.BasicOperandModel;

public class AddCalculatorService implements ICalculatorService{

	@Override
	public BasicOperandModel calculate(BasicOperandModel operand) {
		operand.setResult(operand.getLeftOperand() + operand.getRigthOperand());
		return operand;
	}
}
