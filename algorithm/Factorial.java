package algorithm;

public class Factorial {
	public static void main(String[] args) {
		
		int Num=5;
		int countNum=1;
		
		for(int i=1;i<=Num;i++) {
			countNum*=i;
		}
		System.out.println(countNum);
		
		
		countNum=1;
		for(int i=Num;i>=1;i--) {
			countNum*=i;
		}
		System.out.println(countNum);
	}
}
