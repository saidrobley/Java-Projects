import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = new int[] {2, -3, 4, 1, 6, 5};
		int[] arr2 = insertionSort(arr);
		System.out.println(Arrays.toString(arr2));
	
	}
	
	public static int[] insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j - 1]){
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return arr;
	}
	
}
