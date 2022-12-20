package week1.day2;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a = 0, b = 1, sum = 0;
		System.out.print(a + " " + b);

		for (int i = 2; i <= 11; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}

	}

}
