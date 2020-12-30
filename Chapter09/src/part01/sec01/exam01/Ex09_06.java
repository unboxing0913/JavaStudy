package part01.sec01.exam01;

public class Ex09_06 {

	public static void main(String[] args) {
		String str=" 한글 ABCD efgh ";
		
		System.out.println("원 문자열 ==>["+str+"]");
        System.out.println("대문자로 ==>["+str.toUpperCase()+"]");
        System.out.println("소문자로 ==>["+str.toLowerCase()+"]");
        System.out.println("공백제거 ==>["+str.trim()+"]"); // 앞뒤 공백을 제거
        
	}

}


 // .toUpperCase():문자열에 소문자를 대문자로 변환한다.
 // .toLowerCase():문자열에 대문자를 소문자로 변환한다.
 // .trim() : 문자열의 앞뒤 공백제거

