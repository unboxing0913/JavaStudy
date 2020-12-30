package test02.sungList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungProImpl implements SungPro {
       
	  private ArrayList<SungJuk>list;
	  private Scanner in;
	  
	  public SungProImpl() {
		  list=new ArrayList<SungJuk>();
		  in=new Scanner(System.in);	  
	  }
	 
	  public int inputSub(String str) {
		  int sub;
		  
		  while(true) {
			  System.out.print(str+"������ ������ �Է� :");
			  sub=in.nextInt();
			  if(sub<0 || sub>100) {
				  System.out.println(str+"������ ������ 0������ 100�� �����Դϴ�.");
			  }else {
				  break;
			  }
		  }
			  return sub;
		  }
	  
	@Override
	public void input() {
		System.out.print("�̸��� �Է�: ");
		String name = in.next(); //�̸��ް�
		int kor=inputSub("����");//���������ް�
		int eng=inputSub("����");//���������ް�
		SungJuk input=new SungJuk(name,kor,eng); // SungJuk ��ü���� input
		list.add(input); // ArrayList �迭�� ��ü�� �ֱ�
	}
	
	
	public void rank() {
		for(SungJuk rank1:list) {
			rank1.clearRank();
			for(SungJuk rank2:list) {
				if(rank1.getTot()<rank2.getTot()) {
					rank1.plusRank();
				}				
			}
			//rank1.getRank();
		}
	}
	
	@Override
	public void view() {
		rank();
		for(SungJuk view:list) {
			view.disp();
		}
		
	}
	
	@Override
	public void edit() {
		System.out.println("������ �л��� �̸� �Է�: ");
		String name=in.next();
		Iterator<SungJuk> it = list.iterator();
		while(it.hasNext()) {
			SungJuk edit=it.next();
			if(name.equals(edit.getName())){
				System.out.println(name+"���� ���� ���� ������"+edit.getKor()+"�� �Դϴ�.");
				int kor=inputSub("������ ����"); /*�޼ҵ�ȣ�� => ȣ����������� �������� kor�� ����(�ӽú���)*/
				System.out.println(name+"���� ���� ���� ������"+edit.getEng()+"�� �Դϴ�.");
				int eng=inputSub("������ ����"); /*�޼ҵ�ȣ�� => ȣ����������� �������� kor�� ����(�ӽú���)*/
				edit.setKor(kor);
				edit.setEng(eng);
				edit.setTot();  /*�������ٲ�� ������ٲ�����*/ 
				System.out.println(name+"�л��� ������ �����Ͽ����ϴ�.");
				return;
			}
		}
			
		
	}
	
	@Override
	public void delete() {
		System.out.println("������ �л��� �̸� �Է�: ");
		String name=in.next();
		for(SungJuk delete:list) {
			if(name.equals(delete.getName())) {
				list.remove(delete);
				System.out.println(name+"�л��� �����Ͽ����ϴ�.");				
				return;
			}
		}		
		System.out.println(name+"���� ���� �л��� �ƴմϴ�.");
	}
	
	@Override
	public void exit() {
		System.out.println("���α׷��� ����.");
		System.exit(0);
		
	}
	

}
