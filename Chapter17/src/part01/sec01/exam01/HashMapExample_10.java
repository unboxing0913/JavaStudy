package part01.sec01.exam01;

import java.util.HashMap;

public class HashMapExample_10 {

	public static void main(String[] args) {
		/* HashMap */
		HashMap<String,Integer> hashtable=new HashMap<String,Integer>();
                     /* Ű�� , ������ Ÿ�� */
		hashtable.put("�ظ�",new Integer(95));
		hashtable.put("�츣�̿´�",new Integer(100));
		hashtable.put("��",new Integer(85));
		hashtable.put("�巹����",new Integer(93));
		hashtable.put("�׺�",new Integer(70));
		
		Integer num = hashtable.get("�츣�̿´�");
		System.out.println("�츣�̿´��� ������? "+num+"�� �Դϴ�.");		
	}

}
/*
 * hashCode�޼���� ObjectŬ������ ����Ǿ� �ִ� �޼ҵ�μ� HashMapŬ������
 * put,get,remove �޼ҵ尡 �� ��ȣ�� ����� �� ���ȴ�. �� Ű ������ �Ѱ��� ��ü�� ����
 * hashCode�޼ҵ尡 ȣ��ȴ�. 
 */
 