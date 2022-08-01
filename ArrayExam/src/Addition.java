
public class Addition {

	public static void main(String[] args) {
		int a[] = { 4, 5, 3, 2, 1, };
		int sum = 0;
		for(int i=0; i<a.length;i++) {
			sum += a[i];
		}
		System.out.println("sum of all elements:"+ " "+ sum);
	}

}
