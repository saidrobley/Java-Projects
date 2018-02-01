import java.util.LinkedList;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args){
        String s = "((({dsdf))}";
        checkParen( s);
    }

    public static void checkParen(String s){
       // LinkedList<Character> list = new LinkedList<Character>();
        Stack list = new Stack();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                list.push(s.charAt(i));
                System.out.println("the top of the list is " + list.peek());
            } else if(s.charAt(i) == ')'){
                list.pop();
            }
        }
        System.out.println("the list contains " + list);
        if(list.size() > 0){
            System.out.println("parenthesis does not match");
        }else if(list.size() == 0){
            System.out.println("match");
        }


    }
}
