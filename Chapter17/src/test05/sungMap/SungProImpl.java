package test05.sungMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import test02.sungList.SungJuk;
import test03.memberMap.Member;

public class SungProImpl implements SungPro {
	
	private Hashtable<String,SungJuk> map;
	private Scanner in;
	
	public SungProImpl(){
		map = new Hashtable<String,SungJuk>();
		in = new Scanner(System.in);
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
		System.out.println("�̸��� �Է� : ");
		String name=in.next();
		int kor=inputSub("����");
		int eng=inputSub("����");
		SungJuk input=new SungJuk(name,kor,eng);
		map.put(name, input);
		
	}
	
	public void rank() {
        
	/*	Set<String> key = map.keySet();
		Iterator<String> keyit = key.iterator();
		while(keyit.hasNext()) {
		SungJuk list1 = (SungJuk)keyit;
		list1.clearRank();
		       while(keyit.hasNext()) {
			   SungJuk list2 = (SungJuk)keyit;
			   if(list1.getTot()<list2.getTot()) {
				   list1.plusRank();
			      }
		       }				
	     }  �ȵǴ¹�� */      
		
	   for(Enumeration<String> enu1=map.keys();enu1.hasMoreElements();) { /*keys() �޼���� �迭�� �� �ε����� Ű ������ ������ ���ο� Array Iterator ��ü�� ��ȯ�մϴ�.*/
		   String key1=enu1.nextElement();
			  SungJuk rank1 = map.get(key1); 
			  rank1.clearRank(); // �ʱ�ȭ����(�ʱ�ȭ �����ٽ� �����Ҷ� ���������� �������ִ� Rank�� + �� ) 
			  for(Enumeration<String> enu2=map.keys();enu2.hasMoreElements();) {
				  String key2=enu2.nextElement();
				  SungJuk rank2 = map.get(key2);			  			 
				  if(rank1.getTot() < rank2.getTot()) {
					  rank1.plusRank();
				  }
			  }  
			  }      
		   }  
	 
	   

	@Override 
	public void view() {//������ ���������� ��ũ�� �������־����
	/*	rank(); //����Ϸ��� �����
		Set<String> key = map.keySet();	
		Iterator<String> keyit=key.iterator();     
	    while(keyit.hasNext()) {
//	    	Object obj=keyit.next();	    	
//	    	SungJuk view = (SungJuk)obj;  //�ȵ�
	    	String name = keyit.next();
	    	SungJuk view = map.get(name);
	    	//view.disp();
	    	view.disp();
	    }	�ٸ����	*/
		
		rank();
		Enumeration<String> enu=map.keys();
		while(enu.hasMoreElements()) {
			String key=enu.nextElement();
			SungJuk view=map.get(key);
			view.disp();
		}
		
	}

	@Override
	public void edit() {
/*		System.out.println("������ �л��� �̸� �Է�: ");
		String name=in.next();
		Set<String> key = map.keySet();	
		Iterator<String> keyit=key.iterator();    
		while(keyit.hasNext()) {
//		    Object obj = keyit;             //�ȵ�
//			SungJuk edit= (SungJuk)obj;
			String name2 = keyit.next();
	    	SungJuk edit = map.get(name2);
			if(name.equals(edit.getName())){
				System.out.println(name+"���� ���� ���� ������"+edit.getKor()+"�� �Դϴ�.");
				int kor=inputSub("������ ����"); 
				System.out.println(name+"���� ���� ���� ������"+edit.getEng()+"�� �Դϴ�.");
				int eng=inputSub("������ ����");
				edit.setKor(kor);
				edit.setEng(eng);
				edit.setTot(); 
				System.out.println(name+"�л��� ������ �����Ͽ����ϴ�.");
				return;
			}
		}     �ٸ���� */
			
		System.out.println("������ �л��� �̸��Է�: ");
		String name = in.next();
		if(map.contains(name)) {
			SungJuk edit=map.get(name);			
				System.out.println(name+"���� ���� ���� ������"+edit.getKor()+"�� �Դϴ�.");
				int kor=inputSub("������ ����"); 
				System.out.println(name+"���� ���� ���� ������"+edit.getEng()+"�� �Դϴ�.");
				int eng=inputSub("������ ����");
				edit.setKor(kor);
				edit.setEng(eng);
				edit.setTot(); 
				System.out.println(name+"�л��� ������ �����Ͽ����ϴ�.");
				return;			
		       }
		System.out.println(name+"���� �����л��� �ƴմϴ�.");
	}

	@Override
	public void delete() {
/*		System.out.println("������ �л��� �̸� �Է�: ");
		String name=in.next();
		Set<String> key = map.keySet();	
		Iterator<String> keyit=key.iterator(); 
		String name2 = keyit.next();
    	SungJuk delete = map.get(name2);
			if(name.equals(delete.getName())) {
				map.remove(name2);
				System.out.println(name+"�л��� �����Ͽ����ϴ�.");				
				return;
			}
				
		System.out.println(name+"���� ���� �л��� �ƴմϴ�.");     */
		
		System.out.println("������ �л��� �̸� �Է�: ");
		String name=in.next();
		if(map.containsKey(name)) { //contains�� containsKey������ �˱�
				map.remove(name);
				System.out.println(name+"�л��� �����Ͽ����ϴ�.");				
				return;
			}		
		System.out.println(name+"���� ���� �л��� �ƴմϴ�."); 
	}
		

	@Override
	public void exit() {
		System.out.println("�ý����� �����մϴ�.");
		System.exit(0);
		
		
	}

	
}
