package part01.sec10.exam01;

import java.util.Scanner;

public class ms_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ���>>");
        int a = s.nextInt();
        int i,j; 
        if (a==0) {
        	System.out.print("0���� Ŀ���մϴ�");       
        }
        for (i=1;i<=a;i++) { //a������ ex)5������ //i => 012345
           for(j=1;j<=i;j++) { //�̰���ü�� �ټ������� //012345
        	   
        	   System.out.print('*');
             	   
          }
               System.out.println();
           
           }
        
        
        }
	}


//�ݺ��� ��øfor ���, if�����
//*���
//�Էµ� ������ ���ڿ� ���߾� ������ ����Ͽ�����
//��, 0�� �ԷµǸ� '0���� Ŀ���մϴ�.'��� �޽����� ��µǰ��Ѵ�.