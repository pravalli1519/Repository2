package day2assessment;

import java.util.*;

class Tasks {
	void unionIntersect(int a[], int b[], int n1, int n2) {
		ArrayList<Integer> arr_union = new ArrayList<Integer>();
		ArrayList<Integer> arr_intersect = new ArrayList<Integer>();

		for (int i = 0; i < n1; i++) {
			if (arr_union.contains(a[i])) {
				if (arr_intersect.contains(a[i])) {
					continue;
				} else
					arr_intersect.add(a[i]);
			} else
				arr_union.add(a[i]);
		}
		for (int i = 0; i < n2; i++) {
			if (arr_union.contains(b[i])) {
				if (arr_intersect.contains(b[i])) {
					continue;
				} else
					arr_intersect.add(b[i]);
			} else
				arr_union.add(b[i]);
		}
		System.out.println("The union of both the arrays is");
		for (int i = 0; i < arr_union.size(); i++) {
			System.out.print(arr_union.get(i) + " ");
		}
		System.out.println();
		System.out.println("The intersection of both the arrays is");
		for (int i = 0; i < arr_intersect.size(); i++) {
			System.out.print(arr_intersect.get(i) + " ");
		}
	}

}

public class Task1UnionIntersection {
	public static void main(String[] args) {
		int len1, len2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of two arrays");
		len1 = sc.nextInt();
		len2 = sc.nextInt();
		int arr1[] = new int[len1];
		int arr2[] = new int[len2];
		System.out.println("Enter first array elements");
		for (int i = 0; i < len1; i++) {
			int num = sc.nextInt();
			arr1[i] = num;
		}
		System.out.println("Enter second array elements");
		for (int i = 0; i < len2; i++) {
			int num = sc.nextInt();
			arr2[i] = num;
		}
		Tasks obj = new Tasks();
		obj.unionIntersect(arr1, arr2, len1, len2);

	}

}