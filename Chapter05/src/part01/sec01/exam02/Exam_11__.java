package part01.sec01.exam02;

import java.util.Scanner;
//�����Ѱ� 20 10 30 �ȵ�
public class Exam_11__ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("ù��° ���� �Է�:");
		int su1 = in.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		int su2 = in.nextInt();
		System.out.print("����° ���� �Է�:");
		int su3 = in.nextInt();

		int imsi = 0;
		// 2�� 1����ũ�� 2�� 3����ũ�� ���ϰ�� 213 ������ε� 3�� 1���� Ŭ�������
		
				//su1(30),su2(20),su3(10)
		
		if(su1>=su2 && su1>=su3) { 	//su1�� ���� Ŭ�� //123,132 /su1(30),su2(20),su3(10)
			if(su2<=su3) { //132       ==>su1(30),su2(10),su3(20)
				imsi = su2; 
				su2 = su3;
				su3 = imsi;						//�ƴҶ� 123������ϴ°Ը³�?		
		      	}
		
		else if(su2>=su1 && su2>=su3) {	//2�� ����Ŭ�� su1(20),su2(10),su3(30)
			imsi = su1;
			su1 = su2;  //213
			su2 = imsi;	
			
			if(su2<=su3) {// su1(20),su2(30),su1(10)
				imsi=su2;//����su1�� =su2
				su2=su3;
				su3=imsi;			 			
		      }
		else if(su3>=su1 && su3>=su2) {		//3�� ����Ŭ��
			imsi = su1;     //su1(30),su2(20),su3(10)
			su1 = su3;  //321
			su3 = imsi;
			 
			 if(su3>su2) //312     
				imsi=su3; //su1(30),su2(10),su3(20)
				su3=su2;
				su2=imsi;             //// if(su1>su2) X �ֳĸ� ������ su1=su3���� �مf�⶧���� Su3=su1�̴�.
				                             // �̵� ����� : su1=>�̹� su3���༭ su3�����������ִµ� �̰Թ���
				                        
		}
						
		      
		
		}
	}
		System.out.printf("%d >= %d >=%d", su1, su2, su3);// ����������¾˾ƺ���
		in.close();
		
}
}