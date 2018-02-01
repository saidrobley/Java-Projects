import java.util.ArrayList;

/**
 * Created by saidrobley on 1/25/18.
 */
public class CheckValidNumber {


        public static void main(String[] args) {
            String[] arr = {"987-123-4567", "123 456 7890", "(123) 456-7890", "232323", ""};

            checkNumber(arr);
        }
        public static ArrayList<String> checkNumber(String[] arr){
            ArrayList<String> answer = new ArrayList();
            System.out.println(arr.length);
            for(int i = 0; i < arr.length; i++){
                String elem = arr[i];
                System.out.println(elem + " elem " + elem.length());
                if(elem.length() == 12) {
                    if(elem.charAt(3) == '-' && elem.charAt(7) == '-'){

                        answer.add(elem);
                    } else {

                    }
                } else if (elem.length() == 14){
                    if(elem.charAt(0) == '(' && elem.charAt(4) == ')' && elem.charAt(5) == ' ' &&
                            elem.charAt(9) == '-'){

                        answer.add(elem);
                    } else {

                    }
                }else {

                }
            }
            System.out.println(answer);
            return answer;

        }


}
