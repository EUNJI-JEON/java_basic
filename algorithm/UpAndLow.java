package algorithm;

import java.util.Scanner;

public class UpAndLow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a sentence");
		String arr = scan.nextLine();
		
		String a;
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)>='a'&& arr.charAt(i)<='z') {
				a=Character.toString(arr.charAt(i));
				a=a.toUpperCase();
				System.out.print(a);
			} else {
				a=Character.toString(arr.charAt(i));
				a=a.toLowerCase();
				System.out.print(a);
			}
		}
		
	}
}
