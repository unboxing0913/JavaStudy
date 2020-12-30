package part01.sec02.exam02;

public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj; //변수선언
		obj=new GoodsStock(); // 나중에 새로운객체선언
		obj.goodsCode="52135";
		obj.stockNum=200;
		
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고수량:"+obj.stockNum);
		obj.addStock(1000);
		//obj.subtractStock(500); // 재고초기화 시키는것?
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고수량:"+obj.stockNum);
		
	}

}
