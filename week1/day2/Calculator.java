package week1.day2;

public class Calculator {
	public int subNumbers(int x, int y) {
		return x - y;

	}

	public int mulnumbers(int x, int y) {
		return x * y;

	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int cal = c.subNumbers(20, 15);
		System.out.println(cal);
		int cal1 = c.mulnumbers(25, 5);
		System.out.println(cal1);

	}

}                                 
