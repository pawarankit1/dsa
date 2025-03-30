package array;

import java.util.HashSet;
import java.util.Set;

public class reverseVowels {
	
	public static final Set<Character> VOWELS = new HashSet<>();
	
	static {
		 VOWELS.add('a'); VOWELS.add('e'); VOWELS.add('i'); VOWELS.add('o'); VOWELS.add('u');
	     VOWELS.add('A'); VOWELS.add('E'); VOWELS.add('I'); VOWELS.add('O'); VOWELS.add('U');
	}
	
	public static String revrseVowel(String s) {
		char[] chars = s.toCharArray();
		int start = 0, end = chars.length-1;
		
		while(start < end)
		{
			while(start < end && !VOWELS.contains(chars[start])) {
				start++;
				
			}
			
			while(start < end && !VOWELS.contains(chars[end])) {
				end--;
			}
			if(start<end) {
				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;
				start++;
				end--;
			}
				
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		String s = "icecream";
		
		
		System.out.println(revrseVowel(s));

	}
	

}
