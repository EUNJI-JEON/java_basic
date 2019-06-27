package algorithm;

public class Fibonacci {
	public static void main(String[] args) {
		
		//1
		int arr[] = new int[100];
		arr[1]=1;
		arr[2]=1;
		
		for(int i=3;i<100;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			
		}
		
		for(int i=1;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		//2
		
		int prevPrevNum = 1;
		int prevNum=1;
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		
		for(int i=3;i<10;i++) {
			int curNum = prevPrevNum+prevNum;
			System.out.print(curNum+" ");
			prevPrevNum = prevNum;
			prevNum = curNum;
		}
	}
}
