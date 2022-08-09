package methods;

public class callMethod {
	int num = 15; 
	int mult(int num) {
		num = num * 10; 
		return num; 
	}
	
	public static void main(String[] arg) {
		callMethod d = new callMethod(); 
		System.out.println(d.mult(d.num));
	}

}


