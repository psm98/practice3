package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 3; dan <= 7; dan++) {
			System.out.println(dan+"��");
			for(times=1; times <=9; times++) {
				
				System.out.println(dan+"X"+times+"="+dan*times);
				
			}
			
			System.out.println();
		}

	}

}
