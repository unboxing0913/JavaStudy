package part01.sec01.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  int start,end;
		  int basu;
		  int hap=0;
		  int i;
		  
		  			  
		  System.out.print("�հ��� ���۰�==>"); //ó���� ==>�� ���� �����ϸ鼭 �������� ������Ǵ°� ã�°Ը�ǥ
		  start = s.nextInt();
		  
		  System.out.print("�հ��� ����==>"); // ������� ���°� (��ǥ��)
		  end= s.nextInt();
		  
		  System.out.print("���==>");
		  basu= s.nextInt();
				
		  i=start;//�����غ��� i�� start�� 
		  
		  while(i<=end) {
			   // end���� ����			 
			  i++;	  
			  if(i%basu==0) 
				  hap=start+i;				
			  
				  			 			  
			  
		  }  System.out.printf("%d���� %d������ %d����� �հ�==>%d\n",start,end,basu,hap);
		      s.close();
			  
		  
	}

}
