package com.userInput.SimpleCalculator;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import com.calculatorOperations.SimpleCalculator.*;
import com.userPrompt.SimpleCalculator.OperationOptions;

public class UserInput {
	public Double input = 0.0;
	public Operations operation;
	public Scanner in = new Scanner(System.in);
	public static OperationOptions totalOptions = new OperationOptions();
	
	public Double getInput(String message) {
		System.out.println(message);
		Double userInput=0.0;

		userInput = in.nextDouble();
		
		return userInput;
	}
	
	public void getOperationChoice() {
		String message = "Please select an operation: ";
		this.input = this.getInput(message);
	}
	
	public void getTwoNumbers() {

		String message ="Please enter the first number: ";
		this.operation.firstNumber = this.getInput(message);
		
		message ="Please enter the second number: ";
		this.operation.secondNumber = this.getInput(message);
	}
	
	public void setOperation() {
		int v = (int) Math.round(this.input);
		String value = String.valueOf(v);
		switch(value) {
		case "1":
			this.operation = new com.calculatorOperations.SimpleCalculator.Add();
			break;
		case "2":
			this.operation = new com.calculatorOperations.SimpleCalculator.Subtract();
			break;
		case "3":
			this.operation = new com.calculatorOperations.SimpleCalculator.Multiply();
			break;
		case "4":
			this.operation = new com.calculatorOperations.SimpleCalculator.Divide();
			break;
		case "5":
			this.operation = new com.calculatorOperations.SimpleCalculator.Modulus();
			break;
		}
	}
	
	public boolean ifContinue() {
		Double yesOrNo;
		String message = "Do you wish to continure? 1 for yes/ 0 for no";
		yesOrNo = this.getInput(message);
		if(yesOrNo == 1)
			return true;
		else
			return false;
	}
	
	public boolean exit() {
		Set<Double> choices = getAllOptionsInNumbers();
		if(choices.contains(this.input))
			return false;
		else
			return true;
	}
	
	public static Set<Double> getAllOptionsInNumbers() {
		Set<Double> choices = new HashSet<Double>();
		for(int i = 0; i < totalOptions.availableOptions.length; i++) {
			choices.add(Double.valueOf(i));
		}
		return choices;
	}
}
