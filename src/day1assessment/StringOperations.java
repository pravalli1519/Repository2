package day1assessment;

import java.util.*;

public class StringOperations {

	public static void main(String[] args) {
		// Menu
		System.out.println("----Menu----\n1.Reverse\n2.Length");
		// Userinput option
		System.out.print("Please enter the option : ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		// if user enters option1 then perform reverse of string
		if (option == 1) {
			System.out.print("Please enter the string to be reverse : ");
			String str = sc.next();
			// System.out.println(str);
			int j, len;
			String rev_str = "";
			len = str.length();
			for (j = len - 1; j >= 0; j--) {
				rev_str = rev_str + str.charAt(j);
			}
			System.out.println("reverse of a string is " + rev_str);
		}
		// if user enters option1 then find length of string
		if (option == 2) {
			System.out.print("Please enter the string to get length of string : ");
			String str = sc.next();
			// int len = str.length(); we can findlength by length method
			System.out.println("length of a string is " + str.lastIndexOf(""));
		}
	}

}
