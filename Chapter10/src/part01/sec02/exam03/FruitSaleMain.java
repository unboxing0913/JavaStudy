package part01.sec02.exam03;

public class FruitSaleMain {

	public static void main(String[] args) {
		       FruitBuyer buyer = new FruitBuyer();          //������ ��üȭ
		       FruitSeller seller = new FruitSeller();       //�Ǹ��� ��üȭ
		       
		       buyer.buyApple(seller, 2000);	 // buyerAplle �޼ҵ忡 seller ������ֱ⶧����   (���۰��˸� ����)    
		       
               System.out.println("���� �Ǹ����� ���� ��Ȳ");
               seller.showSaleResult();
               
               System.out.println("���� �������� ���� ��Ȳ");
               buyer.showBuyResult(); 

	}



}
