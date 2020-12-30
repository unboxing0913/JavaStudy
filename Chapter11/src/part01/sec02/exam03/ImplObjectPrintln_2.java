package part01.sec02.exam03;

class ClassPrinter{
	
	public static void print(Object obj) { //static 객체생성없이 쓸수있음
		System.out.println(obj.toString());//객체가가지고있는값을 문자열로출력하는 명령어 toString();
	}
}

class Point /*extends Object*/{
	private int xPos,yPos;
	Point(int x,int y){
		xPos=x;
		yPos=y;
		
	}
	
	public String toString() { //toString 오버라이딩
		
		String result="[x=\""+xPos+",y:"+yPos+"]";
		return result; 
		
	}
}
public class ImplObjectPrintln_2 {

	public static void main(String[] args) {
		Point pos1=new Point(1,2);
		Point pos2=new Point(5,9);
		
		ClassPrinter.print(pos1); //[x:1,y:2]
        ClassPrinter.print(pos2); //[x:5,y:9]
	}

}
