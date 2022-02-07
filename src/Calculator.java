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
		System.out.println(num1 + num2);
	}
}
