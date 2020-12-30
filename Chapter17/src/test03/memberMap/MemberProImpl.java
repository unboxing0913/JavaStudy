package test03.memberMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MemberProImpl implements MemberPro{
	
	private Hashtable<String,Member> map;
	private Scanner in;
	
	MemberProImpl(){ /*MemberProImpl 객체생성과 동시에 스캐너와 해쉬테이블 객체생성할수있도록 생성자에서 초기화*/
		in=new Scanner(System.in);
		map=new Hashtable<String,Member>();
	}
	
	@Override   /*재정의 어노테이션*/
	public void input() {
		String name;
		
		while(true) {
			System.out.println("이름을 입력 : ");
			name=in.next();
			if(map.containsKey(name)) {/*key 값을 포함하고있나*/
				System.out.println(name+"회원님은 존재합니다. 다시입력해 주세요!!!");
			}else {
				break;
			}
		}			
		System.out.println("전화번호를 입력 : ");
		String tel=in.next();
		//member테이블에 이름 전화번호 넣기     member클래스 생성 -> member생성자(객체)map				
		Member input = new Member(name,tel);		
		map.put(name,input);
	}
	@Override
	public void view() {
		Enumeration<String> enu=map.keys();     /*Enumeration 알아두기*/
	    while(enu.hasMoreElements()) { /*hasMorElements() -> Enumeration의 hashNext()격*/
	       Object obj=enu.nextElement(); /*nextElement() -> Enumeration의 next()격*/
	       String key=(String)obj;
	       Member view=(Member)map.get(key);/*강제캐스팅 안해줘도 상관없음*/
	       view.disp();
	    }
		
	}
	@Override
	public void edit() {
		System.out.println("수정할 회원의 이름을 입력 : ");
		String name=in.next();
		if(map.containsKey(name)) {
			Member edit = map.get(name); /*get의 반환되는타입은 Value*/
			System.out.println("현재 "+name+"님의 전화번호는 "+edit.getTel()+"번 입니다.");
			System.out.print("수정할 전화번호를 입력 : ");
			String tel = in.next();
			edit.setTel(tel);
			System.out.println(name+"님의 전화번호를 수정하였습니다.");
			System.out.println(name+"님의 전화번호는"+edit.getTel()+"번 입니다.");
			//return;
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
	}
	
	
	/* Generic Type
	 * <T> : Type
	 * <E> : Element
	 * <K> : Key
	 * <N> : Number
	 * <V> : Value
	 * <R> : Result
	 */
	
	@Override
	public void delete() {
		System.out.println("삭제할 회원의 이름 : ");
		String name = in.next();
		if(map.containsKey(name)) {
			map.remove(name);
			System.out.println(name+"회원님을 삭제하였습니다");
			return;
		}
	       System.out.println(name+"님은 저희 회원이 아닙니다.");  
		
	}
	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}
	
	

	
	

}
