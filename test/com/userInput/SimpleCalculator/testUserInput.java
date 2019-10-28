package com.userInput.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;
import com.calculatorOperations.SimpleCalculator.*;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.mockito.Mockito.*;

class testUserInput {
	
	UserInput userinput = new UserInput();
	
	@Before
	void userInputDeclaration() {
		UserInput userinput = new UserInput();
	}
	/*@Test
	void testUserInput() {
		UserInput userinput = mock(UserInput.class);
		
	}*/
	
	@Test
	void testGetOperationChoice() {
		userinput.getOperationChoice();
		assertEquals(double.class, userinput.input.TYPE);
	}
	
	@Test
	void testGetTwoNumbers() {
		userinput.input = 1.0;
		userinput.setOperation();
		userinput.getTwoNumbers();
		assertEquals(1.0, userinput.operation.firstNumber);
		assertEquals(1.0, userinput.operation.secondNumber);
	}
	
	@Test
	void testSetOperationsAdd() {
		userinput.input = 1.0;
		userinput.setOperation();
		assertEquals(Add.class, userinput.operation.getClass());
	}
	
	@Test
	void testSetOperationsSubtract() {
		userinput.input = 2.0;
		userinput.setOperation();
		assertEquals(Subtract.class, userinput.operation.getClass());
	}
	
	@Test
	void testSetOperationsMultiply() {
		userinput.input = 3.0;
		userinput.setOperation();
		assertEquals(Multiply.class, userinput.operation.getClass());
	}
	
	@Test
	void testSetOperationsDivide() {
		userinput.input = 4.0;
		userinput.setOperation();
		assertEquals(Divide.class, userinput.operation.getClass());
	}
	
	@Test
	void testSetOperationsModulus() {
		userinput.input = 5.0;
		userinput.setOperation();
		assertEquals(Modulus.class, userinput.operation.getClass());
	}
	
	@Test
	void testExitTrue() {
		userinput.input = 10.0;
		assertTrue(userinput.exit());
	}
	
	@Test
	void testExitFalse() {
		userinput.input = 2.0;
		assertFalse(userinput.exit());
	}
	
	@Test
	void testIfContinueFalse() {
		assertFalse(userinput.ifContinue());
	}
}
