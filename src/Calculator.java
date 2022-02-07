import java.util.Scanner;

public class Calculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter two integer whole numbers.");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("Would you like to add, subtract, multiply or divide the two numbers?");
		Scanner scanner2 = new Scanner(System.in);
		String res = scanner2.nextLine();
		if(res.toLowerCase().equals("add")) {
			System.out.println(num1 + num2);
		}
		else if (res.toLowerCase().equals("subtract")) {
			System.out.println(num1 - num2);
		}
		else if(res.toLowerCase().equals("multiply")) {
			System.out.println(num1 * num2);
		}
		else if(res.toLowerCase().equals("divide")) {
			System.out.println(num1 / num2);
		}
	}
}
