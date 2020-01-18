package com.iteriam.SanitasCalculator.repository;

import org.springframework.stereotype.Repository;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;
import io.corp.calculator.TracerImpl;
/**
 * Clase de gestiona logs
 * @author Elen Suvarian
 *
 */
@Repository
public class TracerRepository {
	/**
	 * Clase encargada de utilizar la librería de traceado
	 * @param operand resultado de una operación matemática
	 */
	public void trace(BasicOperandModel operand) {
		new TracerImpl().trace(operand.getResult());
	}
}
