package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		order1.oderNumber=201803120001L;
		order1.oderID="abc123";
		order1.oderDate="2018년 3월 12일";
		order1.oderName="홍길동";
		order1.productNumber="PD0345-12";
		order1.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+order1.oderNumber);
		System.out.println("주문자 아이디 : "+order1.oderID);
		System.out.println("주문 날짜 : "+order1.oderDate);
		System.out.println("주문자 이름 : "+order1.oderName);
		System.out.println("주문 상품 번호 : "+order1.productNumber);
		System.out.println("배송 주소 : "+order1.address);

	}

}
