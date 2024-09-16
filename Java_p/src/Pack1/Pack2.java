package Pack1;

public class Pack2 {

	public static void main(String[] args) {
		
		int n = 82;
		int sum = 0;
		int temp;
		
		while(n>0) {
			
			temp = n%10;  // 2
		    sum = sum + temp; //2
		    n = n/10;  //8
			
		}
		
		System.out.println(sum);

	}

}
