package part01.sec01.exam02;
//�������� �ϽŰ� �������� ��¾˾ƺ���
import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("ù��° ���� �Է�:");
		int su1 = in.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		int su2 = in.nextInt();
		System.out.print("����° ���� �Է�:");
		int su3 = in.nextInt();

		if(su2>=su1 && su2>=su3) { // 2�� 1,3����Ŭ��//213,231
			int imsi=su1; // �ӽ�=1
			su1=su2; // 1=>2 
		    su2=imsi;// 2=>1     //213
		}else if(su3>=su1 && su3>=su2) { // 
			int imsi=su1;//�ӽ�=1
			su1=su3;//1=>3
			su3=imsi;//3=>1 // 321
		}
		
		if (su3>=su2) { //
			int imsi=su2; //
			su2=su3; //
			su3=imsi; 
		}
			/*213 321
			  123 ->x ->132 /123�� �׳���µǴµ��γ�����ȴٰ� ġ��.//
			  231 ->x ->321 /231��? ������̵Ǵ°�.....
			  321 ->o
			  132 ->o	*/			
		 
		
						
		
		     // 213 321 
			//123 231
	System.out.printf("%d >= %d >=%d", su1, su2, su3);// ����������¾˾ƺ���
	in.close();
}
}