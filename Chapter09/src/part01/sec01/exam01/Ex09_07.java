package part01.sec01.exam01;

public class Ex09_07 {

	public static void main(String[] args) {
        String str=" 한글 ABCD efgh ";
		String result="";
				
		System.out.println("원 문자열 ==>["+str+"]");
		
		for(int i=0;i<str.length();i++) {			
			if(str.charAt(i)!=' '){									
			result+=str.substring(i,i+1);
			
			}			
		}
		       System.out.println("공백제거 ==>["+result+"]");
			
	}

}
