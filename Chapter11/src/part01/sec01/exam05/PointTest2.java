package part01.sec01.exam05;

class Point2 /*extends Object*/{ //(���������۵�)
	int x;
	int y;
	
	Point2(int x,int y){
		// java����� ��� Ŭ������ �θ� �ְ� ������ Object Ŭ������ ��� �޴´�.
		// super(); // Object ������ȣ��(���������۵�)
		this.x=x;
		this.y=y;
	}
	
	
}

class Point3D2 extends Point{
	int z=30;
	
	Point3D2(){
		//this():�ٸ�������ȣ��
		
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
