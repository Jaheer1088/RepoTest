package strings;

public class JoiningTwoPortionsOfPaths {

	public static void main(String[] args) {
		
		String str = "portion1/";
		String str1 = "portion2";
		
		if(str.contains("/") && str1.contains("/")) {
			
			System.out.println(str.replace("/", "").concat(str1));
		}else if(str.contains("/") || str1.contains("/")){
			System.out.println(str.concat(str1));
			
		}else {
			
			System.out.println(str.concat("/").concat(str1));
			
		}

	}

}
