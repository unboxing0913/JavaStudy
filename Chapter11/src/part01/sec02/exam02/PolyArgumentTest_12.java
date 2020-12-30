package part01.sec02.exam02;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}	
	Product2(){
		price=0;
		bonusPoint=0;
	}
	
}
/////////////////////////////////////////////
class Tv2 extends Product2{
    	
	Tv2() {
		super(100);
		
	}
	
	public String toString() {		
		return "Tv";		
	}
	
}
/////////////////////////////////////////////
class Computer2 extends Product2{
	
	Computer2(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
	
}
///////////////////////////////////////////////
class Audio extends Product2{
	
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
	
}
////////////////////////////////////////////
class Buyer2{
	int money=1000;
	int bonusPoint=0;
	int i=0;//메소드 밖에 인덱스값을 설정해줘야 메소드 호출할때마다 
	
	Product2[] item=new Product2[10];//product2의 배열 (구입한 제품을 저장하기위한 공간선언[배열])
	
	void buy(Product2 p) { 
		
		if(money<p.price) { 
			System.out.println("잔액이 부족합니다.");
			return;
		}else {
		    money-=p.price;
		    bonusPoint+=p.bonusPoint;			   
		    item[i++]=p;// 인덱스안에서 증감식 적용가능
		    System.out.println(p+"을/를 구입하셨습니다.");
		}
	}
	
	void summary() {
		int sum=0;
		String itemList=" ";
		for(int i=0;i<item.length;i++) {//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
			if(item[i]==null) {
				break;
			}else {
				sum+=item[i].price; //item 배열의 .(도트) price 값
				itemList+=item[i]+",";//목록
			}
			System.out.println("구입하신 물품의 총 금액은"+sum+"만원 입니다.");
			System.out.println("구입하신 제품은"+itemList+"입니다.");
		}
	}
}


/////////////////////////////////////////////

public class PolyArgumentTest_12 {

	public static void main(String[] args) {
		Buyer2 b=new Buyer2();
		Tv2 tv=new Tv2();
		Computer2 com=new Computer2();
		Audio audio=new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
		

	}

}
