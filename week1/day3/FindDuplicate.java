package week1.day3;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] num= {12,10,13,12,10};
	       Arrays.sort(num);
		System.out.println(num);
		for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);

			}
		}
		
		

	}

}
