package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		//�迭 for�����
		int[] aa=new int[4];
		
		int hap;
		int i;
		
		for(i=0;i<=3;i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���:",i+1); //+1������ ��������ֱ����ؼ�
			aa[i]=s.nextInt(); 
		}		//i�� ���� [0],[1],[2],[3]
		   
		   
		   hap=aa[0]+aa[1]+aa[2]+aa[3];
		   System.out.printf("�հ�==>%d\n",hap);
		   
		   s.close();
	   
		   

	}

}
