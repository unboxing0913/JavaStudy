package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 		 
		 System.out.print("�л����� �Է� : ");
		 int inwon=s.nextInt();
		 
		 String name[]=new String[inwon];
		 int kor[]=new int[inwon];
		 int eng[]=new int[inwon];
		 int rank[]=new int[inwon];
		 int tot[]=new int[inwon];
		 
		 for(int i=0;i<name.length;i++) {
			 System.out.printf("%d��° �л��� �̸�:",i+1);
			 name[i]=s.next();
			 
			 System.out.printf("%d��° �л��� ��������",i+1);
			 kor[i]=s.nextInt();
			 System.out.printf("%d��° �л��� ��������",i+1);
			 eng[i]=s.nextInt();
			 
			 tot[i]=kor[i]+eng[i];//�迭��ü�������� for���� ������ �̷��� ���		 
		   }
		   // �ݺ����� �ѹ����������鼭 ����
		 for(int i=0;i<name.length;i++) {
			 rank[i]=1;//1���̶�� ����,����������. �׸��� 1�� ����ʱ�ȭ�����ִ� �ǹ�
			 for(int j=0;j<name.length;j++) {//j�� �����ϰ�(0~?) i�°��0 �������̳����� 1������
				 if(tot[i]<tot[j]) { //�̰��ѹ� �ڼ��������غ��� �������� �Ʒ����� �ݺ��ϸ鼭 ����·�Ʈ��
					 rank[i]++;
				 }			         
		       }		 		   
		    } 
		 for(int i=0;i<name.length;i++) {
			                                      //����� ���� ���ڷ� �����ϸ� ����
	      System.out.printf("%s���� ������ %d�̰�, ������ %d�� �Դϴ�.\n",name[i],tot[i],rank[i]);
	     }
		   s.close();


}
}