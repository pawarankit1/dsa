package twoPointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroToRight {
	
	public static int[] moveZeroes(int[] nums) {

		int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
		return nums;
            


        
    }

	public static void main(String[] args) {
		int arr[] = {0};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(moveZeroes(arr)));

	}

}
