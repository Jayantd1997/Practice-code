
public class ArrayMain {
	public static void main(String[] args) {
		/**
		 * Use multi-dimentional array
		 * 
		 * 5 8 9 5 8 7 6 3 7 7 6 6
		 */
		int a[][][][] = { { { { 5, 8, 9, 5 }, { 8, 7, 6, 3 }, { 7, 7, 6, 6 } } } };
		for (int[][][] v : a) {
			for (int[][] i : v) { // {{5,8,9,5},{8,7,6,3},{7,7,6,6}}
				for (int[] j : i) { // {5,8,9,5},{8,7,6,3},{7,7,6,6}
					for (int k : j) { // 5,8,9,5
						System.out.print(k + " ");
					}
					System.out.println();
				}

			}
		}
	}
}
