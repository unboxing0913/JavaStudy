package part01.sec02.exam03;

public class FruitBuyer { // (사과구매자)고객
      int myMoney=5000;
      int numOfApple=0;
      
      public void buyApple(FruitSeller seller,int money) { //사과를 구매하는 행위  (연결,돈)
    	  numOfApple+=seller.saleApple(money); //사과 구매 사과장수의 메소드호출
    	  myMoney-=money; // 돈나감
    	  
      }
      
      public void showBuyResult() {
    	  System.out.println("현재 잔액 : "+myMoney);
    	  System.out.println("사과 개수 : "+numOfApple);
      }
      
	

}
