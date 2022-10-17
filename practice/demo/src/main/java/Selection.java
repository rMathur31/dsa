

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		int arr[] = {2,4,1,3,5};

		int min, temp =0;
		boolean swapped = true;
		
		for (int i = 0; i < arr.length && swapped; i++) {
			min = i;
			swapped = false;
			System.out.println("Say Mininmum value is at index " +min);
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min=j;
					swapped = true;
				}
				
			}
			System.out.println("Swap " +arr[min]+ "and" +arr[i]);
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			System.out.println("After Pass " +Arrays.toString(arr));
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
