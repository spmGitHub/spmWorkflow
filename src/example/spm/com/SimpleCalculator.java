package example.spm.com;

public class SimpleCalculator implements Calculator{
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int sub(int a, int b){
		return a-b;
	}
	
	public static int mult(int a, int b){
		return a*b;
	}
	
	public static int div(int a, int b){
		return a/b;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mult() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		return 0;
	}

}
