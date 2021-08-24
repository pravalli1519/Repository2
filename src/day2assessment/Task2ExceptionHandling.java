package day2assessment;

import java.util.*;

public class Task2ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int div = x / y;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			// System.out.println(e); to get whole error
			System.out.println(e.getClass().toString().replaceFirst("class ", ""));
		}

	}
}
