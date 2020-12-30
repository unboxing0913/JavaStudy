package part01.sec01.exam01;

public class WrapperExample1_1 {

	public static void main(String[] args) {
		
		Integer obj1=new Integer(12); // 래퍼클래스생성     : 박싱 Boxing        (12): 프리미티브값
		Integer obj2=new Integer(7);
		
		int sum=obj1.intValue()+obj2.intValue(); //저장되있는값 꺼내오는법 intValue() : 언박싱 Unboxing
		System.out.println(sum);

	}

}

/*
 * 하나의 래퍼 객체에는 하나의 프리미티브 값을 담을 수 있는데 그 값은 생성자 파라미터로 넘겨주어야한다
 * 래퍼 객체가 생성되고 난 다음에는 그 객체안에 있는 프리미티브 값은 바꿀 수 없다.
 */
