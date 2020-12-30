package part01.sec02.exam03;

public class FruitSeller { // (사과)과일 장수
       int numOfApple=20;                    // 클래스를 선언하면서 값을 미리준경우
       int myMoney=0;
       final int APPLE_PRICE=1000;       //자바에서의 final은 변수의 값이들어가면 수정불가(일반변수와 구분하기위해서 대문자로씀)관례
                    //사과1개의가격
       
       public int saleApple(int money) { //사과를 판매하는 행위
                int num=money/APPLE_PRICE; //갯수를 저장하기위함  	  :/1000을쓰는것은 좋은방법이아니다 
                numOfApple-=num;
                myMoney+=money;             
                return num;
                
       }
       
       public void showSaleResult() {  // 판매를 끝나고나서 보고
    	   System.out.println("남은 사과: "+numOfApple);
    	   System.out.println("판매 수익: "+myMoney);
       }

}
