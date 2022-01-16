package loopexample;

public class Ex5 {

	public static void main(String[] args) {
		int linecount=4;
		int spacecount=3;
		int starcount=1;
		
		for(int i=0; i<linecount; i++) {
			for(int j=0; j<spacecount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starcount; j++) {
				System.out.print('*');
			}
			for(int j=0; j<spacecount; j++) {
				System.out.print(' ');
			}
			spacecount-=1;
			starcount+=2;
			System.out.println();
		}

	}
}
