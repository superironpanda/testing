package com.userPrompt.SimpleCalculator;

public class OperationOptions {
	public String[] availableOptions= {"Add", "Subtract", "Multiply", "Divide", "Modulus", "Quit"};
	
	public OperationOptions() {
		availableOptions[0] = "Add";
		availableOptions[1] = "Subtract";
		availableOptions[2] = "Multiply";
		availableOptions[3] = "Divide";
		availableOptions[4] = "Modulus";
	}
}
