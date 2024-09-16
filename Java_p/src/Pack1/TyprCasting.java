package Pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TyprCasting {

	public static void main(String[] args) {
		
		int i =10;
		double d = 10.87654;
		String s = "30";
		
		int k = Integer.parseInt(s);
		System.out.println(k);
		
		String s1 = String.valueOf(i);
		System.out.println(s1);
		
		System.out.println(String.valueOf(d));

		int j = (int)d;
		System.out.println(j);
		
		float f = (float)d;
		System.out.println(f);
		
		
	    List<Integer> li = Arrays.asList(1,2,3,4);
	}

}
