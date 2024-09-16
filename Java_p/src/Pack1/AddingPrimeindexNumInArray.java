package Pack1;

public class AddingPrimeindexNumInArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,9,9,9};
		int num = 2, res=a[2];   //res = 3
		for(int i=3;i<a.length;i++) {
			
			if(i%num==0) {   //3%2 
				  num++;  
				
			}else {
				res+=a[i];    //3+4
			}
			
		}
		
		System.out.println(res);
		

	}

}
