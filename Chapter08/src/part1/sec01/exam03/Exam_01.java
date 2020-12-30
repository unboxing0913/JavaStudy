package part1.sec01.exam03;
//메소드 작동원리 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
public class Exam_01 {
//메소드라고하는 존재는 호출하기전까지 메모리에 만들어지지않음.
//컴파일러가 번역과 동시에 메모리에 만들때 메소드는안만듬
//메소드를 호출했을때 메소드를 인식하고 만든뒤 메소드는 사라짐(땔감)
	public static void main(String[] args) {
		
		int a=10;
		star(a); //호출        
		System.out.println("Java"); // 순서대로 출력되기때문에 별찍고 다음순서
		star(); //매개변수 같아야 호출 없으면 없는것도 같아야
		star(20);//a값이전달됨 -> 8의값을전달받은 메소드 (int a)의 값을주면서 출력
		star();//다시초기화
		System.out.println("JSP");
		
}
		 
	//메소드 동시호출은안됨 
	public static void star(int a) { //매소드명은같아도 매개변수가 있고없고로 구분됨
   // void 반환값이없다  .반드시 출력해야함      //매개변수 : 외부의값을 전달받는
		                             //매개변수 : 지역변수 (괄호안에서만쓰니깐)
		 
		 for(int i=0;i<a;i++) {
			   System.out.print("*");
		 }
		      System.out.println();
		      a=7; //위에서 받아온 a값을 10=>7로바꾸는것
		           //지역변수이기때문에 위의 a와 아무런 관련이없다.
      } 

	
	
	public static void star() {
		 
		 
		 for(int i=0;i<10;i++) {
			   System.out.print("*");
		 }
		      System.out.println();
   }

	
	
	
}
