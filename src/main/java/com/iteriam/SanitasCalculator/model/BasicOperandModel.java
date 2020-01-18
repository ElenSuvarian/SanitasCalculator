package com.iteriam.SanitasCalculator.model;

import org.springframework.stereotype.Repository;
/**
 * Clase de modelo que contiene los atributos y de una operación matemática básica
 * @author Elen Suvarian
 *
 */
@Repository
public class BasicOperandModel {

	protected double leftOperand;
	protected double rigthOperand;
	private double result;
	
	/**
	 * Constructor
	 * @param leftOperand operando izquierdo
	 * @param rigthOperand operando derecho
	 */
	public BasicOperandModel(double leftOperand, double rigthOperand) {
		this.leftOperand = leftOperand;
		this.rigthOperand = rigthOperand;
	}

	/**
	 * Constructor vacío
	 */
	public BasicOperandModel() {
	}	
	/**
	 * obtiene el valor del operando izquierdo
	 * @return valor del operando izquierdo
	 */
	public double getLeftOperand() {
		return leftOperand;
	}
	/**
	 * establece el valor del operando izquierdo
	 * @param leftOperand valor del operando izquierdo
	 */
	public void setLeftOperand(double leftOperand) {
		this.leftOperand = leftOperand;
	}

	/**
	 * obtiene el valor del operando derecho
	 * @return valor del operando derecho
	 */
	public double getRigthOperand() {
		return rigthOperand;
	}
	/**
	 * establece el valor del operando derercho
	 * @param rigthOperand valor del operando derecho
	 */
	public void setRigthOperand(double rigthOperand) {
		this.rigthOperand = rigthOperand;
	}
	/**
	 * obtiene el valor del resultado de la operación
	 * @return valor del resultado de la operación
	 */
	public double getResult() {
		return result;
	}
	/**
	 * establece el valor del resultado de la operación
	 * @param result valor del resultado
	 */
	public void setResult(double result) {
		this.result = result;
	}
}
