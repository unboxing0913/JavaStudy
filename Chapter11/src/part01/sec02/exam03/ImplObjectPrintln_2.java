package part01.sec02.exam03;

class ClassPrinter{
	
	public static void print(Object obj) { //static ��ü�������� ��������
		System.out.println(obj.toString());//��ü���������ִ°��� ���ڿ�������ϴ� ��ɾ� toString();
	}
}

class Point /*extends Object*/{
	private int xPos,yPos;
	Point(int x,int y){
		xPos=x;
		yPos=y;
		
	}
	
	public String toString() { //toString �������̵�
		
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
