package array;

public class MaxSumSubArrayOfSizeK {
	
	public static void fun(int arr[],int k) {
		int windowSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < k; i++) {
			windowSum += arr[i ];
		}
		
		for(int i = k; i<arr.length; i++)
		{
			windowSum = windowSum - arr[i - k] + arr[i];
			maxSum = Math.max(maxSum, windowSum);
		}
		System.out.println("Maximum sum : " +maxSum);
	}

	public static void main(String[] args) {
		int[] array = {1,-4,22,5,-9,4,45,10,-20};
		fun(array, 3);

	}

}
