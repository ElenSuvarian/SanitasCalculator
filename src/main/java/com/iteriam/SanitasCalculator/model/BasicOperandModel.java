package com.iteriam.SanitasCalculator.model;

import org.springframework.stereotype.Repository;

@Repository
public class BasicOperandModel {

	protected double leftOperand;
	protected double rigthOperand;
	private double result;
	
	public BasicOperandModel(double leftOperand, double rigthOperand) {
		this.leftOperand = leftOperand;
		this.rigthOperand = rigthOperand;
	}

	public BasicOperandModel() {
	}	

	public double getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(double leftOperand) {
		this.leftOperand = leftOperand;
	}

	public double getRigthOperand() {
		return rigthOperand;
	}

	public void setRigthOperand(double rigthOperand) {
		this.rigthOperand = rigthOperand;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
}
