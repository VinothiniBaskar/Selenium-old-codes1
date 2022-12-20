package week1.day1;

public class DataTypes {
	// Primitive data Type

	int a = 1213592;
	float f = 1.25f;
	short s = 2000;
	double d = 1.25639875;
	long l = 12256325663546l;
	byte b = 12;
	char c = 'v';
	boolean bol = true;

	// Non-Primitive data Type
	String str = "vino";

	public static void main(String[] args) {
		DataTypes data = new DataTypes();
		System.out.println(data.a + "\n" + data.f + "\n" + data.s + "\n" + data.d + "\n" + data.l + "\n" + data.b + "\n"
				+ data.c + "\n" + data.bol + "\n" + data.str);
	}

}
