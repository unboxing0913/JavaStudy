package part01.sec01.exam01;

public class Ex03_13 {

	public static void main(String[] args) {
		boolean boo1,boo2; // 불리언 true,false 만 저장가능
		
		boo1=true; //문자열이여도 큰따옴표 필요없음 약속되있는 값
        System.out.printf("%s \n",boo1); //boolean타입은 %s사용
        // boo2는 선언을안했는데 왜 false로 되있는지 (컴퓨터가 알아서연산해줌)119
        
        
        
        boo2=(10 == 20); //괄호는 센스(매너) 
       // boo2=10 != 20;
        System.out.printf("%s \n",boo2);
           // == 대입연산자 두개면 (좌 우의값이 같냐)라고 물어보는 관계연산자
           // != (좌우의값이 같지않다)
      //  boo2=(10 == 10);
       //System.out.printf("%s \n",boo2); // 연산알아서해줌
	}

}
