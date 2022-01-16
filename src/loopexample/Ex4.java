package loopexample;

public class Ex4 {

	public static void main(String[] args) {
		int dan;
		int time;
		
		for(dan=1; dan<=9; dan++) {
			System.out.println(dan+"´Ü");
		
		for(time=1; ; time++) {
			if(dan<time)
				break;
			System.out.println(dan+"X"+time);
			}
		System.out.println();
		}
		}

	}
