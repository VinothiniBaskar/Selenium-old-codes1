package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Declare a String
		String str = "vinothini";
		System.out.println("The Given name is :" + str);
		// converted string to char array
		char[] ch = str.toCharArray();
		// Created loop for printing the odd character to uppercase
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even character is:" + ch[i]);

			} else {
				ch[i] = (char) (ch[i] - 32);
				System.out.println("odd character is:" + ch[i]);
			}

		}

	}

}
