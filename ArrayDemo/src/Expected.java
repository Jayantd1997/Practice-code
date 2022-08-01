
public class Expected {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 5, 12, 11 }, { 4, 5, 6, 5, 14, 34 } };
		/**
		 * 1[0,0] 2[0,1] 3[0,2]
		 * 4[1,0] 5[1,1] 6[1,2]
		 */
		
//		int firstAdd = a[0][2] + a[1][2];
		int sum[] = new int[a[0].length];
	
		int index = 0;
		for(int i=0;i<a.length;i+=2) {
			for(int j=0;j<a[0].length;j++) {
				sum[index] = a[i][j] + a[i+1][j];
				index++;
			}
		}
		
		for(int num: sum) {
			System.out.print(num + " ");
		}
			

	}

}
