package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int  i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println("The odd number is:"+i);
			}
			else if (i%2==0) {
				System.out.println("The even number is:"+i);
			}
		}

	}

}
