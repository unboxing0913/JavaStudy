package part01.sec02.exam05;

public class MethodExample1 {

	public static void main(String[] args) { // 스테틱이니깐 메모리에 먼저로딩됨 => 메소드영역에 상주하게됨 
		Account obj1=new Account("111-222-33333333","김영식",200000);
		Account obj2=new Account("555-666-77777777","박진희",1000000);
		
		obj1.deposit(1000000);
		obj2.withdraw(200000);
		
		printAccount(obj1);
		printAccount(obj2);
		

	}
	
	static void printAccount(Account obj){  // 객체생성없이 쓸수있게만들기위해서 앞에 static
		System.out.println("계좌번호"+obj.accountNo);
		System.out.println("예금주 이름"+obj.ownerName);
		System.out.println("잔액"+obj.balance);
		System.out.println();
	}

}
