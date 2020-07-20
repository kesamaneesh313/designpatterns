package com.epam.design_principles;

import java.util.Scanner;

public class App {

	public static void main(String args[]) {	
		
		Scanner scanner = new Scanner(System.in);	
		
		Data data = new Data();
		Service service = new Service(data);
		
		System.out.print("Enter two numbers");
		double x=scanner.nextDouble();
		data.setfirstNumber(x);
		
		double y=scanner.nextDouble();
		data.setSecondNumber(y);
		
		System.out.println("Enter the operation(+,-,/,*)");
		char operation=scanner.next().charAt(0);
			System.out.println("Your outputs is: " + service.result(operation));
			scanner.close();
	}

}
