package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_18 {  //�ð����� ���� �ٲٱ�

	public static void main(String[] args) {
	      Scanner s=new Scanner(System.in);
	      
	       System.out.print("�ο����� �Է�");		   
	       int inwon=s.nextInt();
	       
	       String name[]=new String[inwon];//�ο��� ��ŭ�� �迭�����
		   
		   for(int i=0;i<name.length;++i){      
		      System.out.print(i+1+"��° �̸�: ");
		      name[i]=s.next(); // nextLine�������� ����Ű���� �ԷµǱ⶧���� next�� ���
		   } 
		   for(int i=0;i<name.length;i++){      
			      System.out.println(i+1+"��° �̸���"+name[i]+"�� �Դϴ�.");
			      
			   } 
		      s.close();
		   
		   		   		   
		
		
	}

}
