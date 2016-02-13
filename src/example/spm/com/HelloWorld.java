package example.spm.com;

public class HelloWorld {
	
	public static String getName(){
		return "Joana";
	}

	public static String message(){
		return "Welcome to my project!";
	}
	
	
	public static void main(String[] args){
		String name = getName();
		System.out.println("Hello World, "+ name);
		System.out.println(message());
		int a=2;
		int b=4;
		System.out.println(SimpleCalculator.add(a,b));
		System.out.println(SimpleCalculator.sub(a,b));
	}
}
