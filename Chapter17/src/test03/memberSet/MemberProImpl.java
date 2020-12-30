package test03.memberSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import test03.memberMap.Member;

public class MemberProImpl implements MemberPro {
	
	private HashSet<Member> set;
	private Scanner in;
    
	MemberProImpl(){
		set = new HashSet<Member>();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		while(true) {
		System.out.println("�̸��� �Է� : ");
		String name = in.next();		
		if(set.equals(name)) {/*��� String�ƴϸ� equals & hashcode �������̵�������� �׷��� �� �ڵ尡 ����*/
			System.out.println(name+"ȸ������ �����մϴ�. �ٽ��Է��� �ּ���!!!");
		}else {			
			System.out.println("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			Member input=new Member(name,tel);
		    set.add(input); //
		    break;
		}		
	 }
	}

	@Override
	public void view() {
		Iterator<Member> it=set.iterator();     
	    while(it.hasNext()) { 
//	    Object obj=it.next();	
//	    Member view = (Member)obj;
	    Member view = it.next();
	    view.disp();
	    
	    }
		
	}

	@Override
	public void edit() {
		System.out.println("������ ȸ���� �̸��� �Է� : ");
		String name=in.next();
		Iterator<Member> it = set.iterator();
		if(it.hasNext()) {
			Object obj=it.next();
			Member edit = (Member)obj;
			if(name.equals(edit.getName())) {
				System.out.println("����"+name+"���� ��ȭ��ȣ��"+edit.getTel());
				System.out.println("������ ��ȭ��ȣ�� �Է�: ");
				String tel = in.next();
				edit.setTel(tel);
				System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
				return;
			}
		
	     }
	}

	@Override
	public void delete() {
		System.out.println("������ ȸ���� �̸� : ");
		String name = in.next();
		Iterator<Member>it = set.iterator();
		if(it.hasNext()) {
			Object obj=it.next();
			Member delete = (Member)obj;
			if(name.equals(delete.getName())) {
				set.remove(delete);
				System.out.println(name+"ȸ������ �����Ͽ����ϴ�.");
				return;
			}
		       System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		
	      }
	}

	@Override
	public void exit() {
		System.out.println("�ý����� �����մϴ�.");
		System.exit(0);
		
	}

}
