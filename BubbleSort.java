import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = new int[]{5, 8, 1, 6, 9, 2, -1};
		int[] arr2 = sort(arr);
		System.out.println((Arrays.toString(arr2)));
	}
	
	public static int[] sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1 - i; j++) {
				if(arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
}
