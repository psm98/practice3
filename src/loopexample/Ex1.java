package loopexample;

public class Ex1 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		int sum=0;
		char operator='+';
		
		if(operator=='+') {
			sum=num1+num2;
			System.out.println(sum);
		}
		else if(operator=='-') {
			sum=num1-num2;
			System.out.println(sum);
		}
		else if(operator=='*') {
			sum=num1*num2;
			System.out.println(sum);	
		}
		else if(operator=='/'){
			sum=num1/num2;
			System.out.println(sum);
		}

	}

}
