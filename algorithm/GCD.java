package algorithm;

public class GCD {
	//The greatest common denominator
	public static void main(String[] args) {
		int num1,num2;
		num1=12;
		num2=18;
		
		int small;
		int big;
		
		if(num1>num2) {
			big=num1;
			small=num2;
		} else {
			big=num2;
			small=num1;
		}
		
		int gcd=1;
		for(int i=1;i<=small/2;i++) {
			if(small%i==0 && big%i==0) {
				gcd=i;
			}
		}
		
		System.out.print(gcd);
		
	}

	
	
}
