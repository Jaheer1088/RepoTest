package Pack1;

public class SumOfNPrimeNumbers {

	public static void main(String[] args) {
		
		int i = 10;
		sumOfNPrimeNum(i);
		
	}

	
	public static void sumOfNPrimeNum(int num) {
		
		int sum=0,n=num;
		for(int i =2;i<=n;i++) {
			
			if(!(num%i==0)) {
				num--;
			}else {
				sum+=num;
			}
		}
		System.out.println(sum);
		
	}
}
