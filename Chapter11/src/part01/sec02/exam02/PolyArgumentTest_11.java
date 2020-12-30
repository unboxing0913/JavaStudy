package part01.sec02.exam02;

class Product{
	int price;//제품의 가격
	int bonusPoint;//제품구매시 제공하는 보너스 점수
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);//보너스 점수는 제품가격의 10%
	}
}
/////////////////////////////////////////////
class Tv extends Product{
    	
	Tv() {
		super(100);
		
	}
	//주소값대신 문자열로 표현 (자바에서 제공해주는 메소드)
	public String toString() {//객체가 가지고있는 값을 표현하고싶을때 쓰는 메소드		
		return "Tv";		
	}
	
}
/////////////////////////////////////////////
class Computer extends Product{
	
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
	
}
////////////////////////////////////////////
class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	void buy(Product p) { //다형성 부모타입으로 클래스를받는다 (클래스/참조변수p)
		
		if(money<p.price) { //클래스타입을받은 참조변수 p의 제품가격 p.price
			System.out.println("잔액이 부족합니다.");
			return;
		}else {
		    money-=p.price;
		    bonusPoint+=p.bonusPoint;
		    System.out.println(p+"을/를 구입하셨습니다.");
		}
	}
}
/////////////////////////////////////////////
public class PolyArgumentTest_11 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();		
		b.buy(tv);	
		b.buy(com);
		
		System.out.println("현재 남은 돈은"+b.money+"만원입니다.");
		System.out.println("현재 보너스 점수는"+b.bonusPoint+"점 입니다.");
		

	}

	

}
