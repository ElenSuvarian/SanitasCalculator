package com.iteriam.SanitasCalculator.service;

import org.springframework.stereotype.Service;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;

@Service
public interface ICalculatorService {

	public BasicOperandModel calculate(BasicOperandModel operand);
	public void trace(BasicOperandModel operand);
}
