package Recursion;

public class ArrayIncreasinOrder {

	public static void main(String[] args) {

		int[] arr = {1,3,5,7,8,9,6};
		int index = 0;
		System.out.println(isSorted(arr , index));
	}

	private static boolean isSorted(int[] arr, int i) {
		if(i==arr.length-1) {
			return true;
		}

		if(arr[i] >= arr[i+1]) {
			return false;
		}
		return isSorted(arr, i+1);
	}

}
