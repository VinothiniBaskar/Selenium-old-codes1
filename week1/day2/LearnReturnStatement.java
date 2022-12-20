package week1.day2;

public class LearnReturnStatement {

	// void return type
	public void addNum() {
		int a = 5, b = 10;
		int c = a + b;
		System.out.println("The addtion of two num is: " + c);

	}

	// int return type
	public int addThreeNum(int a, int b, int c) {
		return a + b + c;

	}

	public boolean switchOff() {
		return true;

	}

	public String phoneName() {
		return "vivo";

	}

	public static void main(String[] args) {
		LearnReturnStatement lr = new LearnReturnStatement();
		lr.addNum();
		// Ctrl+2+L --To create a variable
		int addThreeNum = lr.addThreeNum(10, 20, 30);
		System.out.println("The addtion of three num is: " + addThreeNum);
		boolean switchOff = lr.switchOff();
		System.out.println("can you switch off your mobile:" + switchOff);
		String phoneName = lr.phoneName();
		System.out.println("can you tell your mobile name :" + phoneName);

	}

}
