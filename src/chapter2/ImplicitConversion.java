package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		float fNum = 20;
		double dNum = iNum + fNum;
		
		System.out.println(fNum);
		System.out.println(dNum);

	}

}
