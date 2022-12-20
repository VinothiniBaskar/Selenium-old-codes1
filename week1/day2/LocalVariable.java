package week1.day2;

public class LocalVariable {
	 public void mulNum() {
		 //Local variable declaration
		 
		 int a=10,b=20;
		 int c=a*b;
		 System.out.println(c);
		
	}
	 
public static void main(String[] args) {
	LocalVariable l=new LocalVariable();
	l.mulNum();
	GlobalVariables lr=new GlobalVariables();
	lr.addNum();
	lr.subNum();
	
}

}
