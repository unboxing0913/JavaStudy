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
	int i=0;//�޼ҵ� �ۿ� �ε������� ��������� �޼ҵ� ȣ���Ҷ����� 
	
	Product2[] item=new Product2[10];//product2�� �迭 (������ ��ǰ�� �����ϱ����� ��������[�迭])
	
	void buy(Product2 p) { 
		
		if(money<p.price) { 
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}else {
		    money-=p.price;
		    bonusPoint+=p.bonusPoint;			   
		    item[i++]=p;// �ε����ȿ��� ������ ���밡��
		    System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		}
	}
	
	void summary() {
		int sum=0;
		String itemList=" ";
		for(int i=0;i<item.length;i++) {//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
			if(item[i]==null) {
				break;
			}else {
				sum+=item[i].price; //item �迭�� .(��Ʈ) price ��
				itemList+=item[i]+",";//���
			}
			System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���"+sum+"���� �Դϴ�.");
			System.out.println("�����Ͻ� ��ǰ��"+itemList+"�Դϴ�.");
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
