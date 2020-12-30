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
	
	String getLocation() { // method overriding(중요!!!!)★★★★★★★★★
		System.out.println("x:"+x+",y:"+y+",z:"+z);
		return "x:"+x+",y:"+y+",z:"+z;
	}
	
}

public class PointTest {

	public static void main(String[] args) {
		//Point 부모 = new Point(1,2);
		Point3D 자식 = new Point3D(3,4,5);
		   //System.out.println(부모.getLocation());
		   String loc=자식.getLocation();
		   System.out.println(loc);

	}

}
