package part01.sec01.exam01;

import java.util.Scanner;

public class Problem04_01 {

	public static void main(String[] args) {
		float a,b,c;
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.printf("ù��° ����� ���� �Է��ϼ��� ==>");//��ĳ�ʾ��� ��������x ��������������
		b=s.nextFloat();// ������float������ nextFloat���
		
		System.out.printf("�ι�° ����� ���� �Է��ϼ��� ==>");
		c=s.nextFloat();
		
		a=b+c;		
		System.out.printf("%5.2f + %5.2f=%5.2f \n",b,c,a);
		
		a=b-c;
		System.out.printf("%5.2f - %5.2f=%5.2f \n",b,c,a);
		
		a=b*c;
		System.out.printf("%5.2f * %5.2f=%5.2f \n",b,c,a);
		
		a=b/c;
		System.out.printf("%5.2f / %5.2f=%5.2f \n",b,c,a);
		
		//a=(int)b%c ����Ŀ��� Ÿ�Թٲ������� ��¿����ٲ� /���ذ���                      (����) 10 + 2 = 0
		//System.out.printf("%2.0f %% %1.0f=%f \n",b,c,a); //a,b,c floatŸ�� ����������
		
		a=(int)b%(int)c; 
		//a=b%c; �������ϸ� ��갡��
		System.out.printf("%d %% %d=%d \n",(int)b,(int)c,(int)a);
        
		System.out.println("a="+a); 
		
        //a=3.5%2.5; //���� �Ǽ�Ÿ���� float�� ���������� ���� double���� (������ ������ ����)
        //���� �����������ڸ� �Ǽ��ξȾ�(����)
		//System.out.println(a);
        s.close();
        
//		Scanner s=new Scanner(System.in);
//		float reslut;
//		
//		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");
//		float a = s.nextFloat();
//		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");
//		float b = s.nextFloat();
//		
//		reslut = a+b;
//		System.out.printf("%5.2f+%5.2f = %5.2f\n",a,b,reslut);
//		reslut = a-b;
//		System.out.printf("%5.2f-%5.2f = %5.2f\n",a,b,reslut);
//		reslut = a*b;
//		System.out.printf("%5.2f*%5.2f = %5.2f\n",a,b,reslut);
//		reslut = a/b;
//		System.out.printf("%5.2f/%5.2f = %5.2f\n",a,b,reslut);
//		
//		reslut = (int)a%(int)b; //
//		System.out.printf("%d%%%d = %d\n",(int)a,(int)b,(int)reslut); //
//		
//		System.out.print("reslut="+reslut); //
//		 s.close();
		
		

	
	
	
	
	
	
	}

}
