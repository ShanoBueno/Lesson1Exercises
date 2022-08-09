package methods;

public class overloadMethod {
	public void area(int b, int a) {
		System.out.println("Triangle Area = "+ 0.5 * b * a);

	}
	public void area(int r) {
		System.out.println("Circle Are = "+ 3.14 * r * r);
	}
	
	public static void main(String[] args) {
		overloadMethod d = new overloadMethod(); 
		d.area(4);
		d.area(5, 2);
	}
}
