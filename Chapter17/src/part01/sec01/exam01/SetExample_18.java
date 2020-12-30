package part01.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample_18 {
  /*Set : 중복저장 불가*/
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		
		System.out.println("저장된 데이터의 수="+set.size());
        Iterator<String> iterator=set.iterator();
        
        while(iterator.hasNext()){        /*출력*/
        	String str=iterator.next();
        	System.out.println(str);
        }
	}

}
