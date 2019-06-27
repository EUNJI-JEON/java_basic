package algorithm;

public class DecToBin {
	public static void main(String[] args) {
		int inputNum = 19;
		int bin[]= new int[100];
		
		int i=0;
		int share= inputNum;
		while(share>0) {
			bin[i] = share%2;
			share /=2;
			i++;
		}
		
		i--;
		for(;i>=0;i--) {
			System.out.print(bin[i]);
		}
	}
}
