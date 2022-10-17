

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int arr[] = {5,3,2,4,1};	
		int left = 0;
		int right = arr.length-1;
		sort(arr,left, right);
		System.out.println(Arrays.toString(arr));
		}
	
	public static void sort(int arr[],int left, int right) {

		int mid = 0;
		System.out.println("check left " +left+ "< right " +right);
		
		if(left<right) {
			
		mid = left + (right - left)/2;
		System.out.println("Mid " +mid);
		
		System.out.println("call left sort "+left+ "to" +mid);
		sort(arr,left,mid);

		System.out.println("call right sort "+right+ "to" +mid+1);
		sort(arr,mid+1,right);
		
		System.out.println("Merge "+left+ "to" +right);
		merge(arr,left,right,mid);
		}
	}
	public static void merge(int arr[], int left, int right, int mid) {
		int lsize = mid - left + 1;
		int rsize = right - mid;
		
		int ltemp[] = new int[lsize];
		int rtemp[] = new int[rsize];
		
		for (int i = 0; i < lsize; i++) {
			ltemp[i] = arr[left+i];
		}
		for (int j = 0; j < rsize; j++) {
			rtemp[j] = arr[mid+1+j];
		}
		
		int m = left;
		int i = 0, j= 0;
		
		while(i< lsize && j <rsize) {
			if(ltemp[i] <= rtemp[j]) {
				arr[m] = ltemp[i];
				i++;
			}
			else {
				arr[m] = rtemp[j];
				j++;
			}
			m++;
		}
		
		while(i < lsize) {
			arr[m] = ltemp[i];
			i++;
			m++;
	
		}
		
		while(j < rsize) {
			arr[m] = rtemp[j];
			j++;
			m++;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
