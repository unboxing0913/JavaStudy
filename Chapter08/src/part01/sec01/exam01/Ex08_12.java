package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 char[] stack=new char[5];
		 int top=0;
		 char carName='A';
		 int select=0;
		 
		 while(select != 3) {  // 3�̸� �ݺ��� ������� �����̱⶧���� 
			 System.out.printf("<1>�ڵ��� �ֱ�|<2>�ڵ��� ����|<3>��     :");
			 select=s.nextInt();
			 
			 switch(select) {
			 case 1:
				 
				 if(top>=5) {//5�������
					 System.out.printf("�ͳ��� ������ ���� �� ��\n");
				 }else {
					 stack[top]=carName++;
					 System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
					 top++;
				 }
				 break;
				 
			 case 2:
				 
				 if(top <= 0) {
					 System.out.printf("�������� �ڵ����� ����\n");
				 }else {
					 top--;
					 System.out.printf("%c�ڵ����� �ͳο��� ����\n",stack[top]);
					 stack[top]=' ';
				 }
				 break;
				 
			 case 3:
				 
				 System.out.printf("���� �ͳο� %d�밡 ����.\n",top);
				 System.out.printf("���α׷��� �����մϴ�.\n");
			     break;
			 default:
				 System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���\n");
			 }
		 }
                   s.close();
	}

}
