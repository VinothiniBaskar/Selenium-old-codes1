package week1.day2;

public class AccessSpecifiers {

	// public AccessSpecifier
	// public is accessible another package also,but we need to import

	public void name() {
		System.out.println("Vinothini");
	}

	// Default AccessSpecifier
	// Default is only accessible within the package
	void phoneNum() {
		System.out.println("8610084950");

	}

	// private AccessSpecifier
	// private is only accessible within the class

	private void atmPin() {
		System.out.println("4568");
	}

	public static void main(String[] args) {

		AccessSpecifiers as = new AccessSpecifiers();
		as.name();// it is public access specifier
		as.phoneNum();// it is default access specifier
		as.atmPin();// it is private access specifier
	}

}
