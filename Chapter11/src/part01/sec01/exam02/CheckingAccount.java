package part01.sec01.exam02;

public class CheckingAccount extends Account{ //Account 를 상속받는 CheckingAccount클래스
	String cardNo; //카드번호
	
	int pay(String cardNo,int amount)throws Exception{ //카드번호 넘겨받을것
		if(!(cardNo.equals(this.cardNo)&&(balance > amount))) { // 넘어온카드번호와 현재객체의 카드번호가 같냐
		throw new Exception("지불이 불가능 합니다.");                // && => ||
		}
		return withdraw(amount);
	}

}
