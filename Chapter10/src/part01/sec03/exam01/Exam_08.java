package part01.sec03.exam01;

import java.util.Scanner;

class Member{
	private String name;
	private String tel;
	
	Member(String name,String tel){
		this.name=name;
		this.tel=tel;
	}
	
	public void setTel(String tel) { //전화번호를 바꾸는 용도로 만들어 것은것
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	void disp() {
		System.out.println(name+"님의 전화번호는"+tel+"번 입니다.");
	}
	
}

public class Exam_08 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.print("회원수를 입력 : ");
		 int inwon=s.nextInt();
		 //int arr[]=new int[3]  인트타입배열은 정수가 들어감 
		 Member mb[]=new Member[inwon];// 클래스 배열 선언 (클래스타입 배열은 객체가들어감) // 배열의크기가 ex)3
		 //공간만 들어준것 // 크기를만들어논것
         for(int i=0;i<inwon;i++) {// 입력포문
        	System.out.println(i+1+"번째 이름 :"); 
        	String name = s.next(); 
        	System.out.println(i+1+"번째 전화번호 :");
        	String tel = s.next();
        	  // mb[i](name,tel); 
            mb[i]=new Member(name,tel); //객체생성  (배열 크기는만들었으니 객체를 또 만들어줘야함) 힙은 직접접근이 안되기때문에 new Meber로 객체생성해서 접근
         } // new Meber로만들어논 객체의주소가 mb[i](변수)공간 에 들어가는것
             
         for(int i=0;i<inwon;i++) {// 출력포문
                  mb[i].disp();
        	 
         }
         s.close();
	}

}
