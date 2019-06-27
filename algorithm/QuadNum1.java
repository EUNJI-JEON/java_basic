package algorithm;

public class QuadNum1 {
	public static void main(String[] args) {
		int n = 4;
		int arr[][]=new int[4][4];
		
		/*
		 *1 2 3 4
		 *5 6 7 8
		 *9 10 11 12
		 *13 14 15 16
		 * */
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=num;
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
