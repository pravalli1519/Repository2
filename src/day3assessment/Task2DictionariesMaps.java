package day3assessment;

import java.util.*;

public class Task2DictionariesMaps {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map m = new HashMap();
		ArrayList a = new ArrayList();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			m.put(name, phone);
		}
		for (int i = 0; i < n; i++) {
			String nam = in.next();
			if (m.get(nam) == null) {
			System.out.println("Not found");
			}

			else {
				System.out.println(nam + "=" + m.get(nam));
			}
		}
	}
}
