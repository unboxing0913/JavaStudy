package part01.sec01.exam01;

class Car3{
	Car3(){
		System.out.println("슈퍼 클래스 생성자호출(피라미터 없음)");
	}
	
	Car3(String str){
		System.out.println("슈퍼 클래스 생성자 호출==>"+str);
	}
}

class Sedan3 extends Car3{
	
	Sedan3(String str){
		System.out.println("서브 클래스 생성자 호출 ==>"+str);
	}
	
}

public class Ex11_03 {

	public static void main(String[] args) {
		Sedan3 sedan3=new Sedan3("여기요~~~");

	}

}
