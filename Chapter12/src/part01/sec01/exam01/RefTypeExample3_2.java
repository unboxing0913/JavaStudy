package part01.sec01.exam01;

class Point{
	int x,y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class RefTypeExample3_2 {

	public static void main(String[] args) {
		/*
		Point obj;                   // compile error : ���� ��ü���� ����
		
		System.out.println(obj.x);
		System.out.println(obj.y);
       */
		
		/*
        Point obj=null;  //runtime error : �����Ҷ� �����߻�
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		*/
		
        Point obj=null;  
        if(obj==null) {
        	System.out.println("obj������ ����Ű�� ��ü�� �����ϴ�.");
        	return;        	
            }
        
		System.out.println(obj.x);
		System.out.println(obj.y);
        
	}

}
