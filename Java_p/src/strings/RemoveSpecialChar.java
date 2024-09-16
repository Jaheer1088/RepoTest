package strings;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String s = "Java&_Is*";
		
	String res =	s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(res);

	}

}
