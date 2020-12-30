package controller; /*Ŭ�������� ����*/

import java.util.ArrayList;

import model.dao.CoffeeDao;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	
	private Coffee[] orderArr; /*Ŀ��Ŭ������ �迭*/
	private ArrayList<Coffee> orderList; // �ֹ� ����Ʈ  Collection:list , set , map
	private CoffeeDao coDao; // �ֹ� ������ ����, �ҷ��� ��ü 
	 
	public CoffeeManager() {
		orderArr=new Coffee[10];
		coDao=new CoffeeDao();
		//orderList=new ArrayList<Coffee>();
		orderList=coDao.openList(); //CoffeeDao�� ����Ǿ��ִ� �޼ҵ�ȣ��	
	}
	
	public Coffee insertCoffee(Coffee coffee) { //�ֹ�����(�ֹ����ִ´�)		

		coffee.setOrderNo(orderList.size()+1); //��µǴ°ź���
		orderList.add(coffee);
		return coffee;
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException  { //�ֹ�����Ȯ��
		if(orderNo > orderList.size()) {
			throw new CoffeeException("�߸��� �ֹ� �����Դϴ�.");
			//����ȣ�� �ƴѼ��� �Է����� ���Ǵ� ��
		}
		
		return orderList.get(orderNo-1); // orderNo�� �ε�����ȣ�� ���⶧��		
	}
	
	public void updateCoffee(int orderNo,Coffee coffee) { //����
		coffee.setOrderNo(orderNo); 
		orderList.set(orderNo-1, coffee); //
	}
	
	public void deleteCoffee(int idx) {
	    orderList.remove(idx); 
	    
	    
	    if(idx != orderList.size()) {
			for(int i=idx;i<orderList.size();i++) {
				//updateCoffee(idx+1,orderList.get(i)); ��
				orderList.get(i).setOrderNo(i+1);		   //�� Coffee�� ���� setOrderNo�� ����
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
		coDao.saveList(orderList); //orderList�� ������ saveList�γѰ� ���Ͽ� �����Ѵ�.
	}
	
	public void deleteCoffeeAll() {
		orderList.removeAll(orderList);
	}
	
}
