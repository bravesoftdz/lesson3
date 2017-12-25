package lesson3;

public class task2 {

	public static void main(String[] args) {

		double[] a = new double[10];
		double[] b = new double[10];
		int i = 0, j = -1;
		double sum = 0;

		for (i = 0; i < a.length; i++) {
			a[i] = Math.random() * 200 - 100;
		}

		for (i = 0; i < a.length; i = i + 2) {
			if (a[i] > 0) {
				j++;
				b[j] = a[i];
			}
		}

		for (i = 0; i < a.length; i++) {
			System.out.print(String.format("%.2f", a[i]) + " | ");
		}
		System.out.println();
		for (i = 0; i < b.length; i++) {
			System.out.print(String.format("%.2f", b[i]) + " | ");
		}

		for (i = 0; i < b.length; i++) {
			sum = sum + b[i] * b[i];
		}

		System.out.println();
		System.out.println(String.format("%.2f", sum));
	}

}
