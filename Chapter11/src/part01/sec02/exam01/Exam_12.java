package part01.sec02.exam01;

import java.io.IOException;
import java.util.Scanner;

class Member2{
	protected String name; //��ӹ��� �ڽ� Ŭ���������� ���� ���
	protected String tel;
	
	Member2(String name,String tel){
		this.name=name;
		this.tel=tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� "+tel+"�� �Դϴ�.");
	}

}

class Member3 extends Member2{
    
	private String addr;
	
	Member3(String name, String tel,String addr) {
		super(name, tel);
		this.addr=addr;
		
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� "+tel+"���̰�, �ּҴ�"+addr+"�Դϴ�.");
		
	}

}

class MemberPro{
	private Member3 mb[];
	//private int increment=3; �迭�� ũ�⸦ ������Ű���� �뵵
	private int po; //�ε�����
	Scanner s=new Scanner(System.in);
	
	public MemberPro() {
		mb=new Member3[5];
		po=0;
	}
	
	public void input() { // �ڱ����� ���ϸ� �����
		System.out.print("�̸��� �Է� : ");
		String name=s.next();
		System.out.print("��ȭ��ȣ�� �Է�:");
		String tel=s.next();
		System.out.print("�ּҸ� �Է�: ");
		String addr=s.next();	
		mb[po]=new Member3(name, tel, addr); //
		po++; //0���� ��������������� �迭���������ϰ�
		
		/*if(po==mb.length) { // po�� �迭�� ���̿� �������� if������         // mb2�� if���ȿ��� ������⶧���� ������ �����
			Member3 mb2[]=new Member3[mb.length+increment]; //�迭 mb2 ����
			for(int i=0;i<mb.length;i++) {
				mb2[i]=mb[i];
			}	
			                                     //�迭�� ������Ű���������� �ʿ䰡����
			 mb=mb2;//
		  }	 */
	}
	
	public void view() { //���
		for(int i=0;i<po;i++) {
			mb[i].disp();
		}	
	}
	
	public void delete() {//�����ּҸ� �̿��ؼ� ������� ����ó���ؾ���
		System.out.print("������ ȸ���� �̸� : ");
		String name = s.next();
		
		for(int i=0;i<po;i++) { //�Էµ� ����ŭ�� �ݺ�   //po���� 5�����Ǿ ������
			if(mb[i].name.equals(name)) {//�̸� ��		equals		
				for(int j=i;j<po-1;j++) { // �̸��̰�����   // ��ġ�߿��� i�� ��ġ�����
					mb[j]=mb[j+1]; // ���ǰ��� ��ܿ��� �ǹ�    /?:������5�� �Ȱ������� �ߺ��ؼ����°ǰ�?
				}
				    po--;//for������ ��ĭ�� ���ܿ��� �ߺ��� ���������� ���ֱ�����
				    System.out.println(name+"ȸ������ �����Ͽ����ϴ�.");
				    return; //������ ���������� ����
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		
	}
	
	public void edit() {
		
		System.out.println("������ ȸ���� �̸��� �Է�: ");
		String name=s.next();
		
		for(int i=0;i<po;i++) {
			if(mb[i].name.equals(name)) {				
				System.out.println("����"+name+"���� ��ȭ��ȣ��"+mb[i].getTel()+"�� �Դϴ�.");
				System.out.print("������ ��ȭ��ȣ : ");
				String tel=s.next();
				mb[i].setTel(tel);				
			    System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
			    return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}
	  
	public void exit() {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
	}
 
}


public class Exam_12 {

	public static void main(String[] args) throws IOException {
		MemberPro pro=new MemberPro();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� :");
			int select = System.in.read()-48;
			System.in.skip(2);
			
			switch(select) {
			case 1:
				pro.input();
				break;
			case 2:
				pro.view();
				break;
			case 3:
				pro.delete();
				break;
			case 4:
				pro.edit();
				break;
			case 5:
				pro.exit();
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}

}
