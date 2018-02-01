/**
 * Created by saidrobley on 8/3/17.
 */
public class MedianSortedArray {
    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println("answer " + findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] tot = new int[size];

        int i = 0, j = 0, k = 0;
        // one array containing sorted number of the two.
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                tot[k] = nums1[i];
                i++;
            } else{
                tot[k] = nums2[j];
                j++;
            }
            k++;
        }
        // if nums1 is bigger than nums2
        if(i < nums1.length) {
            while (i < nums1.length) {
                tot[k] = nums1[i];
                i++;
                k++;

            }
        }
        // if nums2 is bigger than nums1
        if(j < nums2.length) {
            while (j < nums2.length) {
                tot[k] = nums2[j];
                j++;
                k++;

            }
        }
        // the array is even
        if(size % 2 != 0){
            int ind = size/2;
            double r = (double)tot[ind];
            return r;
        }else{
            int ind1 = tot.length/2;
            int ind2 = ind1 - 1;
            double r = (double)(tot[ind1] + tot[ind2])/2;

            return r;
        }


    }
}
