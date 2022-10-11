package sort;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		int arr[] = {1,2,4,3,5};
		int temp = 0;
		int j =0;
		//start index 1
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i-1;
			System.out.println("Pass.. i="+i+" j="+j+" temp="+temp);
			//compare back till 0
			while(j >= 0) {
				System.out.println("Compare value " +arr[j]+" and " +temp);
				if(temp < arr[j]) {
					System.out.println("Put "+arr[j]+" at "+temp);
					arr[j+1] = arr[j];
					System.out.println("keep comparing with "+temp+ " till 0th index");		
					System.out.println(Arrays.toString(arr));
					
				}
				else {
					System.out.println("No swap");
					break;
				}
				j--;
			}
			arr[j+1] = temp;
			System.out.println("After pass "+Arrays.toString(arr));
			
		}
		}
}
