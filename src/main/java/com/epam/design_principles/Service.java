package com.epam.design_principles;


public class Service {
	Data data;
	public Service(Data data) {
		this.data = data;
	}
	public double result (char operations)
	{
		double firstNumber=data.getfirstNumber();
		double secondNumber=data.getSecondNumber();
		switch(operations)
			{
				case '+':
					return (double)firstNumber + secondNumber;  
				case '-':
					return (double)firstNumber - secondNumber;
				case '*':
					return (double)firstNumber * secondNumber;
				case '/':
					try {
						return (double)firstNumber / secondNumber;
					} catch(ArithmeticException exception) {
						exception.printStackTrace();
					}
				default:
					throw new IllegalStateException();
			}	 	
	}
}
