package week1.day2;

public class StaticVariable {
	// Declare the static variable
	static int count = 10;
	//Declare a  instance variable
	int a=10;
	// static block
	static {
		count++;
		System.out.println("The first static block is called");
	}

	// static method
	public static void staticMethod() {
		//System.out.println(a); //We can't access instance variable in static method or block
		count++;
		System.out.println("static menthod is called");
	}

	// constructor method                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	public  StaticVariable() {		count++; 
		System.out.println("constructor method called");
	}

	// Instance method
	public void getMethod() {
		count++;//we can access static variable in instance method
		System.out.println("instance method called");
	}

	public static void main(String[] args) {
		//We can access  the static variable and method by using class name
//		StaticVariable.count++;
//		StaticVariable.staticMethod();
		
		StaticVariable sv=new StaticVariable();
		sv.getMethod();
		sv.staticMethod();
		System.out.println("the value is"+count);
	}

	

}
