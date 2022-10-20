package quiz1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateArray {
    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 2;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
}
