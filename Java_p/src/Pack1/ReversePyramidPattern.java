package Pack1;

public class ReversePyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no.of rows =5
		
		for(int i=0;i<5;i++) {
			
			//no.of spaces at start 0,1,2,3,4
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			//no.of stars in each row 5,4,3,2,1
			
			for(int k=5-i;k>0;k--) {
				System.out.print("* ");
			}
			

			System.out.println("");
		}

	}

}
