package part01.sec01.exam02;

import java.util.Scanner;

public class ms_04 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("���� ������ �Է�: ");
		 int su=s.nextInt();
		 boolean room[]=new boolean[su]; //�Խ�/��� => �ΰ�
		 
		 while(true) {
		 System.out.print("1.�Խ� |2.��� |3.���� |4.����");
		 int select=s.nextInt();
		 
		 if(select==4) {
			 break;
		 }
		 
		 int num;
		 boolean tt=true;
		 
		 switch(select) {
		 
		 case 1:
			     do{
			    	System.out.print("�Խ��Ͻ� ���� ��ȣ�� �Է� : ");
			    	num=s.nextInt();
			    	if(num<1 || num>room.length){
			    		System.out.printf("%dȣ���� ���������ʽ��ϴ�.\n",num);
			    	}else {
			    	 tt=false;
			    	}
			     }while(tt);
			    
			     if(room[num-1]) {//room[num-1] ���(���°��)   \ //room[su] ==> ���ǹ��� �� �����Ϸ�������
			    	 System.out.printf("%dȣ���� ���� ����� �Դϴ�.\n",num);
			     }else {
			    	 System.out.printf("%dȣ�ǿ� �Խ��ϼ̽��ϴ�.\n",num);
			    	 room[num-1]=true;
			     }break;
			 
			 
		 case 2:
			    do {
			    	System.out.println("����Ͻ� ���� ��ȣ�� �Է� : ");
			    	num=s.nextInt();
			    	if(num<1||num>room.length) {
			    		System.out.printf("%dȣ���� �������� �ʽ��ϴ�.\n",num);
			    	}else {
			    		tt=false;
			    	}
			    }while(tt);
			    
			    if(room[num-1]) {		    	
			    	System.out.printf("%dȣ�ǿ��� ����ϼ̽��ϴ�.\n",num);
			    	room[num-1]=false;
			    }else {
			    	System.out.printf("%dȣ���� ����Դϴ�.\n",num);
			    }break;
			 
		 case 3:
			 for(int i=0;i<room.length;i++) {
				 if(room[i]==true) {
					 System.out.printf("%d������ ������Դϴ�.\n",i+1);
				 }else {
					 System.out.printf("%d������ ����Դϴ�.\n",i+1);
				 }
			 }
		default:
			
		
		 }		 
		 }
		  System.out.println("���α׷��� �����մϴ�.");
		  s.close();
	}

}
