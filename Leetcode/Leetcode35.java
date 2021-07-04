public class Leetcode35 {
    public static int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int left = 0;
            int right = n-1;
            int value = n;
            while (left <= right){
                int pviot = ((right - left) >> 1) + left;
                System.out.println(pviot);
                if(target>nums[pviot]){
                    left = pviot+1;
                }
                else {
                    value = pviot;
                    right = pviot-1;
                }
            }
            return value;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,5,6};
        System.out.println(searchInsert(test,1));
    }
}
