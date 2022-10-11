package sort;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 2, 5, 3 };
		boolean swapped = true;
		int temp = 0;

		for (int pass = 1; pass < arr.length -1 && swapped; pass++) {
			swapped = false;
			System.out.println("Pass " +pass);
			for (int i = 0; i < arr.length - 1; i++) { 
				if (arr[i] > arr[i + 1]) {
					System.out.println("Swapped "+arr[i + 1] + " and " +arr[i]);
					swapped = true;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		
		System.out.println("Result "+Arrays.toString(arr));
		

	}
}
