package part01.sec03.exam01;

import java.util.Scanner;

class Member{
	private String name;
	private String tel;
	
	Member(String name,String tel){
		this.name=name;
		this.tel=tel;
	}
	
	public void setTel(String tel) { //��ȭ��ȣ�� �ٲٴ� �뵵�� ����� ������
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	void disp() {
		System.out.println(name+"���� ��ȭ��ȣ��"+tel+"�� �Դϴ�.");
	}
	
}

public class Exam_08 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.print("ȸ������ �Է� : ");
		 int inwon=s.nextInt();
		 //int arr[]=new int[3]  ��ƮŸ�Թ迭�� ������ �� 
		 Member mb[]=new Member[inwon];// Ŭ���� �迭 ���� (Ŭ����Ÿ�� �迭�� ��ü����) // �迭��ũ�Ⱑ ex)3
		 //������ ����ذ� // ũ�⸦�������
         for(int i=0;i<inwon;i++) {// �Է�����
        	System.out.println(i+1+"��° �̸� :"); 
        	String name = s.next(); 
        	System.out.println(i+1+"��° ��ȭ��ȣ :");
        	String tel = s.next();
        	  // mb[i](name,tel); 
            mb[i]=new Member(name,tel); //��ü����  (�迭 ũ��¸�������� ��ü�� �� ����������) ���� ���������� �ȵǱ⶧���� new Meber�� ��ü�����ؼ� ����
         } // new Meber�θ����� ��ü���ּҰ� mb[i](����)���� �� ���°�
             
         for(int i=0;i<inwon;i++) {// �������
                  mb[i].disp();
        	 
         }
         s.close();
	}

}
