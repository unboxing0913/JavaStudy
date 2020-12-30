package part01.sec01.exam05;

class Point{
	int x;
	int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		System.out.println("x:"+x+",y:"+y);
		return "x:"+x+",y:"+y;
	}
}

class Point3D extends Point{
	int z;

	Point3D(int x, int y,int z) {
		super(x, y);
		this.z=z;
	}
	
	String getLocation() { // method overriding(�߿�!!!!)�ڡڡڡڡڡڡڡڡ�
		System.out.println("x:"+x+",y:"+y+",z:"+z);
		return "x:"+x+",y:"+y+",z:"+z;
	}
	
}

public class PointTest {

	public static void main(String[] args) {
		//Point �θ� = new Point(1,2);
		Point3D �ڽ� = new Point3D(3,4,5);
		   //System.out.println(�θ�.getLocation());
		   String loc=�ڽ�.getLocation();
		   System.out.println(loc);

	}

}
