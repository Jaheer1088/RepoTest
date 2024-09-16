package strings;

public class SayHelloSayBye {
	
	public static String sayHelloBye(String name, int num) {
		
		String res = "";
		
		if(num == 1) {
			
			res+="Hello"+" "+name.substring(0, 1).toUpperCase()+name.substring(1, name.length());
		}else if(num == 0) {
			res+="Bye"+" "+name.substring(0, 1).toUpperCase()+name.substring(1, name.length());
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		String input = "alon";
		int num = 0;
		
		System.out.println(sayHelloBye(input, num));
	}

}
