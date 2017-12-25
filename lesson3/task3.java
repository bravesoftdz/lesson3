package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner enteredWord = new Scanner(System.in);

		// Create array x2
		int[][] arr = new int[4][3];

		int temp[];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;

		arr[3][0] = 10;
		arr[3][1] = 11;
		arr[3][2] = 12;

		System.out.println("You have array");
		System.out.println(Arrays.deepToString(arr));
		System.out.println("What line do you want to replace?:");
		int first = enteredWord.nextInt();

		System.out.println("Which line do you want to replace?:");
		int second = enteredWord.nextInt();

		temp = Arrays.copyOf(arr[first], arr[first].length);
		arr[0] = Arrays.copyOf(arr[second], arr[second].length);
		arr[1] = Arrays.copyOf(temp, temp.length);
		System.out.println("You got array");
		System.out.println(Arrays.deepToString(arr));

	}

}
