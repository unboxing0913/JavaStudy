package part01.sec01.exam01;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		int a,b;
		int result;
		
		Scanner s=new Scanner(System.in);
		//System.out.println("ù��° ����� ���� �Է��ϼ��� ==>");
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>"); //����
		a=s.nextInt();
		//System.out.println("�ι�° ����� ���� �Է��ϼ��� ==>");
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");
		b=s.nextInt();
		
		result=a+b;
        System.out.println(a+"+"+b+"="+result);//��ȣ���ǳ������
		
        result=a-b;
		System.out.println(a+"-"+b+"="+result);//��ȣ���ǳ������
		
		result=a*b;
		System.out.println(a+"*"+b+"="+result);//��ȣ���ǳ������
		
		result=a/b;
		System.out.println(a+"/"+b+"="+result);//��ȣ���ǳ������
		
		s.close();
	
	}

}
