package part01.sec01.exam01;

public class RefTypeExample10_5 {

	public static void main(String[] args) {
		 Account obj=new Account("111-22-333333333","홍길동",100000);
		 
		if(obj instanceof CheckingAccount) {   //instanceof : 형변환이 가능한가?
			pay((CheckingAccount)obj);
	      }else {
			System.out.println("캐스팅 할 수 없는 타입입니다.");
	      }
	}	
	
	
	static void pay(CheckingAccount obj) {
			try {
				int amount=obj.pay("4444-5555-6666-7777",47000);
				System.out.println("인출액:"+amount);
				System.out.println("카드번호:"+obj.cardNo);
			}catch(Exception e) {
				System.out.println(e.getMessage());							
			}
			
		}
	
}

