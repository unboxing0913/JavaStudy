package part01.sec01.exam01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample_6 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		/*List 출력하는방법들*/
		
		int num=list.size();/*인덱스로 접근한다(set은 출력못함 무작위이기 떄문에)*/
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}
		
		
		for(String str : list) {
			System.out.println(str);	
		}
	    
		
		Iterator<String> iterator = list.iterator();  /*임포트시켜야함*/
		while(iterator.hasNext()) { /* t/f */
			String str = /*(String)*/iterator.next();  /*Object 타입으로 가져오기때문에 캐스팅(강제타입변환) 필요함      자동으로 그때그때 변환됨*/
			System.out.println(str);
		}
		
		

	}

}
