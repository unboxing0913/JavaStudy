package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int row,col;
//		int n=0;
//		System.out.print("�� ������ �Է�: ");
//		row =s.nextInt();
//		System.out.print("�� ������ �Է�: ");
//		col=s.nextInt();
//
//		//int[][] aa=new int[3][5]; //���� ũ��(���� �Ҵ�)
//		int[][] aa =new int[row][col]; //����� �޸� ũ�� �Ҵ�(���� �Ҵ�)
//		System.out.printf("aa[1][1]���� aa[%d][%d]���� ���\n",row,col);
//		for(int i=0;i<row;i++) {
//			   	   
//			for(int j=0;j<col;j++) {
//				n++;
//				
//				System.out.printf("%3d",n);
//			}System.out.println();
//		}
		
		int row,col;
		int n=1;
		System.out.print("�� ������ �Է�: ");
		row =s.nextInt();
		System.out.print("�� ������ �Է�: ");
		col=s.nextInt();

		//int[][] aa=new int[3][5]; //���� ũ��(���� �Ҵ�)
		int[][] aa =new int[row][col]; //����� �޸� ũ�� �Ҵ�(���� �Ҵ�)		
		
		for(int i=0;i<row;i++) {
			   	   
			for(int j=0;j<col;j++) {
				aa[i][j]=n;
				n++;
				
				
			}
		}
		
		System.out.printf("aa[1][1]���� aa[%d][%d]���� ���\n",row,col);
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.printf("%3d",aa[i][j]);
			}
			System.out.println();
		}
		s.close();
		
		
	}

}
