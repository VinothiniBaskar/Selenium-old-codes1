package week1.day2;

public class GlobalVariables {
	//GlobalVariables declaration
	
	int a=30,b=20,ans;
	 public void addNum() {
		 ans =a+b;
		 System.out.println(ans);

	}
	 public void subNum() {
		 ans=a-b;
		 System.out.println(ans);

	}

	public static void main(String[] args) {
		GlobalVariables l=new GlobalVariables();
		l.addNum();
		l.subNum();
		LocalVariable lc=new LocalVariable();
		lc.mulNum();
		AccessSpecifiers as=new AccessSpecifiers();
		as.phoneNum(); //it is default access specifier(within the package -name-week1.day2)
		as.name();//it is public access specifier(we need to access this method to another package(week1.day1) --import is required)
	}

}
 