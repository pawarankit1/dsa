package array;

import java.util.Arrays;

public class IncreasingTripletSequence {
	
	public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		System.out.println(increasingTriplet(arr));

	}

}
