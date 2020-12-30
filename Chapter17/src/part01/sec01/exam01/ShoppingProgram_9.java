package part01.sec01.exam01;

import java.util.LinkedList;

class CartItem{ //��ٱ��� ��ǰ �׸� Ŭ����
	String code; // ��ǰ�ڵ�
	int num; // ����
	int price; // �ܰ�
	
	CartItem(String code,int num,int price){
		this.code=code;
		this.num=num;
		this.price=price;
		
	}

	public String getCode() {
		return code;
	}



	public int getNum() {
		return num;
	}


	public int getPrice() {
		return price;
	}


}

public class ShoppingProgram_9 {

	public static void main(String[] args) {
		LinkedList<CartItem> list=new LinkedList<CartItem>();
		list.add(new CartItem("50001",2,2000));
		list.add(new CartItem("573505",1,7000));
		list.add(new CartItem("88012",3,25000));
		list.remove(1);
		
		System.out.println("��ǰ�ڵ�\t\t ���� \t ����");
		System.out.println("-------------------------------------");
       
		
		for(int i=0;i<list.size();i++) {
        System.out.println("��ǰ�ڵ� "+list.get(i).getCode()+"\t���� "+list.get(i).getNum()+"\t���� "+list.get(i).getPrice()); 
        }
        System.out.println("-------------------------------------");
       
        
        
        for (CartItem n : list) {
        	System.out.println("��ǰ�ڵ� "+n.getCode()+"\t���� "+n.getNum()+"\t���� :"+n.getPrice());
        }
        
        
 	}

}
