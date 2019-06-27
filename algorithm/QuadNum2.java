package algorithm;

public class QuadNum2 {
	public static void main(String[] args) {
		int n=4;
		int arr[][] = new int[4][4];
		
		int num=1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					arr[i][j]=num;
					num++;
				}
			}else {
				for(int j=n-1;j>=0;j--) {
					arr[i][j]=num;
					num++;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
