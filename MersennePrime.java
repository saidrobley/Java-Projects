public class MersennePrime {
	
	public static void main(String[] args) {
		printMarsennePrime();
	}
	
	public static void printMarsennePrime() {
		int numPrimes = 31;
		int count = 1;
		System.out.printf("%-20s", "p");
		System.out.println("p^2-1");
		System.out.println("===========================");
		for(int i = 2; count < numPrimes; i++) {
			if(getPrime(i)) {
				System.out.printf("%-20s", i);
				System.out.print(getMarsennePrime(i));
				count++;
				System.out.println();
			}
		}
	}
	
	public static boolean getPrime(int num) {
		if(num == 2) return true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static int getMarsennePrime(int prime) {
		return  (int)Math.pow(2, prime) - 1;
		
	}
	
}
