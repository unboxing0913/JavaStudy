package part01.sec02.exam01;

class Data1{
	int value;
	
	Data1(){
		
	}
	
}

class Data2{
	int value;
    Data2(){
    	
    }
	Data2(int x){
		value=x;
	} //��ü ������ �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻�����ڸ� ������ �ʴ´�
}

class Data3{ // �����ڰ� �ַ��ϴ��� => �ʱ�ȭ,��ü ������ ���� ���� ����
	int value; 
	Data3(int x){
		value=x;
		System.out.println(value); //�����ھȿ��� ��°���
	}
}

public class ConstructorTest_05 {

	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data2 d2=new Data2(); // �⺻�����ڸ� ���θ������ʾ����� �����Ͽ���
		Data2 d3=new Data2(10);
		Data3 d4=new Data3(100);
		System.out.println(d4.value);

	}

}
