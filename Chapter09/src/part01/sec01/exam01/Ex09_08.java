package part01.sec01.exam01;

public class Ex09_08 {

	public static void main(String[] args) {
		
		 String str1="Java Programming";
		 String str2="Java IT Language";
		 
		 System.out.println("원 문자열1==> ["+str1+"]"); 
		 System.out.println("원 문자열2==> ["+str2+"]");
		 
		 System.out.println(str1.compareTo(str2)); // str1과 str2의 틀린 시작부분의 아스키코드값  - 결과값 7 (P=80,I=73)
		 System.out.println(str1.contains("Java"));//Java가 들어있나 true
	}

}
//비교대상.compareTo(비교대상):두개의 String를 앞에서부터 순사적으로 비교하다가 틀린부분이 있으면 
//                         비교하는 String에 캐릭터값( 아스키코드값  - 결과값 7 (P=80,I=73)을 반환한다.
//비교대상.contains(문자열):두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.