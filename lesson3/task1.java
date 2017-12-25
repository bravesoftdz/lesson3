package lesson3;

public class task1 {

	public static void main(String[] args) {
		// Create array
		int x[] = { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };

		// Find max element
		double max = x[0];
		for (int i = 0; i != x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}

		// Out max element
		System.out.println("Even element: " + max);

		// Create mew array after div
		double afterDiv[] = new double[x.length];

		for (int i = 0; i < x.length; i++) {

			afterDiv[i] = x[i] / max;

			System.out.println(Math.ceil(afterDiv[i] * 100) / 100);
		}

	}

}
