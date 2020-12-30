package part01.sec01.exam01;

public class StringExample1_1 {

	public static void main(String[] args) {
	String str="자바 커피";
	int len=str.length();
	
	for(int cnt=0;cnt<len;cnt++) {
		char ch=str.charAt(cnt);
		    System.out.println(ch);
	}
	
	String str1="자바";
	String str2="자바";	
	if(str1==str2) {  //같은문자열이면 객체 따로안만듬 같은곳 참조 
		System.out.println("같음");
	}else {
	    System.out.println("다름");
	}
	
	String str3=new String("자바");
	String str4=new String("자바");
	
	if(str3==str4) { //새로만들어지기때문에 다른 참조값을가지고있음
		System.out.println("같음");
	}else {
	    System.out.println("다름");
	}
	
	if(str3.equals(str4)) { // 실제 문자열 내용은 같음 
		System.out.println("같음");
	}else {
	    System.out.println("다름");
	}

	}

}
