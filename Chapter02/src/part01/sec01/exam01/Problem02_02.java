package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		int a,b;
		int result;
		int k;
		
		Scanner s=new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");//����
		a = s.nextInt();
		System.out.print("<1>���� <2>���� <3>���� <4>������ ==>");//2��° ����->4����
		k = s.nextInt();//k�� 4����
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");//����
		b = s.nextInt();
		
		if(k==1) { // ==�� ���迬���� �����Ķ����°� =�� ���Կ�����[�޸�(����)����=��]
			
			result=a+b;//1�̸� ���ϱ�
			System.out.println(a+"+"+b+"="+result);//����
		}
		if(k==2) {
			result=a-b;//2�� ����
		    System.out.println(a+"-"+b+"="+result);		   		
	}
		if(k==3) {
			result=a*b;//3�̸� ����
		    System.out.println(a+"*"+b+"="+result);	
}
		if(k==4) {
			result=a/b;//4�� ������
		    System.out.println(a+"/"+b+"="+result);	
		    
		
		}
		
		s.close();//��� �� ���� Ȥ�� 1,2,3,4 ���ڰ�������� ����
		
		
//		Scanner s=new Scanner(System.in);
//		int a,b,c;
//		int reslut;
//		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");
//		a=s.nextInt();
//		System.out.print("<1>���� <2>���� <3>���� <4>������==>");//+,-,*,/
//		b=s.nextInt();
//		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");
//		c=s.nextInt();
//		
//		
//		if(b==1) {	
//		    reslut = a+c;
//		    System.out.printf("%d+%d=%d",a,c,reslut);
//		 }else if(b==2){ 
//		    reslut = a-c;
//		    System.out.printf("%d-%d=%d",a,c,reslut);
//		 }else if(b==3) {
//		    reslut = a*c;
//		    System.out.printf("%d*%d=%d",a,c,reslut);		    
//	     }else if(b==4) {
//	        reslut = a/c;
//	        System.out.printf("%d*%d=%d",a,c,reslut);
//	     }
//		    
//		    s.close();
	}
}
