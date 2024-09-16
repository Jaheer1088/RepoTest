package Pack1;

public class RecursiveFunctionCheck {

	public static void main(String[] args) {
		
		int i = 7;
		System.out.println(mystery(i));

	}
	
	public static int mystery(int num) {
		
		if(num<=1) {     //7<=1 false,  5<=1, 3<=1, 1<=1
			return 1;   //1
		}else {
			return num*mystery(num-2);  // 7* 5*3*1
		}
	}

}
