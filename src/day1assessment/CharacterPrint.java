package day1assessment;

import java.util.*;

public class CharacterPrint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Char : ");
		String str = sc.next();
		char ch = str.charAt(0);
		// if user enters a Capital Alphabet
		if ((int) ch >= 65 && (int) ch < 91) {
			System.out.print("Foward character pattern : ");
			for (char i = ch; i <= 'Z'; i++) {
				System.out.print(i);
			}
			System.out.println();
			System.out.print("Backward character pattern : ");
			for (char i = ch; i >= 'A'; i--) {
				System.out.print(i);
			}
			// if user enters a Small Alphabet
		} else if ((int) ch >= 97 && (int) ch < 123) {
			System.out.print("Foward character pattern : ");
			for (char i = ch; i <= 'z'; i++) {
				System.out.print(i);
			}
			System.out.println();
			System.out.print("Backward character pattern : ");
			for (char i = ch; i >= 'a'; i--) {
				System.out.print(i);
			}
		} // if not a character
		else
			System.out.println("Enter characters only...");

	}

}
