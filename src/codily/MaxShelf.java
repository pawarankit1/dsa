package codily;
import java.util.*;

public class MaxShelf {
	
	
	// you can also use imports, for example:
	

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public int solution(int[] client) {
	        int N = client.length;
	        Set<Integer> shelf = new HashSet<>();
	        int maxShelfSize = 0;
	        int expected = 1;

	        for(int i = 0; i < N; i++)
	        {
	            int arrivingPackage = i+1;
	            if(client[i] == arrivingPackage)
	            {
	                expected++;
	                while(shelf.contains(expected)){
	                    shelf.remove(expected);
	                    expected++;
	                }
	            }
	            else {
	                shelf.add(arrivingPackage);
	                maxShelfSize = Math.max(maxShelfSize, shelf.size());
	            }
	        }
	        return maxShelfSize;
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
