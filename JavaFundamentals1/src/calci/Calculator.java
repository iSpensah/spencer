package calci;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNotAllowedException extends Exception {  //can extend Exception or RuntimeException bec
	//Runtime Exception checks at runtime/// Exception checks from compile time
	String getMsg() {
		return "Hello ... no negatie numbers allowed";
	}
}
class NotInRangeException extends Exception {
	
}
public class Calculator {
 	//Our Functions
	int answer;
	
	 int add(int first,int second) {
		answer = first + second;
		return answer;
	}	
	int subtract(int first,int second) {
		answer = first - second;
		return answer;
	}
	
	public void calci(int first, int second, String operator) throws NegativeNotAllowedException // function calci throws user defined exceptipn class 
	{	
		if(first < 0 || second < 0) {
			throw new NegativeNotAllowedException();
		}
		
		switch(operator) {
		case "+":
			answer = first + second;
			break;
		case "-":
			answer = first - second;
			break;
		case "*":
			answer = first * second;
			break;
		case "/":
			answer = first/second;
			break;
		case "%":
			answer = first % second;
			break;
		}
	}
	public static void main (String[]  args) { //read by JVM
		Scanner in = new Scanner(System.in);
		Calculator c = new Calculator();
		//try catch should in main level
		//exception handling is for creating friendly user errors
		//we can create multiple catch blocks
		// good practice to write all three < try catch finally
		try {
			int first = in.nextInt();
			int second = in.nextInt();
			String operator = in.next();
			
			/* if(10>5) {
				return;
			} */
			c.calci(first, second, operator);
			System.out.println(c.answer);
		}
		catch (ArithmeticException e) { //to handle the errors
			System.out.print(" Divide by Zeron not possible"+e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.print("Only Numbers allowed in first two scans");
		}
		catch (NegativeNotAllowedException e)
		{
			System.out.println("Numbers should not be negative");
			System.out.println(e.getMsg());
		}
		catch (Exception e) { //super exception, the Most high exception class//handles all kinds of error
			System.out.println("Some error.....contact admin");
		}
		finally {
			System.out.println("Thank you");
		} 
	}
}