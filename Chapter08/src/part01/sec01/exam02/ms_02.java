package part01.sec01.exam02;

import java.util.Scanner;

public class ms_02 {


	public static void main(String[] args) {
	  
		 @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in); //�ǹ�)��ĳ�� �ݾҴµ� �� ����������	
		 
		 int i;
		 int inwon;
		 
		 
		 System.out.print("�ο����� �Է� : ");	 
		 inwon = s.nextInt();
		 String name[]=new String[inwon]; //�ο�����ŭ�� �迭�����ϱ����� 
		                                   // ex)�ο���5 �迭[5] 0,1,2,3,4
		
		 
		 for(i=0;i<name.length;i++) { //�ǹ�)name.length�� ��=>�迭.length�� �迭�� ���� 
		  		  
		  System.out.printf("%d��° �̸�:",i+1);
		  name[i]=s.next();		  
		  
		 }
		 for(i=0;i<name.length;i++) {
			 System.out.printf("%d��° �̸��� %s�� �Դϴ�.\n",i+1,name[i]);//�ǹ�)���� for������ �ݺ������ʴ�����
			                                                         //���ھ��� �̸����� ��� �̸���������̶�
		 }
		  
		 s.close();
		
	}

}
