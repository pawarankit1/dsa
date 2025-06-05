package array;

import java.util.Arrays;

public class MoverZeroToRight {
	
	public static void func(int arr[]) {
		int n = arr.length;
		if(n == 0 || n == 1)
			return;
		
		int nz = 0, z = 0;
		
		while(nz < n)
		{
			if(arr[nz] != 0)
			{
				int temp = arr[nz];
				arr[nz] = arr[z];
				arr[z] = temp;
				
				nz++;
				z++;
				
			}
			else
				nz++;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int [] array = {0,0,0,1,2,3,0,2};
		func(array);

	}

}
