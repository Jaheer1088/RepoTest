package strings;

public class FindingBomb {

	public static void main(String[] args) {
		
		String str = "This goes boom!!!";
		
		if(str.toLowerCase().contains("bomb")) {
			System.out.println("DUCK!");
		}else {
			System.out.println("Relax, there's no bomb.");
		}
		

	}

}
