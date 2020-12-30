package part01.sec01.exam01;

public class RefTypeExample6_3 {

	public static void main(String[] args) {
		Account obj=new CheckingAccount("111-22-333333333","홍길동",100000,"4444-5555-6666-7777");
		
				
	//	CheckingAccount obj2=obj;   //부모타입은 자식타입으로 자동타입변환이안됨
		CheckingAccount obj2=(CheckingAccount)obj;       //ex) double a = 80;   :자동타입변환
		//캐스팅이 필요한이유 : 다형성에서 자식 객체를 가져다쓸때 
		
		try {
			int amount=obj2.pay("4444-5555-6666-7777",47000);
			System.out.println("인출액:"+amount);
			System.out.println("카드번호:"+obj2.cardNo);
		}catch(Exception e) {
			System.out.println(e.getMessage());							
		}
		
	}

}
