import java.util.Scanner;

/**
 * Created by saidrobley on 10/7/17.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int m = n;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            arr2[m-1] = arr[arr_i];
          //  System.out.print(arr2[m-1]);
            m--;

        }
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }

}
