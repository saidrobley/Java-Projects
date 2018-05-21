import java.util.ArrayList;

public class EfficientPrime {
	private static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		list.add(2);
		int max = 120;
		int count = 1;
		for(int i = 3; list.size() < max; i++) {
			isPrime(list, i);
			count++;
		}
		
		System.out.println(list);
	
	}
	
	public static boolean isPrime(ArrayList<Integer> list, int num) {
		
		for(int i = 0; i < list.size() && list.indexOf(i) < Math.sqrt(num); i++) {
			int divisor = list.get(i);
			if(num % divisor == 0) {
				return false;
			}
		}
		list.add(num);
		return true;
		
	}
	
	
}
