package part01.sec02.exam02;
//class ���� ��Ű���ȿ� �����ϸ� ��ü���� ������
public class GoodsStock {

	      String goodsCode;  //obj�� �Ѿ�� => 52135
	      int stockNum;      //obj�� �Ѿ�� =>200

	
	
	
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
