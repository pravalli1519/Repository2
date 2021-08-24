package day1assessment;

import java.util.*;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		int k = 65;
		for (int i = 1; i <= rows; i++) {
			// for space printing
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}
			// for character printing
			for (int j = 1; j <= i; j++) {
				System.out.print((char) k + " ");
				k++;
			}
			k = 65;
			System.out.println();

		}
	}
}
