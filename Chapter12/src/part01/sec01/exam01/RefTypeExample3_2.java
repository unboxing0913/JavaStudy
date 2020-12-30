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
		Point obj;                   // compile error : 번역 자체에서 에러
		
		System.out.println(obj.x);
		System.out.println(obj.y);
       */
		
		/*
        Point obj=null;  //runtime error : 실행할때 에러발생
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		*/
		
        Point obj=null;  
        if(obj==null) {
        	System.out.println("obj변수가 가르키는 객체가 없습니다.");
        	return;        	
            }
        
		System.out.println(obj.x);
		System.out.println(obj.y);
        
	}

}
