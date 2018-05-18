import java.util.Arrays;

public class PalindromicPrime {
	
	public static void main(String[] args) {
		
		getPrime();
		
	}
	
	public static boolean isPrime(int num) {
		if(num == 2) return true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static String[] getPrime(){
		String[] arr = new String[120];
		int index = 0;
		int count = 1;
		for(int i = 2; count <= arr.length; i++) {
			if(isPrime(i)){
				String r = reverseNum(i);
				String p = Integer.toString(i);
				
				// check if the prime is palindrome
				if(p.equals(r)) {
					arr[index] = p;
					index++;
					count++;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public static String reverseNum(int num) {
		String n = Integer.toString(num);
		String numRev = "";
		for(int i = n.length()-1; i >= 0; i--) {
			numRev = numRev + n.charAt(i);
		}
		return numRev;
	}
	
}
