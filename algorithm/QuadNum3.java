package algorithm;

public class QuadNum3 {
	public static void main(String[] args) {
		int n = 4;
		int arr[][]= new int[4][4];
		
		/*
		 * 1 5 9  13
		 * 2 6 10 14
		 * 3 7 11 15
		 * 4 8 12 16
		 * 
		 * */
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[j][i]=num;
				
			
				num++;
				
			}
			
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d", arr[i][j]);
			} System.out.println();
		}
			
		}
}
