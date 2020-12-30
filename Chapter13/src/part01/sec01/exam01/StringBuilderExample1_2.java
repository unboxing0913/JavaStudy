package part01.sec01.exam01;

public class StringBuilderExample1_2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("역사를 하노라고 맨땅을 파다가");
        System.out.println(sb);
        System.out.println(sb.append(" 커다란 고인돌을 끄집어 내얺고 보니"));
        System.out.println(sb.insert(26,"하나"));
        System.out.println(sb.delete(21, 23));
        System.out.println(sb.deleteCharAt(9));
	}
	
}

/*
 *StringBuilder 클래스의 문자열 조작 메소드
 *append(string str):문자열 뒤에 str을 덧붙임
 *insert(int offset,String set):문자열의 offset위치에 str을 삽입
 *delete(int Start,int end):start부터 end-1까지의 부분 문자열 삭제
 *deleteCharAt(int inderx):inderx위치에 있는 하나의 문자를 삭제
 *
 * 특징:작업시 새로운 데이터(객체)를 만들지 않는다.
 */
