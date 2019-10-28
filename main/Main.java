package main;

import com.calculatorOperations.SimpleCalculator.*;
import com.userPrompt.SimpleCalculator.Prompt;
import com.userInput.SimpleCalculator.*;
import com.sendError.SimpleCalculator.*;

public class Main {
	public static void main(String[] args) {
		boolean noExit = true;
		while(noExit) {
			Prompt prompt = new Prompt();
			UserInput userinput = new UserInput();
			try {
				userinput.getOperationChoice();
				userinput.setOperation();

				if(!userinput.exit()) {
					userinput.getTwoNumbers();
					prompt.result = userinput.operation.numberOperations();
					prompt.displayResult();
					if(userinput.ifContinue())
						noExit = true;
					else
						noExit = false;
				}	
			} catch (Exception e) {
				SendError error = new SendError();
				error.wrongTypeOfInput(e);
			}
			
		}
	}
	
}
