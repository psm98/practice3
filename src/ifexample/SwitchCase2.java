package ifexample;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		int layer;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5���� �Է��ϼ���.");
		layer = sc.nextInt();
		
		switch(layer) {
			case(1):
				System.out.println("1�� �౹�Դϴ�.");
				break;
			case(2):
				System.out.println("2�� �����ܰ��Դϴ�.");
				break;
			case(3):
				System.out.println("3�� �Ǻΰ��Դϴ�.");
				break;
			case(4):
				System.out.println("4�� ġ���Դϴ�.");
				break;
			case(5):
				System.out.println("5�� �ｺŬ���Դϴ�.")	;
				break;
			default:
				System.out.println("�ش� ���� �����ϴ�.");
				break;
		}

	}

}
