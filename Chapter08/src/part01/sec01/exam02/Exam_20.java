package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("���� ������ �Է� : ");
		int roomsu=s.nextInt();
		//booleanŸ���� �⺻���� false
		boolean room[]=new boolean[roomsu]; // ��� :false �����:true
		
		while(true) {
			System.out.print("1.�Խ�|2.��� |3.���� |4.���� : ");
			int select=s.nextInt();
			
			if(select==4) { //��Ǽ��������� �ݺ�������
						break; 
			}
			
			int roomNum;
			boolean check=true;	
			
			switch(select) {
			case 1:
				do {
					System.out.print("�Խ��Ͻ� ���� ��ȣ�� �Է� : ");
					roomNum=s.nextInt(); 
					if(roomNum<1 || roomNum>roomsu) {
				       System.out.println(roomNum+"ȣ���� �����ϴ�.");//1~roomsu���� �游 üũ�Ϸ���
					}else {
						check=false;//�ݺ����� ����������  �����ٰ� �����鼭 �ٽ�true���ֱ⶧���� �������
					}
				}while(check); // do while�� ������ 
				/////////////////////////////////////////////////////////////////////////////
				if(room[roomNum-1]){//��迭�� �ε����ȿ��������� -1 ex)5����=>0,1,2,3,4,5,6 �̱⶧���� -1 ����
					 System.out.println(roomNum+"ȣ���� ���� ����� �Դϴ�.");
				 }else {//�⺻���� false �̱⶧���� false�� ���̾ƴϴϱ�
					 room[roomNum-1]=true;
					 System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
				 }
				 break;
				
			
			
			case 2:
				do {
					System.out.print("����Ͻ� ���� ��ȣ�� �Է� : ");
					roomNum=s.nextInt(); 
					if(roomNum<1 || roomNum>roomsu) {
				       System.out.println(roomNum+"ȣ���� �����ϴ�.");
					}else {
						check=false;//�ݺ����� ����������
					}
				}while(check);
				
				if(room[roomNum-1]) {
					room[roomNum-1]=false;
					System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");	
				}else {					
					System.out.println(roomNum+"ȣ���� ����Դϴ�.");
				}
				break;
						
								
			case 3:
				for(int i=0;i<room.length;i++) {//01234
					if(room[i]) {
						System.out.println(i+1+"���� ����� �Դϴ�.");				   
				}else{					
					System.out.println(i+1+"���� ��� �Դϴ�.");
				 }			
			    }
				break;
			default:
				System.out.println("��ȣ�� �� �� �Է��ϼ̽��ϴ�.");
				
			}
			
		}
          System.out.println("���α׷��� �����մϴ�.");
          s.close();
	}

}
