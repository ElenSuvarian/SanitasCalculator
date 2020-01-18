package com.iteriam.SanitasCalculator.service;

import org.springframework.stereotype.Service;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;
/**
 * Inerfaz que contiene las operaciones propias de una calculadora matemática
 * @author esuvarian
 *
 */
@Service
public interface ICalculatorService {

	/**
	 * Método que calcula operaciones matemáticas
	 * @param operand objeto que contiene los operandos de una operación matemática
	 * @return resultado de la operación
	 */
	public BasicOperandModel calculate(BasicOperandModel operand);
	/**
	 * Método que tracea el resultado de una operación matemática
	 * @param operand resultado de la operación
	 */
	public void trace(BasicOperandModel operand);
}
