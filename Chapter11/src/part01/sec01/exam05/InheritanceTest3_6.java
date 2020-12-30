package part01.sec01.exam05;

class B1 {
	int x;
}
class B2 extends B1 {
	String x;	//부모클래스와 변수 이름이 같을 때 자식 클래스 변수를 갖다씀
}
public class InheritanceTest3_6 {

	public static void main(String[] args) {
		B2 b2=new B2();
		b2.x="자바 상속 공부중 ...";
		System.out.println("객체 b2에 들어있는 x값 :" +b2.x);
		
		B1 b1=new B1();
		b1.x=5000;
		System.out.println(b1.x);
	}

}
