package loopexample;

public class Ex3 {

	public static void main(String[] args) {
		int dan;
		int time;
		
		for(dan=1; dan<=9; dan++) {
			if(dan %2 != 0)
				continue;
			System.out.println(dan+"´Ü");
			for(time=1; time<=9; time++) {
				System.out.println(dan+"X"+time);
				
			}
			System.out.println();
		}
				
	}

}
