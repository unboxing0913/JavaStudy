package part01.sec02.exam01;

public class PersonInformation_08 {

	private String name="gemini";
	private int age=10;
	private String socialNumber="991223-1234321";
	
	public static void main(String[] args) {
       
		PersonInformation_08 gemini= new PersonInformation_08();
		gemini.age=20;
	    gemini.printInformation(); //��� �ִ� �޼ҵ����� gemini�� .(��Ʈ)�����ؼ� �޼ҵ�
		

	}
	
	public void printInformation(){ //public => ��Ű�����о��� ��𼭵� ������ ����Ҽ��ִ�. //������ ������Ű�������� ���ٰ���
          System.out.println(name+":"+age+":"+socialNumber);
	}

}
