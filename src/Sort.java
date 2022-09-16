

import java.beans.Transient;
// sort numbers and strings
import java.util.Scanner;

import org.junit.Test;

public class Sort {

	public static int[] numsort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;
				if (arr[j] < arr[i]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static char[] stringsort(String str) {
		char strarr[] = str.toCharArray();
		char temp;

		for (int i = 0; i < strarr.length; i++) {
			for (int j = i + 1; j < strarr.length; j++) {

				if (strarr[j] < strarr[i]) {

					temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;
				}
			}
		}
		return strarr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		char[] strarr = new char[10];
		String str;
		int input = 0;

		System.out.println("choose an option" + "\n" + "1. Sort Numbers" + "\n" + "2. Sort a String");

		input = sc.nextInt();
		switch (input) {
			case 1: {

				// taking input

				System.out.println("please enter 10 numbers for the array");

				for (int i = 0; i < 10; i++) {
					arr[i] = sc.nextInt();
				}

				System.out.println("Sorted Array: ");

				// sort numbers array

				arr = numsort(arr);

				// printing the sorted array

				System.out.print("{");

				for (int i = 0; i < arr.length; i++) {

					System.out.print(arr[i]);

					if (i != arr.length - 1) {
						System.out.print(",");
					}
				}

				System.out.print("}");

				break;
			}

			case 2: {

				// taking input

				System.out.println("please enter a String (not more than 10 characters)");

				str = sc.next();

				System.out.println("Sorted String: ");

				// string sort

				strarr = stringsort(str);

				// printing the sorted array

				System.out.print("{");

				for (int i = 0; i < strarr.length; i++) {

					System.out.print(strarr[i]);

					if (i != strarr.length - 1) {
						System.out.print(",");
					}

				}

				System.out.print("}");

				break;
			}
		}

	}

	@Test
	public void testnumsort() {
		assertEquals(new int[] { 0, 1, 2 }, numsort(new int[] { 2, 1, 0 }));
	}

}