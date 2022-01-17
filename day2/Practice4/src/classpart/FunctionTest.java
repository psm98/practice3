package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
		
		int sum2 = min(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + sum2 + "입니다.");
		
		int sum3 = xxx(num1, num2);
		System.out.println(num1 + "x" + num2 + "=" + sum3 + "입니다.");
		
		int sum4 = qqq(num1, num2);
		System.out.println(num1 + "/" + num2 + "=" + sum4 + "입니다.");

	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int min(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int xxx(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int qqq(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
