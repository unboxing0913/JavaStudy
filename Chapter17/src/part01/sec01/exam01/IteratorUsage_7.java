package part01.sec01.exam01;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorUsage_7 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		Iterator<String> itr=list.iterator();
        System.out.println("�ݺ��ڸ� �̿��� 1�� ��°� \"Third\"����");
        while(itr.hasNext()) {
        	String curStr = itr.next();
        	System.out.println(curStr);
        	if(curStr.compareTo("Third")==0) {  /*A�� B�� ������ 0�� ��ȯ*/
        		itr.remove();
        	}      	
        }
       
        
        System.out.println("\n\"Third\"���� �� �ݺ��ڸ� �̿��� 2�� ���");        
        
        itr=list.iterator();  /* "Third"�� ������ itr.iterator�� �ٽ� ���� */
        while(itr.hasNext()) {      
        	System.out.println(itr.next());   
          }

        
  }
}
