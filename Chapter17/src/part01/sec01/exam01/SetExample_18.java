package part01.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample_18 {
  /*Set : �ߺ����� �Ұ�*/
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		
		System.out.println("����� �������� ��="+set.size());
        Iterator<String> iterator=set.iterator();
        
        while(iterator.hasNext()){        /*���*/
        	String str=iterator.next();
        	System.out.println(str);
        }
	}

}
