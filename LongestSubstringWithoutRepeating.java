import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	
	public static void main(String[] args) {
		System.out.println(longestSubstring("pwwkew"));
		
	}
	
	public static String longestSubstring(String inputString){
		HashSet<Character> set = new HashSet<Character>();
		int i = 0;
		int j = 0;
		String substring = null;
		int maxLength = 0;
		while(j < inputString.length()){
			if(!set.contains(inputString.charAt(j))){
				set.add(inputString.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j - i);
				
			} else {
				if(maxLength < j - i + 1){
					substring = inputString.substring(i, j);
				}
				set.remove(inputString.charAt(i));
				i++;
			}
		}
		return substring;
		
	}
	
}
