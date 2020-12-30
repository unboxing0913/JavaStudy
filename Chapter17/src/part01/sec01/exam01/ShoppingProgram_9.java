package part01.sec01.exam01;

import java.util.LinkedList;

class CartItem{ //장바구니 상품 항목 클래스
	String code; // 상품코드
	int num; // 수량
	int price; // 단가
	
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
		
		System.out.println("상품코드\t\t 수량 \t 가격");
		System.out.println("-------------------------------------");
       
		
		for(int i=0;i<list.size();i++) {
        System.out.println("상품코드 "+list.get(i).getCode()+"\t수량 "+list.get(i).getNum()+"\t가격 "+list.get(i).getPrice()); 
        }
        System.out.println("-------------------------------------");
       
        
        
        for (CartItem n : list) {
        	System.out.println("상품코드 "+n.getCode()+"\t수량 "+n.getNum()+"\t가격 :"+n.getPrice());
        }
        
        
 	}

}
