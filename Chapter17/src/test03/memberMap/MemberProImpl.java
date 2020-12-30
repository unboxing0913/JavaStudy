package test03.memberMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MemberProImpl implements MemberPro{
	
	private Hashtable<String,Member> map;
	private Scanner in;
	
	MemberProImpl(){ /*MemberProImpl ��ü������ ���ÿ� ��ĳ�ʿ� �ؽ����̺� ��ü�����Ҽ��ֵ��� �����ڿ��� �ʱ�ȭ*/
		in=new Scanner(System.in);
		map=new Hashtable<String,Member>();
	}
	
	@Override   /*������ ������̼�*/
	public void input() {
		String name;
		
		while(true) {
			System.out.println("�̸��� �Է� : ");
			name=in.next();
			if(map.containsKey(name)) {/*key ���� �����ϰ��ֳ�*/
				System.out.println(name+"ȸ������ �����մϴ�. �ٽ��Է��� �ּ���!!!");
			}else {
				break;
			}
		}			
		System.out.println("��ȭ��ȣ�� �Է� : ");
		String tel=in.next();
		//member���̺� �̸� ��ȭ��ȣ �ֱ�     memberŬ���� ���� -> member������(��ü)map				
		Member input = new Member(name,tel);		
		map.put(name,input);
	}
	@Override
	public void view() {
		Enumeration<String> enu=map.keys();     /*Enumeration �˾Ƶα�*/
	    while(enu.hasMoreElements()) { /*hasMorElements() -> Enumeration�� hashNext()��*/
	       Object obj=enu.nextElement(); /*nextElement() -> Enumeration�� next()��*/
	       String key=(String)obj;
	       Member view=(Member)map.get(key);/*����ĳ���� �����൵ �������*/
	       view.disp();
	    }
		
	}
	@Override
	public void edit() {
		System.out.println("������ ȸ���� �̸��� �Է� : ");
		String name=in.next();
		if(map.containsKey(name)) {
			Member edit = map.get(name); /*get�� ��ȯ�Ǵ�Ÿ���� Value*/
			System.out.println("���� "+name+"���� ��ȭ��ȣ�� "+edit.getTel()+"�� �Դϴ�.");
			System.out.print("������ ��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			edit.setTel(tel);
			System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
			System.out.println(name+"���� ��ȭ��ȣ��"+edit.getTel()+"�� �Դϴ�.");
			//return;
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
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
		System.out.println("������ ȸ���� �̸� : ");
		String name = in.next();
		if(map.containsKey(name)) {
			map.remove(name);
			System.out.println(name+"ȸ������ �����Ͽ����ϴ�");
			return;
		}
	       System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");  
		
	}
	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}
	
	

	
	

}
