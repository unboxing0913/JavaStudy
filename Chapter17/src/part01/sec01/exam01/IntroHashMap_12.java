package part01.sec01.exam01;

import java.util.HashMap;

public class IntroHashMap_12 {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
        hMap.put(new Integer(3),"�����");
        hMap.put(5,"������"); // Auto Boxing
        hMap.put(8,"���ȹ�"); 
        /* ���� ��� ��üȭ ���Ѿ������� �ڵ����� �ڽ� ��ڽ� �ȴ� */
        System.out.println("6�г� 3�� 8�� �л�: "+hMap.get(8));
        System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(new Integer(5))); //Auto UnBoxing
        System.out.println("6�г� 3�� 3�� �л�: "+hMap.get(3));
        
        hMap.remove(5); /* �����Ҷ��� key������ ��������� �Ѵ� */
        System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(new Integer(5)));
        System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));
	}

}
