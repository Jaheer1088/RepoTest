package Pack1;

public class PrintingLeftTrianglePattern {

	public static void main(String[] args) {
		
		for(int i =0;i<5;i++) {
			
			//printing spaces
			for(int j =1;j<5-i;j++) {
				System.out.print(" ");
			}
			
			//printing *
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			
		System.out.println();
			
		}

	}

}
