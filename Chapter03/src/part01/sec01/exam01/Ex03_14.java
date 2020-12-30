package part01.sec01.exam01;

public class Ex03_14 {
//String은 기본타입이아닌 클래스타입 String의 변수는 참조변수
	public static void main(String[] args) {
	
    String	str1="Hello Java입니다."; //String 문자열에 관련된기능을 가진클래스
	String  str2="10";
	String  str3="20";
	
	str1="Java 입니다.";
	
	System.out.printf("%s \n",str1);
	System.out.printf("%s \n",str2+str3);//문자열+문자열은 덧셈이아닌 연결
	

	}

}
