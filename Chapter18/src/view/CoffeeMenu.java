package view;

import java.util.Scanner;

import controller.CoffeeManager;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeMenu {

	public static CoffeeManager cm = new CoffeeManager();
	
	public static void showMenu() { //Ŀ�� �ֹ� ȭ��
		Scanner sc = new Scanner(System.in);
		
	    do {
	    	initMenu(3.0);/*�չ�ȣ�� ū������Ʈ   �Ҽ����� ����������Ʈ*/
	    	System.out.println("�޴� Ȯ�� : ");
	    	int sel = sc.nextInt();
	    	
	    	switch(sel) {
	    	case 1:
	    		insertCoffee();
	    		break;
	    	case 2:
	    		selectCoffeeOne();
	    		break;
	    	case 3:
	    		updateCoffee();
	    		break;
	    	case 4:
	    		deleteCoffee();
	    		break;
	    	case 5:
	    		selectCoffeeAll();
	    		break;
	    	case 6:
	    		System.out.print("���� �����Ͻðڽ��ϱ�? (Y/N) : ");
	    		if(sc.next().toUpperCase().charAt(0)=='Y') {
	    		cm.close(); // ������ �������
	    		return;	    		
	    		}else {
	    			System.out.println("�޴��� �ٽ� �ҷ� �ɴϴ�.");
	    			//continue;
	    		}
	    	case 7:
	    		System.out.println("������ �ʱ�ȭ �Ͻðڽ��ϱ�? (Y/N): ");
	    		
	    		if(sc.next().toUpperCase().charAt(0)=='Y') {
		    		cm.deleteCoffeeAll();
		    		System.out.println("�ʱ�ȭ �Ǿ����ϴ�.");		
		    		}
		    		System.out.println("�޴��� �ٽ� �ҷ� �ɴϴ�.");
		    
	    	}
	    	
	    }while(true);
	}

	public static void initMenu(double version) {
		System.out.println("==�浿���� Ŀ�� �������� ����" + version + "==");
		System.out.println("------------------------------");

		System.out.println("1. Ŀ���ֹ� ");
		System.out.println("2. �ֹ� ��ȣ Ȯ�� ");
		System.out.println("3. �ֹ� ���� ���� ");
		System.out.println("4. �ֹ� ��� ");
		System.out.println("5. �ֹ� ��ü ���� Ȯ��");
		System.out.println("6. ���α׷� ����.");
		System.out.println("7. �ֹ� ��ü �ʱ�ȭ");

	}

	public static void insertCoffee() {
		Scanner sc = new Scanner(System.in);
       
		System.out.println("----�޴�----");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. īǪġ��");

		System.out.println("�޴� Ȯ�� : ");
		int sel = sc.nextInt();
		
		if(sel<4 && sel>0) {
		System.out.print("�ֹ� �� �� : ");
		int cups = sc.nextInt();

		System.out.println("�ֹ� ���� Ȯ�� : ");
		System.out.println(cm.insertCoffee(new Coffee(sel, cups)));
        } else {
		System.out.println("�߸��� �޴� ��ȣ�Դϴ�.");
        }
	}

	public static void selectCoffeeOne() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹ� ��ȣ Ȯ�� : ");
		int orderNo = sc.nextInt();
		try {
			System.out.println("���� �ֹ� ���� : ");
			System.out.println(cm.verifyCoffee(orderNo));
		} catch (CoffeeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void updateCoffee() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("�ֹ� ��ȣ Ȯ�� : ");
		int orderNo = sc.nextInt();
		
		try {                           /*�ֹ���ȣ�� �ְ���*/
		System.out.println("�ֹ� ���� Ȯ�� : ");
		System.out.println(cm.verifyCoffee(orderNo));
		
		
		System.out.println("1.�߰� , 2.����");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("----�޴�----");
			System.out.println("1. �Ƹ޸�ī��");
			System.out.println("2. ī���");
			System.out.println("3. īǪġ��");
			/**/
			System.out.println("�޴� Ȯ�� : ");
			int sel2=sc.nextInt();
			System.out.print("�ֹ� �� �� : ");
			int cups2=sc.nextInt();		
			
			//cm.updateCoffee(orderNo-1,new Coffee(sel2,cups2));
			
			break;
		case 2:
			System.out.println("----�޴�----");
			System.out.println("1. �Ƹ޸�ī��");
			System.out.println("2. ī���");
			System.out.println("3. īǪġ��");
			
			System.out.println("�޴� Ȯ�� : ");
			int sel=sc.nextInt();
			System.out.print("�ֹ� �� �� : ");
			int cups=sc.nextInt();		
			
			cm.updateCoffee(orderNo,new Coffee(sel,cups));
			break;
		}		
								
	}catch(CoffeeException e) {
		System.out.println(e.getMessage());
		
	}
	}
	
	public static void deleteCoffee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹ� ��ȣ Ȯ�� :");
		int orderNo = sc.nextInt();	
		try{
			System.out.println("�ֹ� ���� Ȯ�� : ");
			System.out.println(cm.verifyCoffee(orderNo));
			System.out.println("���� ����Ͻðڽ��ϱ�? (Y/N)");
			
			/*nextLine ����Ű������ , next ����������*/
			if(sc.next().toUpperCase().charAt(0)=='Y') {//
				cm.deleteCoffee(orderNo-1);//	
				
				
				
//				for(int i=0;i<cm.getOrderList().size();i++) {
//					cm.updateCoffee(i,cm.getOrderList().get(i));
//				}              //��
				
				System.out.println("�ֹ��� ���������� ��ҵǾ����ϴ�.");
				
			}else{
				System.out.println("�������� ���ư��ϴ�.");
			}
		}catch(CoffeeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void selectCoffeeAll() {
		for(Coffee co: cm.getOrderList()) {
			System.out.println(co);
		}
	}

	
	
}
	

