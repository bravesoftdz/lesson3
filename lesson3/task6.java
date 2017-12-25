package lesson3;

import java.util.Arrays;

public class task6 {

	public static void main(String[] args) {

		// Create size array
		int _i = 3;
		int _j = 3;

		// Create new array
		int[][] arr = new int[_i][_j];

		// Create variable
		int counter = 0;
		int aElement = 0;
		int bElement = 0;
		int sElement = 0;

		// Fill array
		for (int i = 0; i < _j; i++) {
			for (int j = 0; j < _i; j++) {
				arr[i][j] = (int) (Math.random() * 200);
			}
		}

		// Out array on display
		System.out.println("Array:");
		System.out.println(Arrays.deepToString(arr));
		System.out.println();

		for (int i = 0; i < _j; i++) {
			for (int j = 0; j < _i; j++) {
				if (arr[i][j] > 9 && arr[i][j] < 100) {
					aElement = (arr[i][j] / 10) - (arr[i][j] % 10) / 10;
					bElement = arr[i][j] % 10;
					sElement = aElement + bElement;
					if (sElement % 2 == 0) {
						counter++;
						System.out.println("Desired values: " + arr[i][j]);
					}
				}
			}
		}

		System.out.println();
		System.out.print("Answer: " + counter);
	}

}
