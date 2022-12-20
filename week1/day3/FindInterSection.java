package week1.day3;

public class FindInterSection {

	public static void main(String[] args) {
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		//For loop for printing arrays
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				//If condition for finding the intersection value
				if (array1[i] == array2[j]) {
					System.out.println("The intersection of value is :" + array2[j]);
				}

			}

		}

	}

}
