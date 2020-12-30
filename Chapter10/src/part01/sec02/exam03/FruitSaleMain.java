package part01.sec02.exam03;

public class FruitSaleMain {

	public static void main(String[] args) {
		       FruitBuyer buyer = new FruitBuyer();          //구매자 객체화
		       FruitSeller seller = new FruitSeller();       //판매자 객체화
		       
		       buyer.buyApple(seller, 2000);	 // buyerAplle 메소드에 seller 연결되있기때문에   (시작값알면 쉬움)    
		       
               System.out.println("과일 판매자의 현재 상황");
               seller.showSaleResult();
               
               System.out.println("과일 구매자의 현재 상황");
               buyer.showBuyResult(); 

	}



}
