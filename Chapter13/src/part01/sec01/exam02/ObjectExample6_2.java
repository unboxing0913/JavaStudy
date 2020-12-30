package part01.sec01.exam02;

class Circle{
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	/*public boolean equals(Object obj) { //다형성으로 부모타입 Object로 받은것
		if(obj instanceof Circle) {
		    Circle circle = (Circle)obj;			
		    if(radius==circle.radius) 
			return true;
		else 
		      return false;
		}else {
		      return false;
	}
}
	*/
	public boolean equals(Object obj) { //다형성으로 부모타입 Object로 받은것
		if(!(obj instanceof Circle)) {
			return false;
		}
		
	    Circle circle = (Circle)obj;			
		if(radius==circle.radius) { 
		return true;
		}
	   else {
			return false;
	   }
   }
}
public class ObjectExample6_2 {

	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(5);
        
        if(obj1.equals(obj2)) { //String 타입의 equlas와 혼동하면 안됨
        	System.out.println("같음");
        }else {
        	System.out.println("다름");	
        }
	}

}

/*
 * Object클래스의 equals 메소드는 두 객체를 비교할 때 객체의 필드값이 아니라
 * 참조값을 가지고 비교한다.  
 */
