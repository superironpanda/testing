package com.calculatorOperations.SimpleCalculator;

public class Divide extends Operations{
	public double numberOperations() {
		
		if (this.secondNumber != 0){
			return this.firstNumber / this.secondNumber;
		}
		else
			return Double.POSITIVE_INFINITY;
	}
}
