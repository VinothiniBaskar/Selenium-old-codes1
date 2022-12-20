package week1.day2;

public class PrimeNum {
	public static void main(String[] args) {
		int n=7;
		boolean prime = true;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				System.out.println("Given number is not a prime number");
				prime = false;
				break;
			}
				
		}
		if (prime) {
			System.out.println("Given number is  a prime number");

		}

	}

}
