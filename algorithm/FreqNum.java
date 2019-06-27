package algorithm;

import java.util.Scanner;

public class FreqNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int[]inputNum = new int[10];
		for(int i=0;i<10;i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int []numCount = new int[10];
		
		
		for(int i=0; i<10; i++) {
			numCount[inputNum[i]]++;
		}
		
		int countNum = 0;
		int numOfCountNum = 0;
		
		for(int i=0; i<10;i++) {
			if(numOfCountNum < numCount[i]) {
				numOfCountNum = numCount[i];
				countNum = i;
			}
		}
		
		System.out.println("The most frequent number is:"+countNum+" count:"+numOfCountNum);
	}
}
