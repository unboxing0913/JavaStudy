package part01.sec01.exam01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample_6 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");
		
		/*List ����ϴ¹����*/
		
		int num=list.size();/*�ε����� �����Ѵ�(set�� ��¸��� �������̱� ������)*/
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}
		
		
		for(String str : list) {
			System.out.println(str);	
		}
	    
		
		Iterator<String> iterator = list.iterator();  /*����Ʈ���Ѿ���*/
		while(iterator.hasNext()) { /* t/f */
			String str = /*(String)*/iterator.next();  /*Object Ÿ������ �������⶧���� ĳ����(����Ÿ�Ժ�ȯ) �ʿ���      �ڵ����� �׶��׶� ��ȯ��*/
			System.out.println(str);
		}
		
		

	}

}
