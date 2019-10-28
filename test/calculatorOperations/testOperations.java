package calculatorOperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calculatorOperations.SimpleCalculator.*;

class testOperations {
	
	void setFirstAndSecondNumber(Operations op, double n1, double n2) {
		op.firstNumber = n1;
		op.secondNumber = n2;
	}
	
	@Test
	void testAdd() {
		Operations testAdd = new Add();
		setFirstAndSecondNumber(testAdd, 20.0, 50.0);
		assertEquals(70.0, testAdd.numberOperations());
	}

	@Test
	void testSubtract() {
		Operations testAdd = new Subtract();
		setFirstAndSecondNumber(testAdd, 54.0, 50.0);
		assertEquals(4.0, testAdd.numberOperations());
	}
	
	@Test
	void testMultiply() {
		Operations testAdd = new Multiply();
		setFirstAndSecondNumber(testAdd, 2.0, 8.0);
		assertEquals(16.0, testAdd.numberOperations());
	}
	
	@Test
	void testDivide() {
		Operations testAdd = new Divide();
		setFirstAndSecondNumber(testAdd, 20.0, 4.0);
		assertEquals(5.0, testAdd.numberOperations());
	}
	
	@Test
	void testModulus() {
		Operations testAdd = new Modulus();
		setFirstAndSecondNumber(testAdd, 20.0, 50.0);
		assertEquals(20.0, testAdd.numberOperations());
	}
	
	@Test
	void testDivideWithZero() {
		Operations testAdd = new Divide();
		setFirstAndSecondNumber(testAdd, 20.0, 0);
		assertEquals(Double.POSITIVE_INFINITY, testAdd.numberOperations());
	}
	
	@Test
	void testModulusWithZero() {
		Operations testAdd = new Modulus();
		setFirstAndSecondNumber(testAdd, 40.0, 0);
		assertEquals(40.0, testAdd.numberOperations());
	}
}
