package model.vo;

public class Drink {
	private int orderNo; // 음료 주문 번호
	private String drinkName; // 음료 명
	private int price; // 가격
	private int cups; // 잔의 수
	
	public Drink() {
		
	}
	public Drink(int orderNo,String drinkName,int price,int cups) {
		super(); // Object의 생성자 : 기본생성자기때문에 안써도됨 (복습용)
		this.orderNo = orderNo;
		this.drinkName = drinkName;
		this.price = price;
		this.cups = cups;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCups() {
		return cups;
	}
	public void setCups(int cups) {
		this.cups = cups;
	}
	public String toString() {
		return "Drink [orderNo="+orderNo+", dirnkName="+drinkName+", price="+price+", cups="+cups+"]";
	}
	
	
	
	
	

}
