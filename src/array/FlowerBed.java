package array;

class FlowerBed{

	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        
		 int count=0;
		 int len=flowerbed.length;
	        
	        for(int i=0;i<len;i++) {
	        	if(flowerbed[i]==0)
	        	{
	        		boolean leftEmpty = (i==0) || (flowerbed[i-1] == 0);
	        		boolean rightEmpty = (i == len-1) || (flowerbed[i+1] == 0);
	        		
	        		if (leftEmpty && rightEmpty) {
	        			flowerbed[i]  = 1;
	        			count++;
	        			
	        			if (count >= n) {
	        				return true;
	        			}
	        			
	        		}
	        	}
	        	
	        } 
	        return count >= n;
	        	
	        
	    }

	    public static void main(String[] args) {
	        int[] arr = {1,0,0,0,0,1};
	        canPlaceFlowers(arr, 2);
	       
	        
	    }
	}