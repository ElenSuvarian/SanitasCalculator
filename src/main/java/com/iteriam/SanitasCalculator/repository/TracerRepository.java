package com.iteriam.SanitasCalculator.repository;

import org.springframework.stereotype.Repository;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;
import io.corp.calculator.TracerImpl;

@Repository
public class TracerRepository {
	
	public void trace(BasicOperandModel operand) {
		new TracerImpl().trace(operand.getResult());
	}
}
