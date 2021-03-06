package com.iteriam.SanitasCalculator.service;

import com.iteriam.SanitasCalculator.model.BasicOperandModel;
import com.iteriam.SanitasCalculator.repository.TracerRepository;
/**
 * Clase que gestiona la lógica de una resta
 * @author Elen Suvarian
 *
 */
public class SubstractCalculatorService implements ICalculatorService{

	@Override
	public BasicOperandModel calculate(BasicOperandModel operand) {
		operand.setResult(operand.getLeftOperand() - operand.getRigthOperand());	
		return operand;
	}

	@Override
	public void trace(BasicOperandModel operand) {
		new TracerRepository().trace(operand);
	}
}
