import java.util.ArrayList;
import java.util.List;

public class PrimeTwins {
	
	public static void main(String[] args) {
		printTwins();
	}
	
	public static void printTwins() {
		int numPrimes = 1200;
		System.out.println("Twin primes differ by 2");
		System.out.println("========================");
		List<Integer> primes = new ArrayList<>();
		int count = 1;
		for(int i = 2; count < numPrimes; i++) {
			if(getPrimes(i)) {
				primes.add(i);
				count++;
				
			}
		}
		
		for(int j = 1; j < primes.size(); j++) {
			if(primes.get(j)-primes.get(j-1) == 2) {
				System.out.println("(" + primes.get(j-1) + ", " + primes.get(j) + ")");
			}
		}
	}
	
	public static boolean getPrimes(int num) {
		if(num == 2) return true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	
}
