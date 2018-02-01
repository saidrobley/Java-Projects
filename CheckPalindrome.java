/**
 * Created by saidrobley on 8/3/17.
 */
public class CheckPalindrome {

    public static void main(String[] args){
        String s = "abasba";
       // System.out.println("sol " + checkPalindrome(s));
       // System.out.println(reverseString("abcde"));
        chckPalindrom("absdba");
    }

    // reverse the string
    private static String reverseString(String s){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
    //***************************************************
    private static boolean chckPalindrom(String s){
        String r = reverseString(s);
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == r.charAt(i)){
                flag = true;
                continue;
            }else{
                flag = false;
                break;

            }
        }
        if(flag){
            System.out.println(s + " palindrome");
        }else{
            System.out.println(s + " is not palindrome");
        }
        return flag;
    }
    //***************************************************

    public static boolean checkPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        boolean sol = false;
        while ( i <= j){
            if(s.charAt(i) == s.charAt(j)){
                //continue;
                i++;
                j--;
            }else{
                break;
            }
        }
        if(i == j || i > j){
            sol = true;
        }
        return sol;
    }
}
