package methods;

public class MethodExecution {
	
	public int mult(int a, int b) {
		int z = a * b; 
		return z; 
	}
	public static void main(String[] args) {
		MethodExecution b = new MethodExecution();
		System.out.println(b.mult(3, 12));
	}

}

