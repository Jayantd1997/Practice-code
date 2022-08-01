
public class Output {

	public static void main(String[] args) {
		int a[] = { 3, 2, 1, 5, 9 };
		int sum[] = new int[3];
		int index = 0;
		int mid = a.length/2;
		for (int i = 0, j = a.length - 1; i < mid && j > mid; i++, j--) {
			sum[index] = a[i] + a[j];
			index++;
		}
		sum[index] = a[mid];
		for (int num : sum) {
			System.out.print(num + " ");
		}
	}

}
