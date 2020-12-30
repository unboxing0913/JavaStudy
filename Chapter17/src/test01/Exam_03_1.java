package test01;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exam_03_1 {

	public static void main(String[] args) {
		Hashtable<String,String> map = new Hashtable<String,String>();
		map.put("유재석","개그맨");
		map.put("류현진","야구선수");
		map.put("손흥민","축구선수");
		map.put("송가인","가수");
		map.put("이대호","야구선수");
		
//	    String keyy = map.get("송가인");
//		 System.out.println("송가인님의 직업은"+keyy+"입니다.");		 
//		
//		if(map.containsKey("유재석")) {
//			 System.out.println("유재석님의 직업은"+map.get("유재석")+"입니다.");
//		}
		
		
		
		/*반복자*/
//		Set<String>key=map.keySet();		
//		Iterator<String>keyit = key.iterator();
//		while(keyit.hasNext()) {
//			String k=keyit.next();
//			String value=map.get(k);
//			System.out.println(k+"님의 직업은 "+value+"입니다.");
//		}
		
		Set<String> set=map.keySet();         /*키와 값이 두개니 키값만 String으로받아줌*/
		Iterator<String> it=set.iterator(); /*hashtable에서는 Interator을 못쓴다*/
		while(it.hasNext()){
			Object obj=it.next(); /* 키값  */ 
			String key = (String)obj;	
			System.out.println(key+"님의 직업은"+map.get(key)+"입니다.");
			
		}
		
				
	}

}

/*
 *  송가인님의 직업은 가수입니다.
 */
