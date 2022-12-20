package week1.day3;

public class ChangeOddIndexToUpperCase1 {

	public static void main(String[] args) {
		String str = "changeme";
		char[] ch = str.toCharArray();
		// It is used to print the first value in capital letter --->A=65 and a=97 ,we
		// need to convert small to capital (65-97=-32) (A to Z=65 to 90 ) and (a to z=97 to 122)
		// It is used to print the first value in capital letter --->A=65 and a=97 ,we
		// need to convert small to capital (97-65=32)
//		ch[0]=(char)(ch[0] +32);
//		ch[0] = (char) (ch[0] - 32);
//		System.out.print(ch[0]);
		str=new String(ch);
		System.out.println(str);
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Even character is:"+ch[i]);
				
			} else {
				ch[i] = (char) (ch[i] - 32);
				System.out.println("odd character is:"+ch[i]);
			}

		}
	
		// It is print the another letters --Output is Changeme
//		for (int i = 1; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}
 
	}

}
