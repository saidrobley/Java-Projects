import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 5};
        System.out.println("total = " + sumElements(arr));
    }
    public static int sumElements(int[] arr){
        if(arr.length == 0) return 0;
        if(arr.length == 1){
            return arr[0];
        } else {
            return (arr[0] + sumElements(Arrays.copyOfRange(arr, 1, arr.length)));
        }

    }
}
