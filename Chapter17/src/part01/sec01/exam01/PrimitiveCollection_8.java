package part01.sec01.exam01;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection_8 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
	 /* list.add(new Integer(10));Auto Boxing (new Integer(10))*/
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> itr=list.iterator(); 
		while(itr.hasNext()) { 
			int num=itr.next();
		  /*int num=itr.next().intValue(); Auto Unboxing */
			System.out.println(num);
		}
		
	}

}
