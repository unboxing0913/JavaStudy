package part01.sec01.exam01;

import java.util.HashSet;
import java.util.Set;

public class SetExample_16 {

	public static void main(String[] args) {
		Object[] objArr= {"1",new Integer(1),"2","2","3","3","4","4","4"}; /*HashSet의 자료구조 클래스에 배열의 값을 하나하나 집어넣는작업*/
		Set<Object> set=new HashSet<Object>();
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
		
		/*문자열"1"과 래퍼타입 (1)은 다름 , 나머지는 중복되는것 저장안됨*/
	}
}
/*
 * 순서를 유지하지 않는다.
 * 중복되는 객체는 저장하지 않는다.
 */
