/**
 * Created by saidrobley on 8/8/17.
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        long reverse = 0;
        while( x != 0){
            reverse = reverse * 10 + x % 10;
            x = x/10;

        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        } else{
            return (int)reverse;
        }
    }
}
