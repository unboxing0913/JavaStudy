package controller; /*클래스들을 제어*/

import java.util.ArrayList;

import model.dao.CoffeeDao;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	
	private Coffee[] orderArr; /*커피클래스의 배열*/
	private ArrayList<Coffee> orderList; // 주문 리스트  Collection:list , set , map
	private CoffeeDao coDao; // 주문 정보를 저장, 불러올 객체 
	 
	public CoffeeManager() {
		orderArr=new Coffee[10];
		coDao=new CoffeeDao();
		//orderList=new ArrayList<Coffee>();
		orderList=coDao.openList(); //CoffeeDao에 저장되어있는 메소드호출	
	}
	
	public Coffee insertCoffee(Coffee coffee) { //주문정보(주문을넣는다)		

		coffee.setOrderNo(orderList.size()+1); //출력되는거보임
		orderList.add(coffee);
		return coffee;
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException  { //주문내역확인
		if(orderNo > orderList.size()) {
			throw new CoffeeException("잘못된 주문 정보입니다.");
			//대기번호가 아닌수가 입력됬을때 사용되는 곳
		}
		
		return orderList.get(orderNo-1); // orderNo를 인덱스번호로 쓰기때문		
	}
	
	public void updateCoffee(int orderNo,Coffee coffee) { //수정
		coffee.setOrderNo(orderNo); 
		orderList.set(orderNo-1, coffee); //
	}
	
	public void deleteCoffee(int idx) {
	    orderList.remove(idx); 
	    
	    
	    if(idx != orderList.size()) {
			for(int i=idx;i<orderList.size();i++) {
				//updateCoffee(idx+1,orderList.get(i)); ★
				orderList.get(i).setOrderNo(i+1);		   //★ Coffee의 각각 setOrderNo를 수정
			}
		}	
	}
	
	
	
	public ArrayList<Coffee> getOrderList(){
		return orderList;
	}
	
	public void setOrderList(ArrayList<Coffee> orderList) {
		this.orderList = orderList;
	}
	
	public void close() {
		coDao.saveList(orderList); //orderList의 정보를 saveList로넘겨 파일에 저장한다.
	}
	
	public void deleteCoffeeAll() {
		orderList.removeAll(orderList);
	}
	
}
