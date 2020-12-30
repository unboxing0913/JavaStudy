package part01.sec02.exam02;
//class 같은 패키지안에 존재하면 객체생성 가능함
public class GoodsStock {

	      String goodsCode;  //obj값 넘어옴 => 52135
	      int stockNum;      //obj값 넘어옴 =>200

	
	
	
void addStock(int amount) { // 1000
		stockNum+=amount;
		
	 }
	

int subtractStock(int amount){
		if(stockNum < amount) {
			return 0;			
		}else {
			stockNum=amount;
			return amount;
		}
		
	}

}
