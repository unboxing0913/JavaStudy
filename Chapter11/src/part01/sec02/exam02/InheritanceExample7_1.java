package part01.sec02.exam02;

public class InheritanceExample7_1 {

	public static void main(String[] args) { //메인이 static 
		Account obj1=new Account("111-22-333333","임꺽정",10000);
//		CheckingAccount obj2=new CheckingAccount("444-55-666666","홍길동",20000,"5555-6666-7777-8888");
//		CreditLineAccount obj3=new CreditLineAccount("777-88-999999","김선달",30000,2000000);
//		BonusPointAccount obj4=new BonusPointAccount("000-00-000000","김미영",0,0);
		
		
		Account obj2=new CheckingAccount("444-55-666666","홍길동",20000,"5555-6666-7777-8888");
		Account obj3=new CreditLineAccount("777-88-999999","김선달",30000,2000000);
		Account obj4=new BonusPointAccount("000-00-000000","김미영",0,0);
		//자기 부모타입일때도 적용됨 
		//상속관계에서 자식들은 부모타입으로해도 적용된다 (다형성)
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);

	}
	// 메소드를 만들어서 다음 내용을 출력하세요
	public static void printAccountInfo(Account obj){	 //클래스타입 (주는쪽받는쪽 같아야함)
	System.out.println("계좌번호 : "+obj.accountNo);
	System.out.println("예금주 이름 : "+obj.ownerName);
	System.out.println("잔액:"+obj.balance);
	System.out.println();
	}
    /*  ★★ 상속일때만적용 ★★★★★★★★★
     * 주석해도 되는이유는 상속관계의 다형성 때문이다. (타입을 부모타입으로 해주면 해결됨)
     * 
	public static void printAccountInfo(CheckingAccount obj){ // 메소드 오버로딩		
	System.out.println("계좌번호"+obj.accountNo);
	System.out.println("예금주 이름"+obj.ownerName);
	System.out.println("잔액:"+obj.balance);
	System.out.println();
	}
	
	public static void printAccountInfo(CreditLineAccount obj){		
	System.out.println("계좌번호"+obj.accountNo);
	System.out.println("예금주 이름"+obj.ownerName);
	System.out.println("잔액:"+obj.balance);
	System.out.println();
	}
	
	public static void printAccountInfo(BonusPointAccount obj){		
	System.out.println("계좌번호"+obj.accountNo);
	System.out.println("예금주 이름"+obj.ownerName);
	System.out.println("잔액:"+obj.balance);
	System.out.println();
	}
   */
}
