package part01.sec02.exam02;

class Car{
	
}

class FireEngine extends Car{
	
}


public class InstanceofTest_10 {
          //객체 instanceof 클래스 => 상속 관계를 바탕으로 형변환이 가능한가? t/f
	public static void main(String[] args) { 
        FireEngine fe=new FireEngine();
        
        if(fe instanceof FireEngine) {
        	System.out.println("This is a FireEngine instance.");        	
        }
        if(fe instanceof Car) { 
        	System.out.println("This is a Car instance.");
        }
        if(fe instanceof Object) {//Object 타입은 모든타입의 최고 조상
        	System.out.println("This is an Object instance.");
        }
	}

}
