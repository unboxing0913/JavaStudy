package part01.sec01.exam02;

class GoodsStock{
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode,int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString(){
		return "상품코드 :"+goodsCode+"재고수량:"+stockNum;
	}
}

public class ObjectExample2_1 {

	public static void main(String[] args) {
		GoodsStock obj=new GoodsStock("57923",100);
       // String str=obj.toString(); // 객체를 문자열로받아보고싶다
		String str="재고정보:"+obj;//오버라이딩 해놧기 때문에 toString();안해도 출력이됨
        System.out.println(str);// 상품코드:57923 재고수량:100
        System.out.println(obj);
	}

}
