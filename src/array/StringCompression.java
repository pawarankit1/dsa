package array;

import java.util.Arrays;

public class StringCompression {
	
	 public static int compress(char[] chars) {
	        
	        if(chars.length == 0)
	          return 0;
	        int write = 0;
	        int read =0;
	        while(read < chars.length)
	        {
	            char compare = chars[read];
	            int count = 0;
	            
	            while(read < chars.length && chars[read] == compare)
	            {
	                read++;
	                count++;
	            }
	            chars[write++] = compare;
	            
	            if(count > 1){
	                for(char c : Integer.toString(count).toCharArray()){
	                    chars[write++] = c;
	                }
	            }

	        }
	        return write;

	        
	    }

	public static void main(String[] args) {
		char[] chars = {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));
		

	}

}
