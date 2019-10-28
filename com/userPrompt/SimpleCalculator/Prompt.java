package com.userPrompt.SimpleCalculator;

public class Prompt {
	private OperationOptions options = new OperationOptions();
	public Double result;
	
	public Prompt() {
		displayGreetingsMessage();
		displayOptions();
	}
	
	public void displayGreetingsMessage() {
		System.out.println("Welcome to Simple Calculator");
	}
	
	public void displayOptions() {
		int optionsLength = options.availableOptions.length;
		System.out.println("Available Options are:");
		for(int i = 0; i < optionsLength; i++) {
			System.out.println(i+1 + ":" + options.availableOptions[i]);
		}
	}
	
	public void displayResult() {
		if(result != Double.POSITIVE_INFINITY)
			System.out.println("Your result is: " + this.result);
		else
			System.out.println("Cannot divide 0");
	}
}
