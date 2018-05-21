import java.util.*;

public class OccurrenceOfNumbers {
	
	public static void main(String[] args) {
		int[] arr = new int[] {2, 5, 6, 5, 4, 3, 23, 43, 2};
		System.out.println(Arrays.toString(arr));
		printOccurrence(getNumberOfOccurrence(arr));
	}
	
	public static Map<Integer, Integer> getNumberOfOccurrence(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], 1);
			} else {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			}
		}
		return hashMap;
	}
	
	public static void printOccurrence(Map<Integer, Integer> map) {
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Integer, Integer> entry: entrySet) {
			System.out.print(entry.getKey() + " occurs " + entry.getValue());
			if(entry.getValue().equals(1)) {
				System.out.println(" time");
			}else {
				System.out.println(" times");
			}
		}
		
	}
	
	
}
