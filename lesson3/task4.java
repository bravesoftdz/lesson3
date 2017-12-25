package lesson3;

import java.util.Arrays;

public class task4 {

	public static void main(String[] args) {
		// Create array x2
		int[][] arr = new int[3][3];

		arr[0][0] = 1;
		arr[0][1] = 55;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 12;
		arr[1][2] = 6;

		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;

		// Out array on display
		System.out.println(Arrays.deepToString(arr));

		// Create "max"
		int max = arr[0][0];

		// Search max element
		// Search max element in array[x][]
		for (int i = 0; i < arr.length; i++) {
			// Search max element in array[][j]
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		// Get max element
		System.out.println("Even element: " + max);

	}

}
