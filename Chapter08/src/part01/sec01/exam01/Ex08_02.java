package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//�迭        //new => �޸��� ���� ���ο���� �����.
		int[] aa=new int[4]; //0,1,2,3 = 4��  
		//int aa[]=new int[4]; �̰͵� ����
		int hap;
		
		System.out.print("1��° ���ڸ� �Է��ϼ���: ");
		aa[0]=s.nextInt(); //0���ͽ��� �迭���׻� ��ġ������ ���
		System.out.print("2��° ���ڸ� �Է��ϼ���: ");
		aa[1]=s.nextInt();
		System.out.print("3��° ���ڸ� �Է��ϼ���: ");
		aa[2]=s.nextInt();
		System.out.print("4��° ���ڸ� �Է��ϼ���: ");
		aa[3]=s.nextInt();
		
		hap=aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("�հ�==>%d\n",hap);
	    //���� 100���� ������ �����Ѵٸ�?
		s.close();

	}

}
