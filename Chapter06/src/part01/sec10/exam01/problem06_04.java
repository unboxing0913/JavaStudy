package part01.sec10.exam01;

import java.util.Scanner;

public class problem06_04 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
//		 System.out.print("������ ������ �Է��Ͻÿ�>>");
//		 int su=s.nextInt(); //5
//		 int i,k;
//		 if(su==0) {
//       System.out.println("0���� Ŀ���մϴ�.");
//		 for(i=su;i>0;i--) { // 543210 ��
//			 
//			 }
//			     System.out.print(i); 		 
//		 }
//			for(k=su;k>0;k--) { //��
//				System.out.println(i); 
		 
		 System.out.print("������ ������ �Է��ϼ���>>");
		 int a = s.nextInt();
		 if (a <= 0) {
			 System.out.println("0���� Ŀ���մϴ�.");
		 }                     //ex)�Է°�5 i�� ==>5 
		 for (int i = a; i>0; i--) { //54321
			 for(int j=0; j<i; j++) {    //12345
				System.out.print('*');}
				System.out.println();
		 
              s.close();
	           }
		 
}
}

//�ݺ��� ��øfor ���, if�����
// *���
// �Էµ� ������ ���ڿ� ���߾� ������ ����Ͽ�����
// ��, 0�� �ԷµǸ� '0���� Ŀ���մϴ�.'��� �޽����� ��µǰ��Ѵ�.