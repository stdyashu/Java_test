package variable_001.m025;

public class Fast {
	static int globalVar = 42;
	public static void main(String[] args) {
		System.out.println(globalVar);
	}
	public static void anotherMethod() {
        globalVar = 20;  // グローバル変数の更新
    }
}
