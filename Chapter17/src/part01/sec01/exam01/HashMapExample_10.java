package part01.sec01.exam01;

import java.util.HashMap;

public class HashMapExample_10 {

	public static void main(String[] args) {
		/* HashMap */
		HashMap<String,Integer> hashtable=new HashMap<String,Integer>();
                     /* 키값 , 데이터 타입 */
		hashtable.put("해리",new Integer(95));
		hashtable.put("헤르미온느",new Integer(100));
		hashtable.put("론",new Integer(85));
		hashtable.put("드레이코",new Integer(93));
		hashtable.put("네빌",new Integer(70));
		
		Integer num = hashtable.get("헤르미온느");
		System.out.println("헤르미온느의 성적은? "+num+"점 입니다.");		
	}

}
/*
 * hashCode메서드는 Object클래스에 선언되어 있는 메소드로서 HashMap클래스의
 * put,get,remove 메소드가 동 번호를 계산할 때 사용된다. 즉 키 값으로 넘겨진 객체에 대해
 * hashCode메소드가 호출된다. 
 */
 