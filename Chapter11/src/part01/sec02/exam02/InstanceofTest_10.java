package part01.sec02.exam02;

class Car{
	
}

class FireEngine extends Car{
	
}


public class InstanceofTest_10 {
          //��ü instanceof Ŭ���� => ��� ���踦 �������� ����ȯ�� �����Ѱ�? t/f
	public static void main(String[] args) { 
        FireEngine fe=new FireEngine();
        
        if(fe instanceof FireEngine) {
        	System.out.println("This is a FireEngine instance.");        	
        }
        if(fe instanceof Car) { 
        	System.out.println("This is a Car instance.");
        }
        if(fe instanceof Object) {//Object Ÿ���� ���Ÿ���� �ְ� ����
        	System.out.println("This is an Object instance.");
        }
	}

}
