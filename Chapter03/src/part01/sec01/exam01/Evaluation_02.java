package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("�Է����� ����<1>10 <2>16 <3>8 :");
		int a=s.nextInt();
		int data = 0 ;
		System.out.print("�� �Է�:");						
		
		if(a==1){
			String str = s.next();//���ڿ��� �޾ƿͼ�
			data = Integer.parseInt(str,10);//�����Ϳ� ���ڿ��� 10��������
		}else if(a==2) {
			String str = s.next();		
		    data = Integer.parseInt(str,16);//�����Ϳ� ���ڿ���16��������
		}else if(a==3) {
			String str = s.next();		
			data = Integer.parseInt(str,8);//�����Ϳ� ���ڿ��� 8��������
		} 

		s.close();			
		System.out.printf("10����==>%d\n",data);
		System.out.printf("16����==>%x\n",data);
		System.out.printf("8����==>%o\n",data);

}
}