package part01.sec02.exam04;

public class GoodsStock {

	String goodsCode;  
    int stockNum;      

    GoodsStock(String goodsCode,int stockNum){
	 this.goodsCode=goodsCode;
	 this.stockNum=stockNum;
}
	
	
void addStock(int amount) { 
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
