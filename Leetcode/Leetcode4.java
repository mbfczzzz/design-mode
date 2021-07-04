import java.util.Arrays;

public class Leetcode4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length+nums2.length];
        //合并数组有序
        int j=0;
        int i=0;
        int t=0;
        while (i<=nums1.length-1 && j<=nums2.length-1){
            if(nums1[i]<nums2[j]){
                array[t] = nums1[i];
                i++;//1
                t++;
            }
            else {
                array[t] = nums2[j];
                j++;
                t++;
            }
        }
        if(i<=nums1.length-1){
            for (;i<=nums1.length-1;i++){
                array[t] = nums1[i];
                t++;
            }
        }
        if(j<=nums2.length-1){
            for (;j<=nums2.length-1;j++){
                array[t] = nums2[j];
                t++;
            }
        }
        System.out.println(Arrays.toString(array));
        if(array.length % 2 ==0 ){
            double test1 = array[array.length/2-1];
            double test2 = array[array.length/2];
            return  (test1+test2)/2;
        }
        return array[array.length/2];
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
