package example.spm.com;

public class HelloWorld {
	
	public static String getName(){
		return "Joana";
	}

	
	public static void main(String[] args){
		String name = getName();
		System.out.println("Hello World, "+ name);
	}
}
