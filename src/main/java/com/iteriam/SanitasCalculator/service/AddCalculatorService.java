package com.iteriam.SanitasCalculator.service;

import com.iteriam.SanitasCalculator.model.BasicOperandModel;
import com.iteriam.SanitasCalculator.repository.TracerRepository;

public class AddCalculatorService implements ICalculatorService{

	@Override
	public BasicOperandModel calculate(BasicOperandModel operand) {
		operand.setResult(operand.getLeftOperand() + operand.getRigthOperand());
		return operand;
	}
	
	@Override
	public void trace(BasicOperandModel operand) {
		new TracerRepository().trace(operand);
	}
}
