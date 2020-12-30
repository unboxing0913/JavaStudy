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
		System.out.println("이름을 입력 : ");
		String name = in.next();		
		if(set.equals(name)) {/*사실 String아니면 equals & hashcode 오버라이딩해줘야함 그래야 이 코드가 적용*/
			System.out.println(name+"회원님은 존재합니다. 다시입력해 주세요!!!");
		}else {			
			System.out.println("전화번호를 입력 : ");
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
		System.out.println("수정할 회원의 이름을 입력 : ");
		String name=in.next();
		Iterator<Member> it = set.iterator();
		if(it.hasNext()) {
			Object obj=it.next();
			Member edit = (Member)obj;
			if(name.equals(edit.getName())) {
				System.out.println("현재"+name+"님의 전화번호는"+edit.getTel());
				System.out.println("수정할 전화번호를 입력: ");
				String tel = in.next();
				edit.setTel(tel);
				System.out.println(name+"님의 전화번호를 수정하였습니다.");
				return;
			}
		
	     }
	}

	@Override
	public void delete() {
		System.out.println("삭제할 회원의 이름 : ");
		String name = in.next();
		Iterator<Member>it = set.iterator();
		if(it.hasNext()) {
			Object obj=it.next();
			Member delete = (Member)obj;
			if(name.equals(delete.getName())) {
				set.remove(delete);
				System.out.println(name+"회원님을 삭제하였습니다.");
				return;
			}
		       System.out.println(name+"님은 저희 회원이 아닙니다.");
		
	      }
	}

	@Override
	public void exit() {
		System.out.println("시스템을 종료합니다.");
		System.exit(0);
		
	}

}
