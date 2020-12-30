package part01.sec02.exam01;

class Box5{
	int width;
	int height;
	int depth;
 
	Box5(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
}

public class Box5Test_03 {

	public static void main(String[] args) {
		Box5 mybox1=new Box5(10,20,30);
		int vol = mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("박스의 부피 : "+vol);

	}

}
