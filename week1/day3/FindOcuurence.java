package week1.day3;


public class FindOcuurence {

	public static void main(String[] args) {
		String str = "TestLeaf";
		  char ch = 'e';             
		  
		  int count=0;
		  for(int i=0; i<str.length(); i++)
		  {
		      if(str.charAt(i) == ch)
		      count++;
		  }
		  
		  System.out.println("The Character '"+ch+"' appears "+count+" times.");
		  }
	}


