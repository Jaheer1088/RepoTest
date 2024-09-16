package strings;

import java.util.Arrays;

public class ScoringSystem {

	public static void main(String[] args) {
		
		int [] arr = new int[3];
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		
		
		String s = "A";
		
		for(int i =0;i<s.length();i++) {
			
			if(s.charAt(i)=='A') aCount++;
			else if(s.charAt(i)=='B') bCount++;
			else if(s.charAt(i)== 'C') cCount++;
		}
		
		arr[0] = aCount;
		arr[1] = bCount;
		arr[2] = cCount;
		
		System.out.println(Arrays.toString(arr));

	}

}
