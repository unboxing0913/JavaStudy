package part01.sec01.exam01;

import java.util.Scanner;

//10���� %d , 16���� %x , 8���� %o
public class Problem03_01 {

	public static void main(String[] args) {
		
	    int a; //��ǻ�Ͱ� �ڵ����� �������ִϱ� ��������1��
		
	    Scanner s=new Scanner(System.in); //�빮�ڼҹ����� ��������
		                                  // �޾ƿ��� �ϳ����Է�
        System.out.printf("�������Է��ϼ���==>");
		a=s.nextInt();//Ű����κ��� �������ִ� �ڵ�
				
		System.out.printf("10���� ==> %d\n",a);
	
		System.out.printf("16���� ==>%X\n",a); //16������ %x�� �빮�ڷ��ָ� �빮�����
		                                      //�ҹ��ڷ��ָ� �ҹ������
		
		System.out.printf("8���� ==> %o\n",a);
	
		s.close();//scanner �ݾ��ֱ�
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("������ �Է��ϼ���==>");
//		
//		int a=s.nextInt();
//		
//		
//	    System.out.printf("10���� ==>%d\n",a);					
//		System.out.printf("16���� ==>%x\n",a);		
//		System.out.printf("8���� ==>%o\n",a);
//		s.close();
		
		
        
	}

}
