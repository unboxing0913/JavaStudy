package part01.sec02.exam02;

class A7{
	private int x=100;
	private int y=200;
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public void disp() {
		System.out.println("x="+x+",y="+y);
	}
	
	
}

class B7 extends A7{
	   private int y=300;
	   private int z=400;
	   
	  public void setY(int y) {
		  this.y=y;//
		  
	  }
	
	   
	   public void setZ(int z) {
		   this.z=z;
	   }
	   
	   public void disp() {
		   super.disp();
		   System.out.println("y="+y+",z="+z);
	   }
}
public class Round13_Ex12_6 {

	public static void main(String[] args) {
	    A7 ap=new B7();
	    ap.disp();
	    System.out.println();
	    ap.setX(1);
	    ap.disp();
	    System.out.println();
	    ap.setY(2);
	    ap.disp();
	    System.out.println();
	   

	}

}


/*
 * 
 * x=100 y=200
 * y=300 z=400
 * 
 * x=1 y=200
 * y200 z=400
 * 
 * x=1 y=200
 * y=2 z=400
 * 
 */
