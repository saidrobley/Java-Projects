/**
 * Created by saidrobley on 1/25/18.
 */
public class NumberToText {
    static int counter = 0;
    static StringBuilder str = null;
    public static void main(String[] args) {
        // 123 => one hundred twenty three
        int number = 123;
        numberToText(number);
    }
    public static void numberToText(int num){
        if(num <= 10){
            printMessage(counter, num);
            System.out.println(str + " ");

        } else {
            int r = num % 10;
            int newNumb = num/10;
            printMessage(counter, r);
            counter++;
            numberToText(newNumb);
        }

    }
    public static void printMessage(int count, int reminder){
        if(count == 0){
            if(reminder == 1){
                System.out.println("one ");
                str.append("one ");

            }else if(reminder == 2){
                System.out.println("two ");
                str.append("tw ");
            }else if (reminder == 3){
                System.out.println("three ");
               // str.append("three ");
                str.insert(count, "three ");

            }
        }else if(count == 1){
            if(reminder == 2){
                System.out.println("twenty ");
                str.append("twenty ");
            }else if(reminder == 3){
                System.out.println("thirty ");
                str.append("thirty ");
            }else if (reminder == 4){
                System.out.println("forty ");
                str.append("forty ");
            }
        }else if(count == 2){
            if(reminder == 1){
                System.out.println("one hundred ");
                str.append("one hundred ");
            }else if(reminder == 2){
                System.out.println("two hundred ");
                str.append("two hundred ");
            }else if (reminder == 3){
                System.out.println("three hundred ");
                str.append("three hundred ");
            }
        }
    }

}
