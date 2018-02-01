/**
 * Created by saidrobley on 8/8/17.
 */
public class Palindrom {
    public static void main(String[] args){
        System.out.println(isPalindrom(10));
    }
    private static boolean isPalindrom(int x){
        // reverse the number
        if( x < 0){
            return false;
        }
        long r = 0;
        while(x != 0){
            r = r * 10 + x % 10;
            x = x/10;
        }
        System.out.println("r = " + r);
        if(x == r){
            return true;
        } else{
            return false;
        }
    }
}
