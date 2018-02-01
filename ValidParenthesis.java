import java.util.Stack;


public class ValidParenthesis {
    public static void main(String[] args){
        String str = "[(){}]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<arr.length; i++)
            if(arr[i] == '[' || arr[i] == '(' || arr[i] == '{'){
                stack.push(arr[i]);
            } else if(arr[i] == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }else if(arr[i] == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }else if(arr[i] == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            }
        return stack.size() == 0;
    }
}
