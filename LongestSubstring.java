import java.util.HashSet;

/**
 * Created by saidrobley on 7/30/17.
 */
public class LongestSubstring {
    public static void main(String[] args){
        String str = "pwwkeww";
        int l = lengthOfLongestSubstring(str);
        System.out.println("longest substring is " + l);
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0; // keeps track of longest length

        for(int i = 0; i < s.length(); i++){ // loop through the whole string
            HashSet<Character> chars = new HashSet<Character>(); // create a hash set
            chars.add(s.charAt(i)); // add char to the set
            int j = i + 1;
            while(j < s.length()){
                if(chars.contains(s.charAt(j))){
                    break;
                }else{
                    chars.add(s.charAt(j));
                    j++;
                }

            }
            if(chars.size() > maxLength) {
                maxLength = chars.size();
            }

        }
        return maxLength;

    }
}
