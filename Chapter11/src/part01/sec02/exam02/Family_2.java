package part01.sec02.exam02;

class Father{
	public void play() {
		System.out.println("father : swimming ");
	}
	
	public void study() {
		System.out.println("father : java programming");
	}
}

class Johnharu extends Father{
	
	public void study(){
		System.out.println("johnharu:C# Programming");
	}
}

class Gracedew extends Father{
	public void play() {
		System.out.println("gracedew:BaseBall");
	}	
}

class Moon extends Father{
	public void play() {
		System.out.println("moon:BaskeBall");
	}
	public void study() {
		System.out.println("moon:Visual Basic,Visual C++");
	}
}


public class Family_2 {

	public static void main(String[] args) { //다형성
		
		Father daddy=new Father();   
		daddy.play();
		daddy.study();        //부모클래스 실행
		
		daddy=new Johnharu(); //Father의 study를 오버라이딩 하고있음
		daddy.play(); // 부모의 play실행 
		daddy.study();  // 오버라이딩된 study실행
		
		daddy=new Gracedew();
		daddy.play(); // 오버라이딩된 paly실행
		daddy.study(); // 부모의 study실행
		
		daddy=new Moon(); // Moon daddy2 = new Moon 과 결과같음.
		daddy.play(); //둘다오버라이딩
		daddy.study(); //둘다오버라이딩 
		

	}

}
