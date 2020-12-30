package part01.sec01.exam01;
//★★★★★★★★★★★★★★★★★★★★★★★
public class Ex09_09 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java Programming";
        String str3=new String("Java Programming");
                  //새로운객체생성 String은 클래스타입
        System.out.println("원 문자열1==>["+str1+"]");
        System.out.println("원 문자열2==>["+str2+"]");
        System.out.println("원 문자열3==>["+str3+"]");
        
        System.out.println("문자열1==문자열2 결과:\t"+(str1==str2)); // 참조된 번지가같은지
        System.out.println("문자열 1,equals(문자열2) 결과:"+str1.equals(str2));//문자열 내용이같은지
        
        System.out.println("문자열1==문자열3 결과:\t"+(str1==str3));
        System.out.println("문자열 1,equals(문자열3) 결과:"+str1.equals(str3));
}
}

// equals:두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
// 번지는 == 
