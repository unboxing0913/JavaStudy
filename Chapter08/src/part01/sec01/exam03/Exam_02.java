package part01.sec01.exam03;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		
		disp();
			
		output(10,20,30);
		
		
		int sum=hap(10,20);//30
		System.out.println("sum="+sum);
		
		
		int su1=input();
		int su2=input();
		
		
		int su3=hap(su1,su2);
		output(su1,su2,su3);
		
		
	}
	
	public static void disp() {// ��ȯ���� ���� �Ű������� ���� ���
		System.out.println("2020.09.10�� �޼ҵ� ������....");
	}
	
	public static void output(int a,int b,int c) { //��ȯ���� ���� �Ű������� �ִ� ���
		System.out.printf("%d + %d = %d\n",a,b,c);
	}
	
	public static int hap(int a,int b) {//��ȯ���� �ְ� �Ű������� �ִ°��
		
		return a+b; // ex)10,20 �Z���� 30
	}
	
	public static int input() { //��ȯ���� �ְ� �Ű������� ���°��
		Scanner in=new Scanner(System.in);
		System.out.print("���� �Է� : ");
	    int su=in.nextInt();	    
	    //in.close(); �ι����� ȣ���߱� ������ ���⼭ ���� : ����ȣ���Ҷ� Scanner �����ʱ�
	    return su;
	    
	}

}
