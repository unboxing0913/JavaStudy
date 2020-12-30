package part01.sec01.exam01;

public class RefTypeExample9_4 {

	public static void main(String[] args) {
		   Account obj=new Account("111-22-333333333","홍길동",100000);
		   
		   CheckingAccount obj2=(CheckingAccount)obj;       
			 // 강제타입변환은 자식타입이 부모타입으로 자동변환된이후 다시 자식타입으로 변환할때만 유효하다.
			
			try {
				int amount=obj2.pay("4444-5555-6666-7777",47000);
				System.out.println("인출액:"+amount);
				System.out.println("카드번호:"+obj2.cardNo);
			}catch(Exception e) {
				System.out.println(e.getMessage());							
			}
			
		}

	}


