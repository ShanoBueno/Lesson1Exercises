package accessModifiers;

class privateaccessspecifier{
	private void display()
	{
		System.out.println("You are using private access specifier");
	}
}

public class accessSpecifiers2{
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		privateaccessspecifier obj = new privateaccessspecifier(); 
		//this won't work because display is in a private class
		//obj.display(); 
	}
}