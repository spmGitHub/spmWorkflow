package example.spm.com;

public class HelloWorld {

	public static String message(){
		return "Welcome to my project!";
	}
	
	
	public static void main(String[] args){
		String name = Name.getName();
		System.out.println("Hello World, "+ name);
		System.out.println(message());
		int a=4;
		int b=2;
		System.out.println(SimpleCalculator.add(a,b));
		System.out.println(SimpleCalculator.sub(a,b));
		System.out.println(SimpleCalculator.mult(a,b));
		System.out.println(SimpleCalculator.div(a,b));
		
		float c = 110;
		float d = 2;
		
		System.out.println(SimpleFloatCalculator.add(c, d));
		System.out.println(SimpleFloatCalculator.sub(c, d));
	}
}
