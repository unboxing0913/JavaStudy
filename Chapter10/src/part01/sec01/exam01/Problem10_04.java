package part01.sec01.exam01;

import java.util.Scanner;

class MyName{

	
	private String name;	

	
	MyName(String name){	
	this.name=name; 
		
}

	public String getName(){	
	return name;
}

}



public class Problem10_04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);		
		System.out.print("�̸��� �Է� : ");		
		String name = s.next();
		
		MyName ap=new MyName("ȫ�浿");
		
		if(name.equals(ap.getName())) { // ���ڿ��� equals , private ���������ؾ��ϱ⶧�� getNameȣ��
            System.out.println("�Է��Ͻ� �̸��� �����ϴ�."); 
		}else
			System.out.println("�Է��Ͻ� �̸��� �ٸ��ϴ�.");
        s.close();
	}

	

}
