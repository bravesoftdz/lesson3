package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// Create array x2
		int[][] arr = new int[3][3];

		arr[0][0] = 1;
		arr[0][1] = 55;
		arr[0][2] = 12;

		arr[1][0] = 4;
		arr[1][1] = 12;
		arr[1][2] = 6;

		arr[2][0] = 7;
		arr[2][1] = 55;
		arr[2][2] = 1;

		// Out array on display
		System.out.println(Arrays.deepToString(arr));

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("What will be search?:");
		int wSearch = sc.nextInt();

		int colValue = 0;
		for (int i = 0; i < arr.length; i++) {
			// Search max element in array[][j]
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == wSearch) {
					colValue = colValue + 1;
				}
			}
		}
		System.out.println(colValue);

	}

}
