package part01.sec01.exam01;

import java.util.Scanner;

public class Problem05_04 {

	public static void main(String[] args) {
		int user,com;
		Scanner s=new Scanner(System.in);
		
		
		System.out.print("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ���. =>");
		
	    String tmp=s.nextLine(); //���ڿ� �о��
	    
	    user = Integer.parseInt(tmp); //( )�ִ°��� ���ڷιٲ�.
	    //com = Math.random() //���� �߻�(=0~0.99999999~~~) ==> 1�̾ȵ�(0<=����<1)
	    //Math <-���п����õ� Ŭ���� random <-���״�� ����
	    // (0.9999*3 = 2.99997) ==>3�̾ȳ���
	    com = (int)(Math.random()*3)+1; 
	       //�Ҽ�.00���κ��Ҽ��ֵ��� int������ȯ 0,1,2 ������ 3�����ؼ� 3�̾ȳ����⶧���� +1 ������
	    System.out.println("�����"+user+"�Դϴ�.");
	    System.out.println("����"+com+"�Դϴ�.");
	    
	    switch(user-com) {
	    case 0:
	    	System.out.println("�����ϴ�.");
	    	break;
	    case 1:
	    case 2:
	    	System.out.println("�̰���ϴ�.");
	    	break;
	    case -1:
	    case -2:
	    	System.out.println("�����ϴ�.");
	    	break;
	    default:
	    	    }
	    	
 s.close();
//	    if(user>com) {
//	    System.out.println("�̰���ϴ�.");
//	    }else if(user<com) {
//	    System.out.println("�����ϴ�.");
//	    }else {
//	    System.out.println("�����ϴ�.");	
//	    }  //�̰� 9�����ʿ��� ���ڶ� ���ڶ��ٸ��� �ν��� if������ ¥���� �������ڸ� ��� 
	}
	}  



	    	   
	    
	    
	    
	    
	    
	    
   
	      

	


