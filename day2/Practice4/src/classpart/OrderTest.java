package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		order1.oderNumber=201803120001L;
		order1.oderID="abc123";
		order1.oderDate="2018�� 3�� 12��";
		order1.oderName="ȫ�浿";
		order1.productNumber="PD0345-12";
		order1.address="����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+order1.oderNumber);
		System.out.println("�ֹ��� ���̵� : "+order1.oderID);
		System.out.println("�ֹ� ��¥ : "+order1.oderDate);
		System.out.println("�ֹ��� �̸� : "+order1.oderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+order1.productNumber);
		System.out.println("��� �ּ� : "+order1.address);

	}

}
