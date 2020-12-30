package part01.sec01.exam02;

class Circle{
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	/*public boolean equals(Object obj) { //���������� �θ�Ÿ�� Object�� ������
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
	public boolean equals(Object obj) { //���������� �θ�Ÿ�� Object�� ������
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
        
        if(obj1.equals(obj2)) { //String Ÿ���� equlas�� ȥ���ϸ� �ȵ�
        	System.out.println("����");
        }else {
        	System.out.println("�ٸ�");	
        }
	}

}

/*
 * ObjectŬ������ equals �޼ҵ�� �� ��ü�� ���� �� ��ü�� �ʵ尪�� �ƴ϶�
 * �������� ������ ���Ѵ�.  
 */
