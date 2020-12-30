package part01.sec01.exam01;

import java.util.HashMap;

public class IntroHashMap_12 {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
        hMap.put(new Integer(3),"나삼번");
        hMap.put(5,"윤오번"); // Auto Boxing
        hMap.put(8,"박팔번"); 
        /* 저장 출력 객체화 시켜야하지만 자동으로 박싱 언박싱 된다 */
        System.out.println("6학년 3반 8번 학생: "+hMap.get(8));
        System.out.println("6학년 3반 5번 학생: "+hMap.get(new Integer(5))); //Auto UnBoxing
        System.out.println("6학년 3반 3번 학생: "+hMap.get(3));
        
        hMap.remove(5); /* 제거할때는 key값으로 제거해줘야 한다 */
        System.out.println("6학년 3반 5번 학생: "+hMap.get(new Integer(5)));
        System.out.println("6학년 3반 5번 학생: "+hMap.get(5));
	}

}
