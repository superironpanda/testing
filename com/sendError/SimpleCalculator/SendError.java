package com.sendError.SimpleCalculator;

public class SendError {
	public Exception ex;
	
	public void wrongTypeOfInput(Exception ex) {
		
		System.out.println("----NOT A VALID Number----");
	}
}
