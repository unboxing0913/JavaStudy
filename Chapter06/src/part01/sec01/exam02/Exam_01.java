package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int su;
		 int i;
		 System.out.print("������ ���� �Է�:");
		 su=s.nextInt();
         
		 System.out.print(su+"�� ���:"); // ��� : ������ �������¼�
		 
		 for(i=1;i<=su/2;i++) { //�ٽ�Ǯ���
			              //
			 if(su%i==0) {
				 			  
			 System.out.print(i+",");
		 } s.close();
		 
		 }
             System.out.println(su);//�ڱ��ڽ� ������ ����. 
            
	}

}
