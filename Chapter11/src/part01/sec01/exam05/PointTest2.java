package part01.sec01.exam05;

class Point2 /*extends Object*/{ //(내부적인작동)
	int x;
	int y;
	
	Point2(int x,int y){
		// java언어의 모든 클래스는 부모 최고 조상인 Object 클래스를 상속 받는다.
		// super(); // Object 생성자호출(내부적인작동)
		this.x=x;
		this.y=y;
	}
	
	
}

class Point3D2 extends Point{
	int z=30;
	
	Point3D2(){
		//this():다른생성자호출
		
		this(100,200,300);
		
		
	}

	Point3D2(int x, int y,int z) { //100 200 300
		super(x, y);	
		this.z=z;
	}
		
}

public class PointTest2 {

	public static void main(String[] args) {
		
		Point3D2 p3=new Point3D2();
		
		System.out.println("p3.x="+p3.x); //100
		System.out.println("p3.y="+p3.y); //200
		System.out.println("p3.z="+p3.z); //300

	}

}
