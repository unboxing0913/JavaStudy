package part01.sec01.exam01;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int row,col;
//		int n=0;
//		System.out.print("행 개수를 입력: ");
//		row =s.nextInt();
//		System.out.print("열 개수를 입력: ");
//		col=s.nextInt();
//
//		//int[][] aa=new int[3][5]; //고정 크기(정적 할당)
//		int[][] aa =new int[row][col]; //실행시 메모리 크기 할당(동적 할당)
//		System.out.printf("aa[1][1]부터 aa[%d][%d]까지 출력\n",row,col);
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
		System.out.print("행 개수를 입력: ");
		row =s.nextInt();
		System.out.print("열 개수를 입력: ");
		col=s.nextInt();

		//int[][] aa=new int[3][5]; //고정 크기(정적 할당)
		int[][] aa =new int[row][col]; //실행시 메모리 크기 할당(동적 할당)		
		
		for(int i=0;i<row;i++) {
			   	   
			for(int j=0;j<col;j++) {
				aa[i][j]=n;
				n++;
				
				
			}
		}
		
		System.out.printf("aa[1][1]부터 aa[%d][%d]까지 출력\n",row,col);
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.printf("%3d",aa[i][j]);
			}
			System.out.println();
		}
		s.close();
		
		
	}

}
