package test07.playMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class PlayProImpl implements PlayPro {
	
	private Hashtable<String,Hashtable<String,Player>> ht;
	private Scanner in;

	
    public PlayProImpl(){
		ht = new Hashtable<>(); //
		String data[]=new String[] {"��ȭ","LG","�λ�","���","�Ե�"};
		for(int i=0;i<data.length;i++) {
			ht.put(data[i],new Hashtable<String,Player>());			/*����*/	
		}
		in = new Scanner(System.in);		
		
	}

	
	@Override
	public void input() {
		System.out.println("������ �Է� : ");
		String club = in.next();
		Hashtable<String,Player> ht2=ht.get(club);/*�����̸����� �ؽ����̺�ü�� �����´� (�����Ҽ����̺�) */
		/*���� ���� �ʿ�*/
		System.out.print("���� �̸��� �Է� ");
		String name = in.next();
		System.out.println(name+"���� ������ �Է� ");
		int salary = in.nextInt();
		Player player=new Player(name,club,salary);
		ht2.put(name, player); //���������⶧���� name <String,Player>
		ht.put(club,ht2); // ���� <String,Hashtable...>
		
	}

	@Override
	public void view() {
		System.out.println("������ �Է�"); 
		String club=in.next();
		Hashtable<String,Player> ht2=ht.get(club);
		Enumeration<String>enu = ht2.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Player view = ht2.get(key);
			view.disp();
		}
/*		Enumeration<String> enu=ht.keys();
		if(club.equals(enu)){	
		     while(enu.hasMoreElements()) {
		    	 String key = enu.nextElement();
			     Hashtable<String,Player> ht2=ht.get(club);   //��ġ
		    	 Player view = ht2.get(key);
		    	 view.disp();
		     }
		} */
	}

	@Override
	public void delete(){
	     System.out.print("������ �Է� : ");
	     String club=in.next();
	 	 Hashtable<String,Player> ht2=ht.get(club); /*���ܼ��������� ����*/
	     System.out.print("������ ������ �̸��� �Է�");
	     String name=in.next();
	     Enumeration<String>enu = ht2.keys();
	     if(ht2.containsKey(name)) { /*ht2�� name�̶�� Key�� �����ϴ°� t/f */
	    	 ht2.remove(name);
	    	 System.out.println(club+"������ "+name+"������ �����Ͽ����ϴ�.");	    	 
	     }else {	     
	     System.out.println(club+"���ܿ���"+name+"������ �����ϴ�.");
	     }		
	}

	@Override
	public void edit() {
		System.out.print("������ �Է� : ");
		String club=in.next();
		Hashtable<String,Player> ht2=ht.get(club);
		System.out.print("Ÿ�������� ������ ���� �̸� : ");
		String name = in.next();
		if(ht2.contains(name)) {
			System.out.print("������ ������ �̸��� �Է� : ");
			String club2=in.next();
			Hashtable<String,Player> ht3=ht.get(club2); // �ڸ�����
			ht3.put(name,ht2.get(name));/*������ ������������ �Ű����°�*/
			ht2.remove(name);/*�������� ���� �����ֱ�*/
			System.out.println(name+"������ "+club+"���ܿ��� "+club2+"�������� �Ű���ϴ�.");				
		}else {
			System.out.println(club+"���ܿ��� "+name+"������ �����ϴ�.");
		}		
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}

}
