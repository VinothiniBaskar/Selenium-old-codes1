package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Anagram is both the strings and length should be equal  
		//st1 is act and st2 is cat ,here both letters are  same but meaning is differs
		//like anagram is all the letters contains in word but it gives different meaning
		String str1="act";
		//convert string to charArray
		char[] ch1 = str1.toCharArray();
		//sort the array
	    Arrays.sort(ch1);
		String str2 ="cat";
		//convert the second String to charArray
		char[] ch2 = str2.toCharArray();
		//sort the array
		Arrays.sort(ch2);
		//declare a boolean variable
		boolean bAnagram = true;
		//iterate through a for loop
		for (int i = 0; i < ch2.length; i++) {
			//check whether both the arrays are equal
			if (ch1[i]!=ch2[i]) {
				//print it is not anagram
				System.out.println("Not Anagram");
				bAnagram=false;
				break;
				
			}
		}
		//if it is true
		if (bAnagram) {
			//print anagram
			System.out.println("Anagram");
		}
		

	}

}
                                             