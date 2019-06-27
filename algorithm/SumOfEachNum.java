package algorithm;

public class SumOfEachNum {
	public static void main(String[] args) {
		int num=1234;
		int curNum = 0;
		

		while(num>0) {
			
			
			curNum+= num%10;
			num/=10;
		}
		
		System.out.println(curNum);
	}
}
