package part01.sec01.exam01;

import java.util.Scanner;

public class be_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		char space[]=new char[5]; // �ͳΰ�������
		
		int select=0; //while���ȿ� ���ִ� select�� ���̾����� ������ �׷��� �ʱ�ȭ�ϰ����
		char carName='A';		
		int n = 0;
		
		
		while(select !=3 ) { // �ݺ��ؾ��ϴϱ� while���� �ٵ�����
			System.out.print("<1>�ڵ��� �ֱ�|<2>�ڵ��� ����|<3>�� : ");			
			select = s.nextInt();
							
			switch(select) {
			
			
			case 1:
				
				if(n>=space.length) {
					System.out.println("�ͳ��� ������ ���� �� ��");
				}else {		
				space[n]=carName++; //	 space[0]=A++ �ڿ� ++�̱⶧���� ��곡���� ����
				System.out.printf("%c �ڵ����� �ͳο� ��\n",space[n]);// ���ں��Ϸ��� �տ������ �ؿ��� ����̵�
				
				n++;//�ڵ��� ��������� ���ÿ� space �� �ø��� ������ ����
				
				
				}
				break;
				
			case 2:
				if(n<=0) { //0���������� �����������
					System.out.println("�������� �ڵ����� ����");
				}else {
				
				n--;//���� �Է��ؾ��� ������ ����ؾ��ϱ⶧��						
				System.out.printf("%c �ڵ����� �ͳο��� ����\n",space[n]);
				space[n]=carName--;
				
				
				}
				break; // �극��ũ�� else ��ȣ ������ ����� �ȱ׷��� ���̿����� �ȸ��߰� ��µ�
			case 3:
				System.out.printf("���� �ͳο� %d�밡 ����\n",n);
				System.out.println("���α׷��� �����մϴ�."); // ���α׷������ 3�̿������ؾ��� �ȱ׷��� �ݺ��������
			    break;
			    
		    default:
		    	System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���\n");
		    	
			} 
		}	s.close();
		}
			
			
		
		}
		

	
//	 Scanner s=new Scanner(System.in);
//	 char[] stack=new char[5];
//	 int top=0;
//	 char carName='A';
//	 int select=0;
//	 
//	 while(select != 3) {  // 3�̸� �ݺ��� ������� �����̱⶧���� 
//		 System.out.printf("<1>�ڵ��� �ֱ�|<2>�ڵ��� ����|<3>��     :");
//		 select=s.nextInt();
//		 
//		 switch(select) {
//		 case 1:
//			 
//			 if(top>=5) {//5�������
//				 System.out.printf("�ͳ��� ������ ���� �� ��\n");
//			 }else {
//				 stack[top]=carName++;
//				 System.out.printf("%c �ڵ����� �ͳο� ��\n",stack[top]);
//				 top++;
//			 }
//			 break;
//			 
//		 case 2:
//			 
//			 if(top <= 0) {
//				 System.out.printf("�������� �ڵ����� ����\n");
//			 }else {
//				 top--;
//				 System.out.printf("%c�ڵ����� �ͳο��� ����\n",stack[top]);
//				 stack[top]=' ';
//			 }
//			 break;
//			 
//		 case 3:
//			 
//			 System.out.printf("���� �ͳο� %d�밡 ����.\n",top);
//			 System.out.printf("���α׷��� �����մϴ�.\n");
//		     break;
//		 default:
//			 System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���\n");
//		 }
//	 }
//               s.close();
//}
//
//}

