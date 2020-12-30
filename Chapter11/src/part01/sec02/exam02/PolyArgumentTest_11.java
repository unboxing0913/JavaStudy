package part01.sec02.exam02;

class Product{
	int price;//��ǰ�� ����
	int bonusPoint;//��ǰ���Ž� �����ϴ� ���ʽ� ����
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);//���ʽ� ������ ��ǰ������ 10%
	}
}
/////////////////////////////////////////////
class Tv extends Product{
    	
	Tv() {
		super(100);
		
	}
	//�ּҰ���� ���ڿ��� ǥ�� (�ڹٿ��� �������ִ� �޼ҵ�)
	public String toString() {//��ü�� �������ִ� ���� ǥ���ϰ������ ���� �޼ҵ�		
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
	
	void buy(Product p) { //������ �θ�Ÿ������ Ŭ�������޴´� (Ŭ����/��������p)
		
		if(money<p.price) { //Ŭ����Ÿ�������� �������� p�� ��ǰ���� p.price
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}else {
		    money-=p.price;
		    bonusPoint+=p.bonusPoint;
		    System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
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
		
		System.out.println("���� ���� ����"+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ� ������"+b.bonusPoint+"�� �Դϴ�.");
		

	}

	

}
