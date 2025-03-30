package array;

public class ReverseTheWords {
	
	public static String fun(String s) {
		String[] sp = s.split(" ");
		int start = 0;
		int end = sp.length-1;
		
		while(start < end)	
		{
		    String temp = sp[start];
			sp[start] = sp[end];
			sp[end] = temp;
			start++;
			end--;
		}
		
		StringBuilder sb = new StringBuilder();
		for(String word : sp)
		{
			if(!word.isEmpty()) {
			if(sb.length() > 0) {
				sb.append(" ");
			}
			sb.append(word);
			}
		}
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		String str = "the sky is blue";
		System.out.println(fun(str));

	}

}
