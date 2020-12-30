package part01.sec01.exam01;
//indextOf() 맨처음()내용의 위치
//lastIndexOf() 마지막에오는 ()내용의 위치
public class Ex09_04 {

	public static void main(String[] args) {
		String str="Java를 공부하는 중,Java는 JAVA재밌어요.^^";
		
		System.out.println("문자열==>"+str);
		
		System.out.print("제일 처음 나오는 Java위치 ==>");
		System.out.println(str.indexOf("Java"));
		System.out.print("마지막에 나오는 Java위치 ==>");
		System.out.println(str.lastIndexOf("Java"));
	}

}

//indextOf lastindextOf
//
//indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
//만약 찾지 못했을 경우 "-1"을 반환합니다.
//indexOf( "찾을 특정 문자" , "시작할 위치" )
//"시작할 위치" 같은경우는 생략이 가능하며 생략할 경우 0번째 즉 처음부터 찾기 시작한다.
//
//
//
//
//lastindexOf() 는 특정 문자나 문자열이 뒤에서부터 처음 발견되는 인덱스를 반환하며
//만약 찾지 못했을 경우 "-1"을 반환합니다.
//사용법은 indexOf 와 동일하다

