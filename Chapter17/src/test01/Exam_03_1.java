package test01;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exam_03_1 {

	public static void main(String[] args) {
		Hashtable<String,String> map = new Hashtable<String,String>();
		map.put("���缮","���׸�");
		map.put("������","�߱�����");
		map.put("�����","�౸����");
		map.put("�۰���","����");
		map.put("�̴�ȣ","�߱�����");
		
//	    String keyy = map.get("�۰���");
//		 System.out.println("�۰��δ��� ������"+keyy+"�Դϴ�.");		 
//		
//		if(map.containsKey("���缮")) {
//			 System.out.println("���缮���� ������"+map.get("���缮")+"�Դϴ�.");
//		}
		
		
		
		/*�ݺ���*/
//		Set<String>key=map.keySet();		
//		Iterator<String>keyit = key.iterator();
//		while(keyit.hasNext()) {
//			String k=keyit.next();
//			String value=map.get(k);
//			System.out.println(k+"���� ������ "+value+"�Դϴ�.");
//		}
		
		Set<String> set=map.keySet();         /*Ű�� ���� �ΰ��� Ű���� String���ι޾���*/
		Iterator<String> it=set.iterator(); /*hashtable������ Interator�� ������*/
		while(it.hasNext()){
			Object obj=it.next(); /* Ű��  */ 
			String key = (String)obj;	
			System.out.println(key+"���� ������"+map.get(key)+"�Դϴ�.");
			
		}
		
				
	}

}

/*
 *  �۰��δ��� ������ �����Դϴ�.
 */
