package com.calculatorOperations.SimpleCalculator;

public class Modulus extends Operations{
	public double numberOperations() {
		if(this.secondNumber == 0.0)
			return this.firstNumber;
		else
			return this.firstNumber % this.secondNumber;
	}
}
