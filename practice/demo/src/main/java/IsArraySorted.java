

public class IsArraySorted {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		if(isSorted(arr, arr.length)) 
			System.out.println("Sorted");
		else
			System.out.println("Unsorted");
	}
	public static boolean isSorted(int[] a, int index) {
		if(a.length<=1 || index == 1) {
			return true;
		}
		
		return a[index-1] < a[index-2] ? false : isSorted(a, index-1);
	}
}
