package javapractice;
import java.util.*;

public class Calculator {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int choice;
	
	do {
	System.out.print("Enter first number:");
	double a = sc.nextDouble();
	
	System.out.print("Enter Second number:");
	double b = sc.nextDouble();
	
	System.out.println("Addition:(+)" );
	System.out.println("Subtraction:(-)");
	System.out.println("Multiplication:(*)");
	System.out.println("Division:(/)");
	System.out.println("Exit:");
	
	
	System.out.print("Enter your choice:");
	 choice = sc.nextInt();

	switch(choice) {
	
	case 1:
		System.out.println("Addition:" +(a+b));
		break;
		
	case 2:
		System.out.println("Substraction:" +(a-b));
		break;
		
	case 3:
		System.out.println("Multiplication:" +(a*b));
		break;
		
	case 4:
		System.out.println("Division:" +(a/b));
		break;
		
	case 5:
		System.out.println("Exit in the program:");
		break;
		
	default:
		System.out.println("Invalid Operator");
		
	}		
		
	}while(choice != 5);
	
	sc.close();
}
}
		
	
	
			



