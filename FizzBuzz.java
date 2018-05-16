/**
 * Created by saidrobley on 2/19/17.
 * if the index is divisible by 3 and 5 output FizzBuzz
 * if it is divisible by 3 out put Fizz
 * else output Buzz
 
 */
public class FizzBuzz {

    public void getFizzBuzz(){
        for(int i = 1; i<= 100; i++){
            if(i%3==0 && i%5 == 0){
                System.out.println(i + " FizzBuzz");
            }else if(i%3==0){
                System.out.println(i + " Fizz");
            } else if(i%5==0){
                System.out.println(i + " Buzz");
            }
        }
    }
}
