package example.spm.com;

public class SimpleLongCalculator implements Calculator{
	
	public static long add(long a, long b){
		return a+b;
	}
	
	public static long sub(long a, long b){
		return a-b;
	}
	
	public static long mult(long a, long b){
		return a*b;
	}
	
	public static float div(long a, long b){
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
