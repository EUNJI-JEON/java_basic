package algorithm;

public class PrimeNum {
	public static void main(String[] args) {
		
		int num=13;
		
		boolean isPrimeNumber = true;
		
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				
				isPrimeNumber = false;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println(num+"is a prime number");
		} else {
			System.out.println(num+"is not a prime number");
		}
	}
}
