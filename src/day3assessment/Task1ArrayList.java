package day3assessment;

import java.util.*;

public class Task1ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<List> al = new ArrayList<List>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int j = 0; j < l; j++) {
                int el = sc.nextInt();
                a.add(el);
            }
            al.add(a);
        }
        //System.out.println(al);
        int m= sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try
            {
                System.out.println(al.get(x-1).get(y-1));
            }
            catch(Exception e)
            {
               
                System.out.println("ERROR!");
            }
        }
       

	}

}
