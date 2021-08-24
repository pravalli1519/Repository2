package day3assessment;
import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args){
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String key=sc.nextLine();
			int val=sc.nextInt();
			hash.put(key,val);
		}
		int q=sc.nextInt();
		for(int j=0;j<q;j++){
			String s=sc.nextLine();
			if(hash.containsKey(s)){
				System.out.println(s+"="+hash.get(s));
			}
			else{
				System.out.println("Not found");
			}
		}
	}
}
