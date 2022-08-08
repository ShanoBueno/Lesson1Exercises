package accessModifiers;
//1. Class with a default access modifier
class defAccessSpecifier{
	void display()
	{
		System.out.println("You are using default access specifier"); 
	}
}

public class AccessModifiersShowcase {
	public static void main(String[] args) {
		//default
		System.out.println("Default Access Modifier"); 
		defAccessSpecifier obj = new defAccessSpecifier(); 
		obj.display();
	}

}

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
		
	}
}