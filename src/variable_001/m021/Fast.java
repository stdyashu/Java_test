package variable_001.m021;

public class Fast {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("aは" + a);
		System.out.println("bは" + b);
	}

}
